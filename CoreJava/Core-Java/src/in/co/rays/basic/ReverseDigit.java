package in.co.rays.basic;

public class ReverseDigit {
	public static void main(String[] args)
	{
		int num=10202;
		int orgNo= num;
		int reverse=0;
		
		while(num!=0)
		{
			int digit=num%10;
			reverse= reverse *10 +digit;
			num=num/10;
		}
		
		System.out.println("Original Number: "+orgNo);
		
		System.out.println("Reverse Number: "+reverse);
		
		
	}

}
