package strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Source1 {
	public static boolean inf_string(String infStr, String toFind) {
		if (infStr.contains(toFind)) {
			return true;
		}
		if (toFind.length() < infStr.length()) {
			return false;
		}

		String replaceInfstr = infStr;
		while (replaceInfstr.length() < toFind.length() * 3) {
			replaceInfstr += infStr;
		}
		return replaceInfstr.contains(toFind);
	}

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int t;
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String str = input.readLine();
		t = str.length();
		if (t > 0) {
			String words[] = str.split(" ");
			String a = words[0];
			String b = words[1];
			if (inf_string(a, b)) {
				System.out.println("Yes");
			} else
				System.out.println("No");
		}

	}

}
