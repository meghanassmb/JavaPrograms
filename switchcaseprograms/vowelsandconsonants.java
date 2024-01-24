package switchcaseprograms;

import java.util.Scanner;

public class vowelsandconsonants {
	public static void main(String[] args) {
	char z;
	char ch, choice;
	{
		try (Scanner sc = new Scanner(System.in)) {
			do {

				System.out.println("enter the character");
				z = sc.next().charAt(0);

				System.out.println("enter the choice 1  to check char is vowel or consonant \n ");
				choice = sc.next().charAt(0);

				switch (choice) {
				case '1':
					if (z == 'a' || z == 'e' || z == 'i' || z == 'o' || z == 'u' || z == 'A' || z == 'E' || z == 'I'
							|| z == 'O' || z == 'U')
						System.out.println(z  + " is vowel " );
					else
						System.out.println(z  + " is consonant " );
					
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
}

