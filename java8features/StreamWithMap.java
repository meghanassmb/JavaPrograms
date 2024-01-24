package java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamWithMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> marks = new ArrayList<>();
		marks.add(56);
		marks.add(72);
		marks.add(45);
		marks.add(84);
		marks.add(66);
		

		System.out.println("marks before grace : "+marks);
		
		// i want to grace marks by 10
		List<Integer>updatedMarks = marks.stream().map(i -> i+10).collect(Collectors.toList());
		
		System.out.println("marks after grace : "+updatedMarks);
	}

}
