package in.co.rays.encapsulation;

public class TestAutomobile {
	
	public static void main(String[] args) {
		
		Automobile a1 = new Automobile();
		
		a1.setColour("White");
		a1.setMake("Mahindra");
		a1.setSpeed(60);
		
		System.out.println("Colour: "+a1.getColour());
		System.out.println("Make: "+a1.getMake());
		System.out.println("Speed Now: "+a1.getSpeed());
		
		a1.accelerator();
		a1.accelerator();
		System.out.println("Speed Now: "+a1.getSpeed());
		
		a1.changeGear(3);
		
		a1.brake();
		System.out.println("Speed Now: "+a1.getSpeed());
		
		a1.accelerator();
		a1.accelerator();
		System.out.println("Speed Now: "+a1.getSpeed());
		
		a1.changeGear(4);
	}

}
