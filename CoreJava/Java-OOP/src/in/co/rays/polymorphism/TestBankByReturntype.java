package in.co.rays.polymorphism;

public class TestBankByReturntype {
	
	public static void main(String[] args) {
		Bank[] banks = new Bank[3];
		
		banks[0] = Bank.getBankName(1);
		banks[1] = Bank.getBankName(2);
		banks[2] = Bank.getBankName(3);
		
		for(Bank b : banks)
		{
			String name = b.getName();
			double rate = b.interestRate();
			System.out.println(name + " = "+ rate);
		}
		
	}


	
}
