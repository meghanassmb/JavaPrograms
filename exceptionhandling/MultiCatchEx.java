package exceptionhandling;

public class MultiCatchEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a[] = new int[10];
			a[12] = 25/0;
		} 
		catch (ArithmeticException e) {
			e.printStackTrace();
		}
		catch (ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
		}
		catch (Exception e) {
			e.printStackTrace();
		}

System.out.println("rest of code..");

	}

}
