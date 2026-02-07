package in.co.rays.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestComparatorEmployee 
{
	public static void main(String[] args) {
		
		Employee e1 = new Employee(102, "Ameya" , 50000);
		Employee e2 = new Employee(101, "Shyam", 45000);
		Employee e3 = new Employee(105, "Ghanshyam", 52000);
		Employee e4 = new Employee(104, "Saket", 45333);
		Employee e5 = new Employee(103, "Shruti", 52000);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		System.out.println("-----List-----");
		System.out.println();
		
		list.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("-----Sort by Name-----");
		System.out.println();
		
		OrderByName byname = new OrderByName();
		Collections.sort(list, byname);
		list.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("-----Sort by Id-----");
		System.out.println();
		
		OrderById byid = new OrderById();
		Collections.sort(list,byid);
		list.forEach(System.out::println);
		
		System.out.println();
		
		System.out.println("-----Sort by Salary-----");
		System.out.println();
		
		OrderBySalary bysalary = new OrderBySalary();
		Collections.sort(list,bysalary);
		list.forEach(System.out::println);
	}
}
