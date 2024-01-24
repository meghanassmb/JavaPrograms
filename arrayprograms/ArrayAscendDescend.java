package arrayprograms;

import java.util.Scanner;

//Accept 10 array elements from user print 1st 5 in ascending order and remaining in descending order
public class ArrayAscendDescend{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=10,i,temp,j;
		Scanner sc=new Scanner(System.in);
//		System.out.println("Enetr Size:");
//		size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("Enter "+size+"elements :");
		for(i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(i=0;i<3;i++)
		{
			for(j=i+1;j<4;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(i=5;i<8;i++)
		{
			for(j=i+1;j<9;j++)
			{
				if(a[i]<a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println("Array Elements are:");
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i]+"  ");
		}
		sc.close();
	}

}
