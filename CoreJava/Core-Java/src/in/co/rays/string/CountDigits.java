package in.co.rays.string;

public class CountDigits {
	public static void main(String[] args) {
		
		String str = "g0w3gy765wed124";
		
		int count = 0;
		
		for(int i=0; i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i)))
			{
				count++;
			}
		}
		System.out.println("Total Digit in String: "+count);
	}

}
