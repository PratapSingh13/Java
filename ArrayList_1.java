//ArrayList class is a re-sizable array, which is found in the java.util package.
/*The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified 
 * (if you want to add or remove elements to/from an array, we have to create a new one). 
 * While elements can be added and removed from an ArrayList whenever you want. 
 * The syntax is also slightly different:
 */
import java.util.ArrayList;
import java.util.Collections;

public class ArrayList_1 
{
	public static void main(String[] args) 
	{
		ArrayList<String> car=new ArrayList<String>();
		car.add("VOLVO");
		car.add("BMW");
		car.add("AUDI");
		car.add("FORD");
		System.out.println(car);                 //[VOLVO, BMW, AUDI, FORD]
		//We can modify our List by using set(); method
		System.out.println(car.set(0, "SUZUKI"));
		System.out.println(car);                //[SUZUKI, BMW, AUDI, FORD]
		//We can access element by using get(); method
		System.out.println(car.get(1));         //BMW
		//We can Remove element by using remove(): method
		System.out.println(car.remove(0));
		System.out.println(car);                //[BMW, AUDI, FORD]
		//We can find Size of ArrayList by using size(); method
		System.out.println(car.size());         // 3
	}
}
