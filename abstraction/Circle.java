package abstraction;

public class Circle extends Drawable {
	
	@Override
	public void area()
	{
		System.out.println("inside overridden method");
		
	}
	
	public static void main(String[] args) {
		Circle c = new Circle();
		c.area();
		c.print();
		
	}

}
