package switchcaseprograms;

import java.util.Scanner;

public class area {

	public static void main(String[] args) {
		double radius, length, breadth, base, height;
		char ch, choice;
		try (Scanner sc = new Scanner(System.in)) {
			do {

				System.out.println("enter the choice 1 for circle \n 2 for rect \n 3 for tri \n ");
				choice = sc.next().charAt(0);

				switch (choice) {
				case '1':
					System.out.println("enter radius");
					radius = sc.nextInt();
					System.out.println(3.14f * radius * radius);
					break;
				case '2':
					System.out.println("enter length and breadth");

					length = sc.nextInt();
					breadth = sc.nextInt();
					System.out.println(length * breadth);
					break;
				case '3':
					System.out.println("enter base and height");

					base = sc.nextInt();
					height = sc.nextInt();
					System.out.println(0.5f * base * height);
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

