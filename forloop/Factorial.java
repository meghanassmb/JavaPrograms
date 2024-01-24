package forloop;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double fact = 1;
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		
		for(int i = 1;i<=n;i++)
		{
			fact=fact*i;
		}
			System.out.println("factorial of a given number is  " + fact);
		
	}
}