//Java Program to Demonstrate Switch case 
//With Multiple cases without Break Statement
public class Without_Break_statement 
{
	public static void main(String[] ar
	{
		int day=3;
		String NameofDay;
		String DayType;
		switch(day)
		{
		case 1:
			NameofDay = "Monday";
			break;
		case 2:
			NameofDay = "Tuesday";
			break;
		case 3:
			NameofDay = "Wednesday";
			break;
		case 4:
			NameofDay = "Thursday";
			break;
		case 5:
			NameofDay = "Friday";
			break;
		case 6:
			NameofDay = "Saturday";
			break;
		case 7:
			NameofDay = "Sunday";
			break;
		default:
			NameofDay = "Invalid Day";
		}
		switch(day)
		{
		//Here Multiple Cases without Break
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			DayType = "WeekDay";
			break;
		case 6:
		case 7:
			DayType = "Weekend";
			break;
			
		default:
		DayType = "Invalid Day Type";		
		}
		System.out.println(NameofDay + " Is a " + DayType);
	}

}
