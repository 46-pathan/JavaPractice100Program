package practicequestion;

public class FindMaxNumberProgram9 {

	public static void main(String[] args) {
		int x=3;
		int y=5;
		int z=4;
		if(x>y&&x>z) {
			System.out.println("Largest number is : "+x);
		}else if(y>x&&y>z) {
			System.out.println("Largest number is : "+y);
		}else {
			System.out.println("Largest number is : "+z);
		}
	}
}
