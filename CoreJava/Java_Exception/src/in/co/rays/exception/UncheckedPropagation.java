package in.co.rays.exception;

public class UncheckedPropagation {
	public static void main(String[] args) 
	{
		dad();
	}
	
	public static void dad()
	{
		try
		{
			mom();
		}catch(RuntimeException e)
		{
			System.out.println("Exception: "+ e.getMessage());
		}
	}
	
	public static void mom()
	{
		son();
	}
	
	public static void son()
	{
		throw new RuntimeException("Make a mistake....");
	}
}
