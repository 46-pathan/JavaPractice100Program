package practicequestion;

import java.io.FileInputStream;

public class ReadFromTextFile71 {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin=new FileInputStream("C:\\Users\\AAREFABANU\\Desktop\\testout.txt");
			int i=fin.read();
			System.out.println((char)i);
			fin.close();
		}catch(Exception e) {
			System.out.println(e);
		}

	}

}
