package alternatemethodforarea;

import java.util.Scanner;

public class Area {
	
	float area;
	Scanner sc = new Scanner(System.in);
	 
	public void circle()
	{
		float radius;
		System.out.println("enter the radius : ");
		radius = sc.nextFloat();
		area = 3.14f * radius * radius;
		System.out.println("Area of circle : " +area);
	}
	
	public int square()
	{
		int side;
		System.out.println("enter a side : ");
		side = sc.nextInt();
		return side * side;
	}
	
	public void rectangle(int length, int breadth)
	{
		System.out.println("Area of rectangle : " + (length*breadth));
	}
	 
	public float triangle(float base,float height)
	{
		area = 0.5f * base *height;
		return area;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Area area = new Area();
		area.circle();
		
		int ar = area.square();
		System.out.println("Area of square : " + ar);
		
		int length,breadth;
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("enter length and breadth : ");
			length = sc.nextInt();
			breadth = sc.nextInt();
		}
		area.rectangle(length, breadth);
		
		float tr = area.triangle(3.8f , 2.6f);
		System.out.println("Area of triangle : "+ tr);
		
	}

}
