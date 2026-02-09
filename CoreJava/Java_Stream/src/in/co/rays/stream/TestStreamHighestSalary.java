package in.co.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestStreamHighestSalary 
{
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList();

		list.add(1000);
		list.add(5000);
		list.add(2000);
		list.add(4000);
		list.add(3000);

		System.out.print("First Largest Salary: ");
		list.stream().distinct().sorted(Collections.reverseOrder()).limit(1).forEach(System.out::println);
		
		System.out.print("Second Largest Salary: ");
		list.stream().distinct().sorted(Collections.reverseOrder()).skip(1).limit(1).forEach(System.out::println);
	}
}
