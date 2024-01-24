package collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> deque = new ArrayDeque<>();
		deque.add("Coffee");
		deque.offer("Tea");
		deque.addFirst("Ice-cream");
		deque.add("Sandwitch");
		deque.offer("Burger");
		deque.addLast("Pizza");

		System.out.println("deque : " + deque);

		System.out.println("removing first element : " + deque.pollFirst());
		
		System.out.println("deque : " + deque);

		System.out.println("Removing last element : " + deque.pollLast());
		
		System.out.println("deque : " + deque);

	}

}
