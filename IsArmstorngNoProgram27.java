package practicequestion;

public class IsArmstorngNoProgram27 {
	public static void main(String[] args) {
		int n=1634;
		int temp=n;
		int count=0;
		int j;
		double sum=0;
		while(temp>10) {
			temp=temp/10;
			count++;
		}
		count++;
		temp=n;
		for(int i=0;i<count;i++) {
			j=temp%10;
			temp=temp/10;
			sum=sum+Math.pow(j,count);
		}
		if(sum==n) {
			System.out.println("Number is Armstrong number");
		}else {
			System.out.println("Number is not Armstrong number");
		}
	}
}
