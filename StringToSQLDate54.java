package practicequestion;

import java.sql.Date;

public class StringToSQLDate54 {

	public static void main(String[] args) {
		
		String str="2023-03-23";
		Date date=Date.valueOf(str);
		System.out.println(date);

	}

}
