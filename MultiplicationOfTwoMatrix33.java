package practicequestion;

public class MultiplicationOfTwoMatrix33 {

	public static void main(String[] args) {
		
		int[][] a1= {{1,2,3},{1,2,3},{1,2,3}};
		int[][] a2= {{1,2},{2,1},{3,3}};
		
		int row1=a1.length;
		int col1=a1[0].length;
		int row2=a2.length;
		int col2=a2[0].length;
		
		if(col1==row2) {
			
			int sum=0;
			int[][] a3=new int[row1][col2];
			for(int i=0;i<row1;i++) {
				for(int j=0;j<col2;j++) {
					for(int k=0;k<col1;k++) {
						sum=sum+(a1[i][k]*a2[k][j]);				
						}
					a3[i][j]=sum;
					sum=0;
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

}
