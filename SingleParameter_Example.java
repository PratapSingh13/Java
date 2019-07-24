//A JAVA Program to create a Method that Receives a single parameter
public class SingleParameter_Example 
{
	public static void main(String[] args) 
	{
		double salary=200.00;
		double starting_wage=800.00;
		System.out.println("Demonstrating some Raises");
		predictRaise(400.00);
		predictRaise(salary);
		predictRaise(starting_wage);

	}
	public static void predictRaise(double salary)
	{
		double newSalary;
		double RAISE_RATE=1.10;
		newSalary=salary*RAISE_RATE;
		System.out.println("Current Salary: " + salary + " After Raise: "
				+ newSalary);
	}	
}
