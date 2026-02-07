package in.co.rays.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparableMarksheet {
	
	public static void main(String[] args) {
		
		ArrayList<Marksheet> list = new ArrayList<Marksheet>();
		
		Marksheet m1 = new Marksheet("106","Ramesh", 45);
		Marksheet m2 = new Marksheet("102", "Shyam", 78);
		Marksheet m3 = new Marksheet("106", "Kamal", 88);
		Marksheet m4 = new Marksheet("103", "Aman", 69);
		Marksheet m5 = new Marksheet("104", "Pawan", 35);
		Marksheet m6 = new Marksheet("101", "Rakesh", 55);
		
		list.add(m1);
		list.add(m2);
		list.add(m3);
		list.add(m4);
		list.add(m5);
		list.add(m6);
		
		System.out.println("---------Marksheet---------");
		
		list.forEach(System.out::println);
		
		
		System.out.println("--------sorted marksheet------");
		
		Collections.sort(list); // use comparable interface
		
		list.forEach(System.out::println);
	}

}
