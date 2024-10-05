package practicequestion;

import java.util.Map;
import java.util.HashMap;

public class HashmapwithMapInterface93 {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(100, "Raj");
		map.put(101, "Rani");
		map.put(102, "Mohan");
		map.put(103, "Meena");
		
		for(Map.Entry m:map.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}
	}

}
