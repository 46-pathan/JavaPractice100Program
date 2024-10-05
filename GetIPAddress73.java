package practicequestion;

import java.net.InetAddress;

public class GetIPAddress73 {

	public static void main(String[] args) {
		try {
			
			InetAddress ip=InetAddress.getByName("www.oracle.com");
			
			System.out.println("Host name: "+ip.getHostName());
			System.out.println("IP Address: "+ip.getHostAddress());
		}catch(Exception e) {
			System.out.println(e);
		}
		

	}

}
