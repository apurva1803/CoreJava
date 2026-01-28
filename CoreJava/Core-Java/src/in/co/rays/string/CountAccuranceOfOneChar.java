package in.co.rays.string;

public class CountAccuranceOfOneChar {
	public static void main(String[] args) {
		
		String str = "google";
		
		int count = 0;
		
		char ch = 'o';
		
		for(int i=0;i<str.length();i++)
		{
			if(ch == str.charAt(i))
			{
				count++;
			}
		}
		
		System.out.println("count of "+ch+ " is: "+count);
	}

}
