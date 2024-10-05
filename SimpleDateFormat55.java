package practicequestion;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormat55 {

	public static void main(String[] args) {
		Date date=new Date();
		System.out.println("Format : Date");
		SimpleDateFormat formatter=new SimpleDateFormat("MM/dd/yyyy");
		String strdate=formatter.format(date);
		System.out.println("MM/dd/yyyy : "+strdate);
		
		formatter=new SimpleDateFormat("dd-M-yyyy hh:mm:ss");
		strdate=formatter.format(date);
		System.out.println("dd-M-yyyy hh:mm:ss : "+strdate);
		
		formatter=new SimpleDateFormat("dd MMMM yyyy");
		strdate=formatter.format(date);
		System.out.println("dd MMMM yyyy : "+strdate);
		
		formatter=new SimpleDateFormat("dd MMMM yyyy zzzz");
		strdate=formatter.format(date);
		System.out.println("dd MMMM yyyy zzzz: "+strdate);
		
		formatter=new SimpleDateFormat("E, dd MMM yyyy HH:mm:ss z");
		strdate=formatter.format(date);
		System.out.println("E, dd MMM yyyy HH:mm:ss z : "+strdate);
		

	}

}
