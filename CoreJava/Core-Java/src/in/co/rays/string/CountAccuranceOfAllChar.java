package in.co.rays.string;

public class CountAccuranceOfAllChar {
	public static void main(String[] args) {
		
		String str = "google";
		
		int count = 0;
		
		for(char ch='a'; ch<='z';ch++)
		{
			for(int i=0;i<str.length();i++)
			{
				if(str.charAt(i)==ch)
				{
					count++;
				}
			}
			
			if(count>0)
			{
				System.out.println(ch + " = "+ count);
				count=0;
			}
		}
	}

}
