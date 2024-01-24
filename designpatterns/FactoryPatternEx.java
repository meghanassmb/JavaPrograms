package designpatterns;

interface Shape {
	void draw();
}

class Circle implements Shape {
	@Override
	public void draw() {
		System.out.println("drawing circle");
	}
}

class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("drawing Rectangle");
	}
}

class Square implements Shape {
	@Override
	public void draw() {
		System.out.println("drawing Square");
	}
}

class ShapeFactory {
	public Shape getShape(String shapeType) {
		if (shapeType.equalsIgnoreCase("Circle"))
			return new Circle();
		else if (shapeType.equalsIgnoreCase("Rectangle"))
			return new Rectangle();
		else if (shapeType.equalsIgnoreCase("Square"))
			return new Square();
		else
			return null;
	}

}

public class FactoryPatternEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape shape;

		shape = shapeFactory.getShape("Circle");
		shape.draw();

		shape = shapeFactory.getShape("Rectangle");
		shape.draw();

		shape = shapeFactory.getShape("Square");
		shape.draw();
	}

}
