package in.co.rays.basic;

public class PrePost {
	
	public static void main(String[] args) {
		
		int i=1;
		
		System.out.println(i++ + i + i++ + ++i - --i + i-- + ++i);
		
		System.out.println("..................");
		
		System.out.println(""+ i++ + i + i++ + ++i);
	}

}
