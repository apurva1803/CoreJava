package in.co.rays.basic;

public class PrimeNo {
	
	public static void main(String[] args)
	{
		int num=20;
		boolean flag= false;
		
		if(num==0 || num == 1)
		{
			flag=true;
			
		}
		
		for(int i=2; i<=num/2; ++i)
		{
			if(num%i==0)
			{
				flag=true;
				
			}
		}
		
		if(!flag)
		{
			System.out.println(num+" Prime Number");
		}
		else
		{
			System.out.println(num+" Not Prime Number");
		}
	}

}
