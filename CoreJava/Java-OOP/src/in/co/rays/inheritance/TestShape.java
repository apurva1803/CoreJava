package in.co.rays.inheritance;

public class TestShape {
	public static void main(String[] args) {
		
		System.out.println(".....Circle.....");
		
		Circle c = new Circle();
		
		c.setRadius(3);
		c.setColour("Blue");
		c.setBorderWidth(2);
		
		System.out.println("radius: " + c.getRadius()); // Child property
		System.out.println("color: " + c.getColour()); // Parent class property
		System.out.println("borderWidth: " + c.getBorderWidth()); // parent class property
		c.area();
		
		System.out.println();
		
		System.out.println(".....Rectangle.....");
		
		Rectangle r = new Rectangle();
		
		r.setLength(3);
		r.setWidth(4);
		r.setColour("Green");
		r.setBorderWidth(1);
		
		System.out.println("Length: " + r.getLength()); 
		System.out.println("Width: " + r.getWidth()); 
		System.out.println("color: " + r.getColour()); // Parent class property
		System.out.println("borderWidth: " + r.getBorderWidth()); // parent class property
		r.area();
		
		System.out.println();
		
		System.out.println(".....Triangle.....");
		
		Triangle t = new Triangle();
		
		t.setBase(3);
		t.setHeight(4);
		t.setColour("White");
		t.setBorderWidth(3);
		
		System.out.println("Base: " + t.getBase()); 
		System.out.println("Height: " + t.getHeight()); 
		System.out.println("color: " + t.getColour()); // Parent class property
		System.out.println("borderWidth: " + t.getBorderWidth()); // parent class property
		t.area();
		
	}

}
