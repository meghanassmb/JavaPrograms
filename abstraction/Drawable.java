package abstraction;

public abstract class Drawable {
	
	public Drawable()
	{
		System.out.println("constructor inside abstract class");
	}
	
	public abstract void area();
	 
	public void print()
	{
		System.out.println("Inside non-abstract method of abstract class");
	}

}
