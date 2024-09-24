package practicequestion;

public class TransposeOfMatrix34 {

	public static void main(String[] args) {
		int[][] a= {{1,2,3},{1,2,3}};
		int row=a.length;
		int col=a[0].length;
		
		int[][] transposeA=new int[col][row];
		
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				transposeA[j][i]=a[i][j];
			}
		}
		
		for(int[] i:transposeA) {
			for(int j:i) {
				System.out.print(j+" ");
			}
			System.out.println();
		}

	}

}
