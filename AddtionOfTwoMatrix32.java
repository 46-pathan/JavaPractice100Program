package practicequestion;

public class AddtionOfTwoMatrix32 {

	public static void main(String[] args) {
		int[][] a1= {{1,2},{1,2}};
		int[][] a2= {{2,1},{2,1}};
		
		int l=a1.length;
		int l1=a1[0].length;
		int[][] a3=new int[l][l1];
		
		for(int i=0;i<l;i++) {
			for(int j=0;j<l1;j++) {
				a3[i][j]=a1[i][j]+a2[i][j];
			}
		}
		for(int[] a:a3) {
			for(int b:a) {
				System.out.print(b+" ");
			}
			System.out.println();
		}
		

	}

}
