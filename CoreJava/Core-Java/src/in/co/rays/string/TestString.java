package in.co.rays.string;

public class TestString {
	public static void main(String[] args)
	{
		String name="Apurva Shivam Deshmukh";
		
		System.out.println("String Length: "+name.length());
		System.out.println("8th char is: "+name.charAt(7));
		System.out.println("'Shiv' Index is: "+name.indexOf("Shiv"));
		System.out.println("First 'i' position: "+name.indexOf('i'));
		System.out.println("Last 'a' position: "+name.lastIndexOf('a'));
		System.out.println("a is replaced by b: "+name.replace('a','b'));
		System.out.println("Lower Case: "+name.toLowerCase());
		System.out.println("Upper Case: "+name.toUpperCase());
		System.out.println("Starts with Apurva: "+name.startsWith("Apurva"));
		System.out.println("Ends with 'kh': "+name.endsWith("kh"));
		System.out.println("Substring from index 7: "+name.substring(7));
	}

}
