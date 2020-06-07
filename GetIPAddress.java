import java.net.InetAddress;
public class GetIPAddress 
{
	public static void main(String[] args) throws Exception
	{
		/* public static InetAddress getLocalHost()
	       * throws UnknownHostException: Returns the address 
	       * of the local host. This is achieved by retrieving 
	       * the name of the host from the system, then resolving 
	       * that name into an InetAddress.
	       */
		
		InetAddress myIP = InetAddress.getLocalHost();
		
		System.out.println("My IP Address is: ");
		System.out.println(myIP.getHostAddress());
	}

}
