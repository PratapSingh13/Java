//Example of Single Inheritance
class Sh
{
	int length;
	int breadth;
}
public class Rectangle extends Shape
{
    int area;
    public void CalculateArea()
    {
    	area=length*breadth;
    }
	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle();
		//Assigning the values to Shape Class Attributes
		r.length=20;
		r.breadth=10;
		// Calculate Area
		r.CalculateArea();
		System.out.println("The Area of Rectangle of Length\""+r.length+"\"and Breadth\""+r.breadth+"\"is\""+r.area+"\"");

	}

}
