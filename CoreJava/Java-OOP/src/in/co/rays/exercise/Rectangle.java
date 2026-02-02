package in.co.rays.exercise;

public class Rectangle extends Shape
{
	private double length;
	private double width;
	
	public double getLength() 
	{
		return length;
	}
	
	void setLength(double length) 
	{
		this.length = length;
	}
	
	public double getWidth() 
	{
		return width;
	}
	
	public void setWidth(double width) 
	{
		this.width = width;
	}

	@Override
	public double area() {
		return length * width ;
	}
	
	
	
}
