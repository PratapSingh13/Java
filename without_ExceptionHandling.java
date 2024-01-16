//Problem without Exception Handling
public class without_ExceptionHandling
{
	public static void main(String[] args) 
	{
		//Here Exception may occur
		int data=50/0;        //Exception
		System.out.println("Rest of the Code");
	}
}
/* Rest of the Code is not executed
 * (In such case, the Rest of the Code statement is not Printed)
 */
/*There can be 100 lines of code after exception. 
 * so all the code after exception will not be executed
 */
