package in.co.rays.abstraction;

public class Circle extends Shape{
	public int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}
	

	@Override
	public double area() {
		return Math.PI * radius * radius;
	}
	
	

}
