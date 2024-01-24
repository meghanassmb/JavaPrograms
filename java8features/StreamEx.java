package java8features;

import java.util.ArrayList;

public class StreamEx {

	public static void main(String[] args) {
		// TODO Auto-generated method 
		ArrayList<String>list = new ArrayList<>();
		list.add("Sakshi");
		list.add("Karthikadevi");
		list.add("Rincy");
		list.add("Sneha");
		list.add("Hemalatha");
		list.add("Darshini");
		
		//count names with length less than 7
		//without using stream api
		int count=0;
		for(String string : list) {
			if(string.length()<7) {
				count++;
			}
		}
		
		System.out.println("There are "+count+" strings with length less than 7");
		
		//with stream api
		long count1 = list.stream().filter(str -> str.length()<7).count();
		System.out.println("There are "+count1+" strings with length less than 7");
		


	}

}
