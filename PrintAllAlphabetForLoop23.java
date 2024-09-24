package practicequestion;

public class PrintAllAlphabetForLoop23 {

	public static void main(String[] args) {
		char i='a';
		char I='A';
		for(int j=0;j<26;j++) {
			System.out.print(i+++" ");
		}
		System.out.println();
		for(int j=0;j<26;j++) {
			System.out.print(I++ + " ");
		}

	}

}
