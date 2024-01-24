package classesandobjects3;

public class Area {
	
	double len,width,side,base,height,rad,circle,square,rect,tri;
	
	public Area()
	{
		len = 15;
		width = 20;
		side = 4;
		base = 6;
		height = 9;
		rad = 5;
			
	}
	public Area(double len,double width,double side,double base,double height,double rad)
	{
		this.len=len;
		this.width=width;
		this.side=side;
		this.base=base;
		this.height=height;
		this.rad=rad;
		
	}
	
	public void circle()
	{
	 circle = 3.14*rad*rad;
	}
	
	public void square()
	{
		square= side*side;
		
	}
	
	public void rect()
	{
		rect = len*width;
	}
	
	public void tri()
	{
		tri = (base*height)/2;
	}
	public void display()
	{
		System.out.println("circle" +circle);
		System.out.println("square" +square);
		System.out.println("rect" +rect);
		System.out.println("tri" + tri);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area area1 = new Area();
		area1.circle();
		area1.square();
		area1.rect();
		area1.tri();
		area1.display();
		
		Area area2 = new Area(7,4,6,8,6,9);
		area2.circle();
		area2.square();
		area2.rect();
		area2.tri();
		area2.display();

	}

}
