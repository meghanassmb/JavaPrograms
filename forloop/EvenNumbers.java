package forloop;

public class EvenNumbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		for (int i = 51; i <= 99; i++) {
			if (i % 2 == 0) {

				sum = sum + i;
			}
		}
		System.out.println("sum " + sum);
	}
}
	