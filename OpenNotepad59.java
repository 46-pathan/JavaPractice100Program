package practicequestion;

import java.io.IOException;

public class OpenNotepad59 {

	public static void main(String[] args) {
		Runtime rs=Runtime.getRuntime();
		try {
			rs.exec("notepad");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
