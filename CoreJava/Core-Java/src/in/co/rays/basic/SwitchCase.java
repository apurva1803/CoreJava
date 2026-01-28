package in.co.rays.basic;



public class SwitchCase {
	
	public static void main(String[] args)
	{
		String opr = "+";
		int a = 5;
		int b = 10;

		switch (opr) {
		case "+":
			System.out.println("result: " + (a + b));
			break;
		case "-":
			System.out.println("result: " + (a - b));
			break;
		case "*":
			System.out.println("result: " + (a * b));
			break;
		case "/":
			System.out.println("result: " + (b / a));
			break;
		case "%":
			System.out.println("result: " + (b % a));
			break;
	}

}
	}
