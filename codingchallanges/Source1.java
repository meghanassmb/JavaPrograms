package codingchallanges;

import java.util.Scanner;
import java.util.stream.Collectors;

public class Source1 {
	
	public String insertSpace(String s) {
		return s.chars().mapToObj(ch -> (char)ch+" ").collect(Collectors.joining());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		Source1 s1 = new Source1();
		String result = s1.insertSpace(input);
		System.out.println(result);
		sc.close();

	}

}
