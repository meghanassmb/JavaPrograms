package switchcaseprograms;

import java.util.Scanner;

public class SwitchDoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		char ch, choice;
		try (Scanner sc = new Scanner(System.in)) {
			do {

				System.out.println("enter two numbers");
				a = sc.nextInt();
				b = sc.nextInt();
				System.out.println("enter the choice + for add\n - for sub\n * for mul\n / for div");
				choice = sc.next().charAt(0);

				switch (choice) {
				case '+':
					System.out.println(a + b);
					break;
				case '-':
					System.out.println(a - b);
					break;
				case '*':
					System.out.println(a * b);
					break;
				case '/':
					System.out.println(a / b);
					break;
				default:
					System.out.println("invalid choice");

				}
				System.out.println("you want to continue");
				ch = sc.next().charAt(0);

			} while (ch == 'y' || ch == 'Y');
		}

	}

}


