package seriesprograms;

import java.util.Scanner;
// 1/1! + 2/2! + 3/3! + .... + n/n! = ?

public class series10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		double sum = 0.00,fact;
		System.out.println("Enter the number : ");
		n = sc.nextInt();
		
		for(double i= 1;i<=n;i++)
		{
			fact = 1;
			for(double j=1;j<=i;j++)
			{
				fact= fact*j;
			}
			sum = sum+(i/fact);
			System.out.print((int)i+ "/" + (int)i+ "!");
			if(i<n)
			{
				System.out.print(" + ");
			}
		}
		System.out.println(" = "+sum);

	}

}
