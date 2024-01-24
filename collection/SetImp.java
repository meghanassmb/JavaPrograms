package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
//import java.util.Set;

public class SetImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hashset = new HashSet<>();
		hashset.add("Riya");
		hashset.add("Ravi");
		hashset.add("Riya");
		hashset.add("Meera");
		hashset.add(null);
		
		System.out.println("implementing HashSet : ");
		for(String string : hashset)
		{
			System.out.println(string);
			
		}
		
		
		LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
		
		linkedHashSet.add("Mango");
		linkedHashSet.add("Banana");
		linkedHashSet.add("Mango");
		linkedHashSet.add("Gauva");
		linkedHashSet.add(null);
		System.out.println("implementing LinkedHashSet : ");
		
		System.out.println("linkedHashSet : "+linkedHashSet);
		
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("Pizza");
		treeSet.add("Coffee");
		treeSet.add("Burger");
		System.out.println("implementing TreeSet : ");
		System.out.println("TreeSet : "+treeSet);
		
		
		
		

	}

}
