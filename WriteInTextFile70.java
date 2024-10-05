package practicequestion;

import java.io.FileOutputStream;

public class WriteInTextFile70 {

	public static void main(String[] args) {
		try {
			FileOutputStream fout=new FileOutputStream("C:\\Users\\AAREFABANU\\Desktop\\testout.txt");
			fout.write(65);
			fout.close();
			System.out.println("Success");
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
