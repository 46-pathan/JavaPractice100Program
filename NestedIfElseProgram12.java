package practicequestion;

public class NestedIfElseProgram12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int marks=67;
		if(marks>90) {
			System.out.println("Your grade is A+");
		}else if(marks>80) {
			System.out.println("Your grade is A");
		}else if(marks>70) {
			System.out.println("Your grade is B+");
		}else if(marks>50) {
			System.out.println("Your grade is C");
		}else if(marks>45) {
			System.out.println("Your grade is D");
		}else{
			System.out.println("You Failed Exam. ");
		}
	}

}
