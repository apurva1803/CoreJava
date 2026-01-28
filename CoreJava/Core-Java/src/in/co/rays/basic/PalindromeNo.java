package in.co.rays.basic;

public class PalindromeNo {
	public static void main(String[] args)
	{
		int num=12324;
		int orgNum=num;
		int rev=0;
		
		while(num!=0)
		{
			int digit= num%10;
			rev= rev*10 +digit;
			num = num/10;
		}
		
		if(rev==orgNum)
		{
			System.out.println(orgNum+" is Palindrome Number");
		}
		else
		{
			System.out.println(orgNum+" is not Palindrome Number");
		}
		
	}

}
