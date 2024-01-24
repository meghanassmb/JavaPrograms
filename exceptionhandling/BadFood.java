package exceptionhandling;

public class BadFood {
	
	public static void checkFruit(String fruitName) throws BadFoodException
	{
		if(fruitName.equalsIgnoreCase("Mango"))
			System.out.println("I like "+fruitName);
		else
			throw new BadFoodException("I don't like "+fruitName);
			
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			checkFruit("Grapes");
		} catch (BadFoodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 
		System.out.println("rest of code...");
	}

}
