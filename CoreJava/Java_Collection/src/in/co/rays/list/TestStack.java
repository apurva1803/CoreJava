package in.co.rays.list;

import java.util.Stack;

public class TestStack {
	public static void main(String[] args) {
		
		Stack s = new Stack();
		
		for(char c='a';c<='z';c++)
		{
			s.push(c);
		}
		
		System.out.println("stack: " + s);
		System.out.println(s.peek());	//shows last element
		
		System.out.println("stack: " + s);
		System.out.println(s.pop());	//remove last element
		
		System.out.println("stack: " + s);

	}

}
