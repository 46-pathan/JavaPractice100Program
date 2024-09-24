package practicequestion;

public class PrintFloydTriangle28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		int count=1;
		for(int i=1;i<=5;i++) {
			for(int j=0;j<i;j++) {
				System.out.print(count+" ");
				count++;
			}
			System.out.println();
		}

	}

}
