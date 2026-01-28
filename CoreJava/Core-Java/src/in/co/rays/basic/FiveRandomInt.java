package in.co.rays.basic;

import java.util.Random;

public class FiveRandomInt {
	public static void main(String[] args) {
		
		Random r = new Random();
		
		for(int i=0;i<5;i++)
		{
			int no=r.nextInt(1000);
			System.out.println(no);
		}
	}

}
