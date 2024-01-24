package classesandobjects4;

public class Arithmetic {
	int a,b,c,d,e,f;
	
	public Arithmetic()
	{
		a=10;
		b=5;
	}
	public Arithmetic(int a,int b)
	{
		this.a = a;
		this.b = b;
		
	}
	public void add()
	{
		c = a+b;
	}
	public void sub()
	{
		d = a-b;
	}
	public void mul()
	{
		e = a*b;
	}
	public void div()
	{
		f = a/b;
	}
	public void display()
	{
		System.out.println("a" +a);
		System.out.println("b" +b);
		System.out.println("c : " +c);
		System.out.println("d : " +d);
		System.out.println("e : "  +e);
		System.out.println("f : " +f);
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic arithmetic1 = new Arithmetic();
		arithmetic1.add();
		arithmetic1.sub();
		arithmetic1.mul();
		arithmetic1.div();
		arithmetic1.display();
		
		Arithmetic arithmetic2 = new Arithmetic(5,5);
		arithmetic2.add();
		arithmetic2.sub();
		arithmetic2.mul();
		arithmetic2.div();
		arithmetic2.display();
		
}

}
