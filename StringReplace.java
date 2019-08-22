//Java Program to Replace the Character of a String
public class StringReplace 
{
	public static void main(String[] args) 
	{
		String name="Yogendra Pratap Singh";
		System.out.println(name.replace('Y', 'y'));                          //yogendra Pratap Singh
		System.out.println(name.replace('P', 'p'));                         //Yogendra pratap Singh
		System.out.println(name.replace('S', 's'));                        //Yogendra Pratap singh
		System.out.println(name.replaceAll("Pratap", "PRATAP"));          //Yogendra PRATAP Singh
	}

}
