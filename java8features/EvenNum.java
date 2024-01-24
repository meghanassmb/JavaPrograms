package java8features;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list = new ArrayList();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
      
		
	    List<Integer> list1 = list.stream().filter(n -> n%2 == 0).collect(Collectors.toList());
	    System.out.println(list1);
	}

}
