package collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> queue = new PriorityQueue<>();
		queue.add("Jasmine");
		queue.offer("Lotus");
		queue.add("Rose");
		queue.add("Mogra");
		queue.add("Lilly");
		
		System.out.println("Queue : " +queue);
		
		System.out.println("Head of Queue : " +queue.element());
		
		System.out.println("removing element : " +queue.remove());
		
		System.out.println("After removing Queue : " +queue);
		
		System.out.println("Removing element : " +queue.poll());
		

	}

}
