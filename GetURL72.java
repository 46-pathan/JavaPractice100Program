package practicequestion;

import java.net.URL;

public class GetURL72 {

	public static void main(String[] args) {
		try {
			URL url=new URL("https://www.oracle.com/java");
			
			System.out.println("Protocol : "+url.getProtocol());
			System.out.println("Host name : "+url.getHost());
			System.out.println("Port number : "+url.getPort());
			System.out.println("Filename : "+url.getFile());
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
