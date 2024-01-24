package abstraction;

public interface Addable {
	float PI = 3.14f;
	
	void print();
	
	 static void add(int a ,int b)
	 {
		 System.out.println("Add :" +(a+b));
		 
	 }
	 
	 default void Mul(int a ,int b)
	 {
		 System.out.println("Mul : " +(a*b));
	 }
	 default void show()
	 {
		 System.out.println("Inside show :"+add );
	 }
	 


}