package practicequestion;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListProgram87 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		
		list.add("John");
		list.add("Mukesh");
		list.add("Mina");
		list.add("Nilesh");
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
