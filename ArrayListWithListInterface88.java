package practicequestion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListWithListInterface88 {

	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("Kamal");
		list.add("Neem");
		list.add("Salman");
		list.add("Meena");
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
