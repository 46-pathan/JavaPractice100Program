package practicequestion;

import java.util.Map;
import java.util.TreeMap;

public class TreeMap95 {

	public static void main(String[] args) {
		TreeMap<Integer,String> map=new TreeMap<Integer,String>();
		map.put(100, "Raj");
		map.put(101, "Rani");
		map.put(102, "Mohan");
		map.put(103, "Meena");
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
