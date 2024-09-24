package practicequestion;

public class ReverseStringProgram30 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="HelloWorld";
		String revstr="";
		int length=str.length();
		for(int i=length-1;i>=0;i--) {
			revstr=revstr+str.charAt(i);
		}
		System.out.println(revstr);

	}

}
