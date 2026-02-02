package in.co.rays.exception;

public class TestAccount 
{
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setBalance(5000);
		System.out.println("Current Balance: "+ a.getBalance());
		
		a.withdraw(6000);
	}
}
