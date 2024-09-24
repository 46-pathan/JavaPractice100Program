package practicequestion;

public class PrimeNoProgram26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=23;
		boolean isPrime=true;
		
		for(int i=2;i<=n;i++) {
			isPrime=true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime=false;
					break;
				}
			}if(isPrime==true) {
				System.out.print(" "+i);
			}
		}
	}

}
