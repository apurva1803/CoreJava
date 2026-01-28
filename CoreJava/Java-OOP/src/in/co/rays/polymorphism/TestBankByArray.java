package in.co.rays.polymorphism;

public class TestBankByArray {
	
	public static void main(String[] args) {
		
		Bank[] banks = new Bank[3];
		
		banks[0] = new AxisBank();
		banks[1] = new HdfcBank();
		banks[2] = new IciciBank();
		
		for(Bank b : banks)
		{
			String name = b.getName();
			double rate = b.interestRate();
			System.out.println(name + " = "+ rate);
		}
	}

}
