package in.co.rays.basic;

import java.util.Scanner;

public class TestScanner {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

	
		System.out.print("Enter first int: ");
		int a = sc.nextInt();
		
		System.out.print("Enter second int: ");
		int b = sc.nextInt();
						
		System.out.println();

		System.out.println("Your first int is: " + a);
		System.out.println("Your second int is: " + b);
			
		System.out.println();

		System.out.println("select your one opr....(-, +, *, /, %)");
		String opr = sc.next();
		
		sc.close();
			
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
			
		System.out.println();
		

	}

}
