package in.co.rays.constructor;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a1 = new Account("234567","Saving Account",20000.0);
		
		System.out.println(a1.getNumber());
		System.out.println(a1.getAccountType());
		System.out.println(a1.getBalance());
	}
}
