package practicequestion;

public class IsPalindromNumberProgram31 {

	public static void main(String[] args) {
		int number=121;
		int revnumber=0;
		int temp=number;
		
		while(temp>10) {
			revnumber=(revnumber*10)+temp%10;
			temp=temp/10;
		}
		revnumber=(revnumber*10)+temp;
		System.out.println(revnumber);
		
		if(revnumber==number) {
			System.out.println("Number is Palindrom");
		}else {
			System.out.println("Number is not Palindrom");
		}

	}

}
