package strings;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class InAmsterdam {
	public int countAm(String str) {
		int result = 0;
		String count[] = str.split(" ");
		for (int i = 0; i < count.length; i++) {
			if (count[i].equalsIgnoreCase("am")) {
				result = result + 1;
			}
		}
		return result;
	}
}

public class Source {

	public static void main(String[] args) throws Exception {

		BufferedReader sc = new BufferedReader(new InputStreamReader(System.in));
		String string = sc.readLine();
		InAmsterdam ele = new InAmsterdam();
		try {
			int display = ele.countAm(string);
			System.out.println(display);
		} catch (Exception e) {

		}
	}
}
