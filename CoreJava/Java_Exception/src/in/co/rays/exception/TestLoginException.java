package in.co.rays.exception;

public class TestLoginException 
{
	public static void main(String[] args) {
		
		String login = "admin123";
		
		if(login == "admin")
		{
			System.out.println("User Found.....");
		}
		else
		{
			throw new LoginException();
		}
	}
}
