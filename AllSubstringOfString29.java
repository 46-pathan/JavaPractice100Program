package practicequestion;

public class AllSubstringOfString29 {

	public static void main(String[] args) {
		String name="HelloWorld";
		int length=name.length();
		String sub;
		
		for(int i=0;i<length;i++) {
			for(int j=1;j<length-i;j++) {
				sub=name.substring(i, i+j);
				System.out.println(sub);
			}
		}

	}

}
