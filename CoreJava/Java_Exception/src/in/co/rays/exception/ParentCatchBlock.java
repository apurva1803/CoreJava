package in.co.rays.exception;

public class ParentCatchBlock {

	public static void main(String[] args) {
		
		String s = "Apurva";
		
		try {
			System.out.println(s.length()); //NullPointerException
			System.out.println(s.charAt(7)); //IndexoutOfBound
			
		} catch (Exception e) {
			System.out.println("Exception: " + e.getMessage());
		} finally {
			System.out.println("Always Execute");
		}
	}
}
