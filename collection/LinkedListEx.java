package collection;


import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Apple");
		linkedList.add("Mango");
		linkedList.add("Grapes");
		linkedList.add(1,"Banana");
		linkedList.add("Apple");
		linkedList.add(null);
		for(String string : linkedList) {
			System.out.println(string);
		}
		LinkedList<String> linkedList2 = new LinkedList<>();
		linkedList2.add("Jasmine");
		linkedList2.add("Lilly");
		
		linkedList.addAll(linkedList2);
		System.out.println("adding list2 in list1 : \n"+linkedList);
	}

}
