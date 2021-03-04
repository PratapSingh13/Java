//ArrayList class is a re-sizable array, which is found in the java.util package.
/*The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified 
 *(if you want to add or remove elements to/from an array, we have to create a new one). 
 * While elements can be added and removed from an ArrayList whenever you want. 
 * The syntax is also slightly different:
 */
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_2 
{

	public static void main(String[] args) 
	{
		ArrayList<String> car=new ArrayList<String>();
		car.add("VOLVO");
		car.add("BMW");
		car.add("AUDI");
		car.add("FORD");
		for(int i=0; i<car.size(); i++)
		{
			System.out.println(car.get(i));
		}
	}
}
