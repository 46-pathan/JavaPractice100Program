package practicequestion;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListProgram86 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("John");
		list.add("Mona");
		list.add("Mohan");
		list.add("Doe");
		
		Iterator itr=list.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}

	}

}
