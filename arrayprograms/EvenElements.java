package arrayprograms;

import java.util.Scanner;

public class EvenElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter the size of array");
			n = sc.nextInt();
			int a[] = new int[n];
			System.out.println("enter the array elements");
			for(int i=0;i<n;i++)
	        {
	          a[i]=sc.nextInt();    //Initialize the array elements
	        }
	        //Print the even elements
	        System.out.println("The Even Elements are...");
	        for(int i=0;i<n;i++)
	        {
	            if(a[i]%2==0)   //Check whether even or not
	            {
	                System.out.print(a[i]+" ");
	            }
	        }
	        System.out.println(" ");
	        
	        
	    }
	}
	}
