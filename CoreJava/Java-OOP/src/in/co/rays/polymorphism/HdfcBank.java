package in.co.rays.polymorphism;

public class HdfcBank extends Bank{

	@Override
	public double interestRate() {
		return 10.10;
	}
	
	@Override
	public String getName() {
		return "HdfcBank";
	}
}
