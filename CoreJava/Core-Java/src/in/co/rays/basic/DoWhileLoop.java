package in.co.rays.basic;

public class DoWhileLoop {
	public static void main(String[] args)
	{
		int i=1;
		int sum = 0;
		int odd = 0;
		int even = 0;
		
		do {
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
			
		}while(i<=100);
			
		System.out.println("Sum:" + sum);
		System.out.println("Total of Even :- "+even);
		System.out.println("Total of Odd :- "+odd);
		
	}
	

}
