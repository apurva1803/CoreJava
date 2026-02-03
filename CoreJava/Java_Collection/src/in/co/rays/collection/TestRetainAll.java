package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestRetainAll 
{
	public static void main(String[] args) 
	{
		Collection c1 = new ArrayList();
		
		c1.add("Ram");
		c1.add('a');
		c1.add(1);
		c1.add(50);
		c1.add(true);
		
		System.out.println(c1);
		System.out.println("Size Of C: "+ c1.size());
		
		System.out.println("-----------");
		
		Collection c2 = new ArrayList();
		
		c2.add("Shyam");
		c2.add('b');
		c2.add(1);
		c2.add(500);
		c2.add(true);
		
		System.out.println(c2);
		System.out.println("Size Of C: "+ c2.size());
		
		System.out.println("-----------");
		
		c1.retainAll(c2);
		
		System.out.println("-----------");
		
		System.out.println(c1);
		
		c1.clear();
		
		System.out.println(c1.isEmpty());
	}
}
