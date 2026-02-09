package in.co.rays.stream;

import java.util.ArrayList;
import java.util.Comparator;

public class TestStream 
{
	public static void main(String[] args) 
	{
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Ameya");
		list.add("Apurva");
		list.add("Shivam");
		list.add("Shivansh");
		list.add("Apurva");
		list.add("Shivam");
		list.add("Praksh");
		list.add("Rupali");
		
		list.forEach(System.out::println);
		
		System.out.println("------Sorted-------");
		
		list.stream().sorted().forEach(System.out::println);
		
		System.out.println("------Reverse Order-------");
		
		list.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		System.out.println("------Remove Duplicates-------");
		
		list.stream().sorted().distinct().forEach(System.out::println);
		
		System.out.println("-----map method LowerCase------");
		
		list.stream().map(e -> e.toLowerCase()).distinct().forEach(System.out::println);
		
		System.out.println("-----map method LowerCase------");
		
		list.stream().map(e -> e.toUpperCase()).distinct().forEach(System.out::println);
		
		System.out.println("-----Filter method-----");
		
		list.stream().filter(e -> e.startsWith("S")).distinct().forEach(System.out::println);
	}
}
