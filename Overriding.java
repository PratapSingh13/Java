//Java Program to Show the Method Overriding
/*Different Class
 * Same Name
 * Same Argument
 *       - No. of Argument must be Same
 *       - Sequence of Argument must be Same
 *       - Type of Argument must be Same
 *    From the above Points of 'Same Argument' anyone point must be satisfy    
 */
class ABC
{
	void show()
	{
		System.out.println("Hii You are Using FIRST Block of Method");
	}
}
public class Overriding extends ABC
{
	void show()
	{
		System.out.println("Hii You are Using Second Block of Method");
	}

	public static void main(String[] args) 
	{
		Overriding obj1=new Overriding();
		obj1.show();
		ABC obj2=new ABC();
		obj2.show();

	}

}
