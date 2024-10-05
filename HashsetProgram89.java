package practicequestion;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetProgram89 {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("Kamal");
		set.add("Raj");
		set.add("Rani");
		set.add("Meena");
		
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
