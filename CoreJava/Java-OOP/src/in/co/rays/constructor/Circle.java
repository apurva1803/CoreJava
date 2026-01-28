package in.co.rays.constructor;

public class Circle extends Shape{

	
	private int radius;

	public Circle() 
	{

	}

	public Circle(int radius, String color, int borderWidth) 
	{
		super(borderWidth, color);
		this.radius = radius;
		System.out.println(this.radius);
	}
}
