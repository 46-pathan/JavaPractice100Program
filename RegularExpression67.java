package practicequestion;

import java.util.regex.*;

public class RegularExpression67 {

	public static void main(String[] args) {
		
		Pattern pattern=Pattern.compile(".s");
		Matcher matcher=pattern.matcher("as");
		boolean b=matcher.matches();
		
		boolean b1=Pattern.compile(".s").matcher("as").matches();
		
		boolean b2=Pattern.matches(".s", "as");
		
		System.out.println(b+" "+b1+" "+b2);

	}

}
