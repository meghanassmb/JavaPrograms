package classesandobjects;

public class Discount extends Customer {
	
	public Discount()
	{
		System.out.println("discount" +discount);
	}
	@Override
	public void display()
	{
		super.display();
		System.out.println("discount" +discount);
	}
}