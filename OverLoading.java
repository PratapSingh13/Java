//Java Program to Show the Method Overloading
/*Same Class
 * Same Name
 * Different Argument
 *       - No. of Argument must be Different
 *       - Sequence of Argument must be Different
 *       - Type of Argument must be Different
 *    From the above Points of 'Different Argument' anyone point must be satisfy    
 */
public class OverLoading 
{

	void show()
	{
		System.out.println("Hii You are Using FIRST Block of Method");
	}
	void show(int a)
	{
		System.out.println("Hii You are Using Second Block of Method");
	}
	public static void main(String[] args) 
	{
		OverLoading obj=new OverLoading();
		obj.show();            //To call the First Method
		obj.show(10);          //To call the Second Method
		

	}

}
