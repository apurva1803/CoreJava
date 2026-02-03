package in.co.rays.list;

import java.util.Vector;

public class TestVector 
{
	public static void main(String[] args) 
	{
		
		Vector v = new Vector();
		
		v.addElement("Ram");
		v.addElement(45);
		
		System.out.println(v.elementAt(1));
		
		System.out.println(v.get(1));
		
		System.out.println(v.elementAt(0));
		
		System.out.println(v.get(0));
	}
}
