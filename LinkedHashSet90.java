package practicequestion;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSet90 {

	public static void main(String[] args) {
		LinkedHashSet<String> lset=new LinkedHashSet<String>();
		
		lset.add("Mohan");
		lset.add("Raj");
		lset.add("Rani");
		lset.add("Meena");
		
		Iterator itr=lset.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
