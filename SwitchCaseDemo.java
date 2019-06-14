//Java Program to demonstrate Switch case
public class SwitchCaseDemo 
{
	public static void main(String[] args) 
	{
		int day=5;
		String NameofDay;
		//Switch Case with int data type
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
		System.out.println(NameofDay);
	}
}
