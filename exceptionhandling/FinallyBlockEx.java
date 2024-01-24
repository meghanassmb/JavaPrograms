package exceptionhandling;

public class FinallyBlockEx {

	public static void main(String[] args) {
		System.out.println("case 1 : where exception doesn't occur");
		try {
			int a = 25/5;
			System.out.println("div :" +a);
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("case 1 : finally block always executes");
		}
		System.out.println("case 1 : rest of code...");
		System.out.println("........................................");
		 
		System.out.println("case 2: where exception  occurs and handled");
		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("case 2 : finally block always executes");
		}
		System.out.println("case 2 : rest of code...");
		System.out.println("........................................");
		
		
		System.out.println("case 3 : where exception occurs but doesn't handled");
		try {
			int a = 25/0;
			System.out.println("div :" +a);
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("case 3 : finally block always executes");
		}
		System.out.println("case 3 : rest of code...");
		System.out.println("........................................");

	}

}
