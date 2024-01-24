package arrayprograms;

import java.util.Scanner;

public class SumProduct {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,sum=0;int product=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the size of an array");
		n = sc.nextInt();
		int a[] = new int[n];
		System.out.println("enter the array elements");
		for(int i =0;i<n;i++) 
		{
			a[i]=sc.nextInt();
		}
		//sum of even elements
		for(int i =0;i<n;i++) 
		{
			if(a[i]%2 == 0)
			{
				System.out.println("the even elements are : " + a[i]);
				sum= sum+a[i];
			}
		}
		System.out.println("sum of even elements is : " + sum);
		System.out.println(".................................");
		
		//product  of odd elements
				for(int i =0;i<n;i++) 
				{
					if(a[i]%2 != 0)
					{
						System.out.println("the odd elements are : " + a[i]);
						product= product * a[i];
					}
					
				}
				System.out.println("product of odd elements is : " + product);
		
		
				
				
sc.close();
	}
	
	}

