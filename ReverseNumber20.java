package practicequestion;

public class ReverseNumber20 {

	public static void main(String[] args) {
		int number=1234;
		int reverseNumber=0;
		while(number>10) {
			reverseNumber+=number%10;
			number=number/10;
			reverseNumber*=10;
		}
		reverseNumber+=number;
		System.out.println("Reverse Number : "+reverseNumber);

	}

}
