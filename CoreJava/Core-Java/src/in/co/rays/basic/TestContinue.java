package in.co.rays.basic;

public class TestContinue {
	
	public static void main(String[] args)
	{
		for(int i=0;i<=10;i++)
		{
			if(i%2==0)
			{
				continue;//Skips even numbers
			}
			System.out.println("Odd Numbers "+ i);
		}
		
	}

}
