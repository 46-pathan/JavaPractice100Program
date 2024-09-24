package practicequestion;

public class CompareTwoString15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="zHelloWorl";
		String s2="HelloWorllnew";
		
		if(s1.compareTo(s2)>0) {
			System.out.println("First String is greater");
		}else if(s2.compareTo(s1)>0) {
			System.out.println("Second String is greater");
		}else {
			System.out.println("Both are equal");
		}
	}
}
