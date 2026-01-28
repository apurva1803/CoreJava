package in.co.rays.polymorphism;

public class IciciBank extends Bank{

	@Override
	public double interestRate() {
		return 9.75;
	}
	
	@Override
	public String getName() {
		return "ICICIBank";
	}
}
