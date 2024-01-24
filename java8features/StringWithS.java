package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringWithS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list = new ArrayList<>();//generic list
		list.add("Sam");
		list.add("Sindhu");
		list.add("Divya");
		list.add("Kiran");
		list.add("Shreya");
		
		// create a stream
				Stream<String>allNames =list.stream();
				
				//perform intermediate operation
				Stream<String> longNames = allNames.filter(s -> s.startsWith("S"));
				
				//perform terminal operation
				System.out.println("using forEach() : ");
				longNames.forEach(s -> System.out.println(s));
		
		

	}

}
