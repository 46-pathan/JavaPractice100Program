package practicequestion;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue92 {

	public static void main(String[] args) {
		PriorityQueue<String> queue=new PriorityQueue<String>();
		
		queue.add("Raj");
		queue.add("Rani");
		queue.add("Mohan");
		queue.add("Meena");
		
		System.out.println(queue.element());
		System.out.println(queue.peek());
		
		Iterator itr=queue.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		queue.remove();
		queue.poll();
		
		Iterator itr2=queue.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
