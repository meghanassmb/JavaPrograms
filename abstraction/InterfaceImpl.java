package abstraction;

public class InterfaceImpl implements Addable,Printable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceImpl impl = new InterfaceImpl();
		impl.print();
		Addable.add(12,5);
		impl.Mul(5, 8);
		impl.div(45.5, 4);
		
	}
	
	@Override
	public void print()
	{
		float r = 10;
		System.out.println("Area :" +(PI * r*r));
		
	}
	
	@Override
	public void div(double a, double b)
	{
		System.out.println("Div :" +(a/b));
	}
	@Override
	public void show() {
	
		Addable.super.show();
	}

}
