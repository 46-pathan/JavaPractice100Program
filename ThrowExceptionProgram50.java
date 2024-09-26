package practicequestion;

public class ThrowExceptionProgram50 {
	
	static void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Not valid");
		}else {
			System.out.println("Valid");
		}
	}

	public static void main(String[] args) {
		validate(13);
		System.out.println("Code end");

	}

}
