package in.co.rays.exception;

public class MultiException {
	public static void main(String[] args) {
		
		String s = "Apurva";
		
		try 
		{
			System.out.println(s.length());
			System.out.println(s.charAt(7));
			
		} catch (NullPointerException e) 
		{
			System.out.println("Exception 1 : "+ e.getMessage());
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Exception 2 : "+ e.getMessage());
		}
	}
}
