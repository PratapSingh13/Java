class Main
{
	private int serialNum;
	private int age;
	private String name;
	public int getEmpSerialNum()
	{
		return serialNum;
	}
	public String getEmpName()
	{
		return name;
	}
	public int getEmpAge()
	{
		return age;
	}
	public void setEmpAge(int newValue)
	{
		age=newValue;
	}
	public void setEmpName(String newValue)
	{
		name=newValue;
	}
	public void setEmpSSN(int newValue)
	{
		serialNum=newValue;
	}
}
public class Encapsulation_Demo {

	public static void main(String[] args) 
	{
		Main obj=new Main();
		obj.setEmpName("PRATAP");
		obj.setEmpAge(21);
		obj.setEmpSSN(1802914980);
		System.out.println("Employee Name:"+obj.getEmpName());
		System.out.println("Employee Serial Number:"+obj.getEmpSerialNum());
		System.out.println("Emploee Age:"+obj.getEmpAge());
	}
}
