package in.co.rays.basic;

public class ForLoop {
	public static void main(String[] args) {
		int sum = 0;
		int odd = 0;
		int even = 0;
		
		for (int i = 1; i <= 100; i++) {
			System.out.println(i);
			sum = sum + i;
			
			if(i%2==0)
			{
				even = even + i;
				//System.out.println(i);
			}
			else {
				odd= odd+i;
			}

		}
		 System.out.println("Total of Sum :- "+sum);
		 System.out.println("Total of Even :- "+even);
		 System.out.println("Total of Odd :- "+odd);
		 
		 
		 }

	}


