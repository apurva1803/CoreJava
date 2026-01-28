package in.co.rays.overriding;

public class TestShape {

	public static void main(String[] args) {
		// parents can keep child's reference
		Shape s1 = new Circle();
		
		// type cast Shape s1 to Circle c
		Circle c = (Circle) s1;
		c.setColour("red");
		c.setBorderWidth(2);
		c.setRadius(2);

		System.out.println("color: " + c.getColour());
		System.out.println("borderwidth: " + c.getBorderWidth());
		System.out.println("radius: " + c.getRadius());
		c.area();
		
		System.out.println("..........................");
		
		Shape s2 = new Rectangle();
		
		// type cast Shape s1 to Circle c
		Rectangle c1 = (Rectangle) s2;
		c1.setColour("Blue");
		c1.setBorderWidth(2);
		c1.setLength(2);
		c1.setWidth(4);

		System.out.println("color: " + c1.getColour());
		System.out.println("borderwidth: " + c1.getBorderWidth());
		System.out.println("Length: " + c1.getLength());
		System.out.println("Width: " + c1.getWidth());
		c1.area();
		
		System.out.println("..........................");
		
		Shape s3 = new Triangle();
		
		// type cast Shape s1 to Circle c
		Triangle c2 = (Triangle) s3;
		c2.setColour("White");
		c2.setBorderWidth(1);
		c2.setBase(2);
		c2.setHeight(4);

		System.out.println("color: " + c2.getColour());
		System.out.println("borderwidth: " + c2.getBorderWidth());
		System.out.println("Length: " + c2.getBase());
		System.out.println("Width: " + c2.getHeight());
		c2.area();
	}
	
}
