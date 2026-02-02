package in.co.rays.exception;

public class LoginException extends RuntimeException
{
	public LoginException()
	{
		System.out.println("User Not Found...");
	}
}
