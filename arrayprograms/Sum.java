package arrayprograms;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;int sum=0;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the size of array");
			n =sc.nextInt();
			int a[]= new int[n];
			System.out.println("enter the array elements");
			
			
			for(int i=0;i<n;i++) {
				
				a[i]= sc.nextInt();
				sum= sum+a[i];
			}
		}
		System.out.println("The sum of array elements is : " + sum);
	}

}
