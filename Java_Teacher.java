//Inheritance Example
class Teacher
{
	String Designation="Teacher";
	String CollegeName="KIET"
	public void does()
	{
		System.out.println("Teaching");
	}
}
public class Java_Teacher extends Teacher
{
    String mainsubject="JAVA";	
	public static void main(String[] args) 
	{
		Java_Teacher obj=new Java_Teacher();
		System.out.println(obj.CollegeName);
		System.out.println(obj.Designation);
		System.out.println(obj.mainsubject);
		obj.does();
	}
}
