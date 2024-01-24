package patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a, b, c, i, j;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		for (i = 1; i <= a; i++) {
			for (j = 1; j <= a - i; j++)// add spaces
			{
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++)// add number
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}

		for (i = 1; i <= b; i++) {
			for (j = 1; j <= b - i; j++)// add spaces
			{
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++)// add number
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}

		for (i = 1; i <= c; i++) {
			for (j = 1; j <= c - i; j++)// add spaces
			{
				System.out.print(" ");
			}
			for (j = 1; j <= i; j++)// add number
			{
				System.out.print(i + " ");
			}
			System.out.println();
		}

	}

}



