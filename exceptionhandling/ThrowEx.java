package exceptionhandling;

public class ThrowEx {
	
	public static void checkage(int age)
	{
		if(age >= 18)
			System.out.println("Eligible for voting");
		else
			throw new ArithmeticException("Age is not valid");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkage(15);
		} catch (ArithmeticException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("rest of code.....");

	}

}
