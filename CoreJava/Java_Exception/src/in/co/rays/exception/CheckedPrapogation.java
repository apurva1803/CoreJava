package in.co.rays.exception;


//compile Time
public class CheckedPrapogation {

	public static void main(String[] args) 
	{
		try
		{
			dad();
		}catch(Exception e)
		{
			System.out.println("Exception: "+e.getLocalizedMessage());
		}

	}
	
	public static void dad() throws Exception
	{
		mom();
	}
	
	public static void mom() throws Exception
	{
		son();
	}
	
	public static void son() throws Exception
	{
		throw new Exception("Make a mistake");
	}

}
