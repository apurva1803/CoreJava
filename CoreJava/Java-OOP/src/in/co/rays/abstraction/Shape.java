package in.co.rays.abstraction;

public abstract class Shape 
{
	public String colour = null;
	public int borderWidth = 0;
	
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getBorderWidth() {
		return borderWidth;
	}
	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}
	
	public abstract double area();


}
