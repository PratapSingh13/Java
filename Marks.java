//Example of Instance Variable

public class Marks 
{
	//These Variables are Instance Variable
	//These Variable are in only class not inside any function
    int engMarks;
    int mathsMarks;
    int phyMarks;
}
 
class MarksDemo
{
	
	public static void main(String[] args) 
	{
		//First Object
		Marks obj1=new Marks();
		obj1.engMarks=50;
		obj1.mathsMarks=80;
		obj1.phyMarks=90;
		
		//Second Object
		Marks obj2=new Marks();
		obj2.engMarks=80;
		obj2.mathsMarks=60;
		obj2.phyMarks=85;
		
		//Displaying Marks for First Object
		System.out.println("Marks for First Object:");
		System.out.println(obj1.engMarks); 
		System.out.println(obj1.mathsMarks);
		System.out.println(obj1.phyMarks);
		
		//Displaying Marks for Second Object
		System.out.println("Marks for Second object:");
		System.out.println(obj2.engMarks);
		System.out.println(obj2.mathsMarks);
		System.out.println(obj2.phyMarks);
		

	}

}
