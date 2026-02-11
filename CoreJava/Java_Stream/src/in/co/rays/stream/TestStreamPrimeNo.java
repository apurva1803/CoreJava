package in.co.rays.stream;

import java.util.ArrayList;
import java.util.List;

public class TestStreamPrimeNo 
{
	public static boolean isPrime(int i)
	{
		int count = 0;
		
		if(i==1)
		{
			return false;
		}
		
		for(int j=2;j<i;j++)
		{
			if(i%j == 0)
			{
				count++;
			}
		}
		
		if(count>0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	
	public static void main(String[] args) {
        
		List<Integer> list = new ArrayList();
		
		for(int i=1; i<=10 ; i++)
		{
			list.add(i);
		}
		
		list.stream().filter(e -> isPrime(e)).forEach(e -> System.out.println(e));
    }
}
