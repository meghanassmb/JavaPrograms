package exceptionhandling;

public class Source {

	public static void checkAge(int age) throws MyException {
		if (age >= 15)
			System.out.println("Valid");
		else
			throw new MyException("Not valid");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			checkAge(12);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		System.out.println("rest of code.....");

	}

}

	
		
	

	


