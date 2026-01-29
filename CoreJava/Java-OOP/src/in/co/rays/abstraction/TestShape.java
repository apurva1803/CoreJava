package in.co.rays.abstraction;


public class TestShape 
{
	public static void main(String[] args) 
	{
		Shape s1 = new Circle();
		
		// type cast Shape s1 to Circle c
		Circle c = (Circle) s1;
		
		c.setColour("red");
		c.setBorderWidth(2);
		
		//circle
		c.setRadius(2);

		System.out.println("color: " + c.getColour());
		System.out.println("borderwidth: " + c.getBorderWidth());
		System.out.println("radius: " + c.getRadius());
		System.out.println("Area: "+c.area());
		
		
		System.out.println("-----------------------");
		
		Shape s2 = new Triangle();
		
		Triangle t = (Triangle) s2;
		
		t.setBase(4);
		t.setHeight(2);
		
		System.out.println("Base: "+t.getBase());
		System.out.println("Height: "+t.getHeight());
		System.out.println("Area: "+t.area());
		
	}
	
	
	
}
