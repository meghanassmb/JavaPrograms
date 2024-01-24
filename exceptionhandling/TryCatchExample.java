package exceptionhandling;

public class TryCatchExample {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			int a= 25/0;
			System.out.println(a);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
System.out.println("rest of code....");
	}

}
