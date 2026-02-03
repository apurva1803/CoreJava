package in.co.rays.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TestTreeset 
{
	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();

		s.add('c');
		s.add('b');
		s.add('a');
		s.add('d');
		s.add('e');

		System.out.println(s);
	}
}
