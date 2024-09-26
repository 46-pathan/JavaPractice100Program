package practicequestion;

public class ExceptionHandlingProgram49 {

	public static void main(String[] args) {
		int a=6;
		int b=0;
		double result;
		
		try {
			result=a/b;
			System.out.println("Result is : "+result);
		}catch(ArithmeticException e) {
			System.out.println(e);
		}

	}

}
