package codingchallanges;


import java.util.Scanner;

public class Source {

	public int getSecondSmallest(int arr[]) {

		int min = 0, i, j;

		for (i = 0; i < arr.length; i++) {
			for (j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					min = arr[i];
					arr[i] = arr[j];
					arr[j] = min;
				}
			}
		}
		return arr[1];
	}

	public static void main(String[] args) {

		Source s1 = new Source();
		int n;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int output = s1.getSecondSmallest(arr);
		System.out.println(output);

		sc.close();
	}
}
