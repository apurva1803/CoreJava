package in.co.rays.collection;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		
		Collection c = new ArrayList();
		
		c.add("Ram");
		c.add('a');
		c.add(1);
		c.add(50);
		c.add(true);
		
		System.out.println(c);
		System.out.println("Size Of C: "+ c.size());
		
		System.out.println("-----------");
		
		for(Object o : c)
		{
			System.out.println(o);
		}
		
		System.out.println("-----------");
		
		System.out.println(c.contains(87)); 
		System.out.println(c.contains('a'));
		
		System.out.println("---------");
		
		System.out.println(c.remove(87));
		System.out.println(c.remove('a'));
		System.out.println(c);
		System.out.println("size of c: " + c.size());

	}
}
