package practicequestion;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap94 {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> lmap=new LinkedHashMap<Integer,String>();
		lmap.put(100, "Raj");
		lmap.put(101, "Rani");
		lmap.put(102, "Mohan");
		lmap.put(103, "Meena");
		
		for(Map.Entry m:lmap.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
