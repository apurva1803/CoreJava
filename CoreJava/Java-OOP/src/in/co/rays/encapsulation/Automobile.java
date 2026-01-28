package in.co.rays.encapsulation;

public class Automobile {

	private String colour;
	private int speed;
	private String make;
	public final static int NO_OF_GEARS = 6;
	
	public void setColour(String colour)
	{
		this.colour = colour;
	}
	
	public String getColour()
	{
		return this.colour;
	}
	
	public void setMake(String make)
	{
		this.make = make;
	}
	
	public String getMake()
	{
		return this.make;
	}
	
	public void setSpeed(int speed)
	{
		this.speed = speed;
	}
	
	public int getSpeed()
	{
		return this.speed;
	}
	
	public void brake() {

		if (speed == 0) {
			System.out.println("car already stoped");
		} else {
			speed = speed - 10;
		}

	}

	public void accelerator() {

		if (speed == 400 || speed > 400) {
			System.out.println("speed limit is high please applay brake");
		} else {
			speed = speed + 10;
		}

	}
	
	public void changeGear(int gear) 
	{

		if (gear > NO_OF_GEARS) {
			System.out.println("invalid gear...");
		}

		switch(gear)
		{
			case 1:
				if(speed > 0 && speed <= 20)
				{
					System.out.println("Gear 1");
				}
				else if(speed>=20)
				{
					System.out.println("Change next gear");
				}
				
			case 2:
				if(speed > 20 && speed <= 40)
				{
					System.out.println("Gear 2");
				}
				else if(speed >= 40)
				{
					System.out.println("Change next Gear");
				}
				
			case 3:
				if(speed > 40 && speed <= 60)
				{
					System.out.println("Gear 3");
				}
				else if(speed >= 60)
				{
					System.out.println("Change next Gear");
				}
				
			case 4:
				
				if(speed > 60 && speed <= 80)
				{
					System.out.println("Gear 4");
				}
				else if(speed >= 80)
				{
					System.out.println("Change next Gear");
				}
				
			case 5:
				if(speed > 80 && speed <= 100)
				{
					System.out.println("Gear 5");
				}
				else if(speed >= 100)
				{
					System.out.println("Change next Gear");
				}
				
			case 6:
				if(speed > 100)
				{
					System.out.println("Gear 6");
				}
				
		}
		
	}

}
