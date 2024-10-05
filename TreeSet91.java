package practicequestion;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet91 {

	public static void main(String[] args) {
		TreeSet<String> set=new TreeSet<String>();
		
		set.add("Raj");
		set.add("Rani");
		set.add("Mohan");
		set.add("Kajol");
		
		Iterator itr=set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
