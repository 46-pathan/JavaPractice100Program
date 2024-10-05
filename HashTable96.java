package practicequestion;

import java.util.Hashtable;
import java.util.Map;

public class HashTable96 {

	public static void main(String[] args) {
		Hashtable<Integer,String> ht=new Hashtable<Integer,String>();
		
		ht.put(100, "Raj");
		ht.put(101, "Rani");
		ht.put(102, "Mohan");
		ht.put(103, "Meena");
		
		for(Map.Entry m:ht.entrySet()) {
			System.out.println(m.getKey()+" "+m.getValue());
		}

	}

}
