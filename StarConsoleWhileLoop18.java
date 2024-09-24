package practicequestion;

public class StarConsoleWhileLoop18 {

	public static void main(String[] args) {
		int rows=4;
		int numberOfStar=5;
		
		int i=1;
		while(i<=rows) {
			int j=1;
			while(j<=numberOfStar) {
				System.out.print("* ");
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
