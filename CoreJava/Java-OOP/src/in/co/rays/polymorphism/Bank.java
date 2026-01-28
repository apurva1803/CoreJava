package in.co.rays.polymorphism;

public class Bank {
	public double interestRate()
	{
		return 11.0;
	}
	
	public String getName()
	{
		return "RBIBank";
	}
	
	
	public static Bank getBankName(int i) {
		if (i == 1) {
			return new AxisBank();
		}

		if (i == 2) {
			return new HdfcBank();
		}

		if (i == 3) {
			return new IciciBank();
		}

		return new Bank();
	}
}
