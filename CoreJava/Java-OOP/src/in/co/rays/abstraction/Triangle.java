package in.co.rays.abstraction;

public class Triangle extends Shape{
	
	int base;
	int height;
	
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	
	@Override
	public double area() {
		return base * height * 0.5;
	}
	
	

}
