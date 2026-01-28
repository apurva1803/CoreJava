package in.co.rays.basic;

public class WhileLoop {
	public static void main(String[] args)
	{
		int i=1;
		int sum = 0;
		int odd = 0;
		int even = 0;
		
		while(i<=100)
		{
			System.out.println(i);
			
			sum= sum+i;
			
			if(i%2==0)
			{
				even = even + i;
				//System.out.println(i);
			}
			else {
				odd= odd+i;
			}
			
			i++;
		}
		System.out.println("Sum:" + sum);
		System.out.println("Total of Even :- "+even);
		System.out.println("Total of Odd :- "+odd);
		
	}
	

}
