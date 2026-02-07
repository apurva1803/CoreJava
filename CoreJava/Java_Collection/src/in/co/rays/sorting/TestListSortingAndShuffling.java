package in.co.rays.sorting;

import java.util.ArrayList;
import java.util.Collections;

public class TestListSortingAndShuffling 
{
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("Apurva");
		list.add("Ameya");
		list.add("Shivansh");
		list.add("Shivam");
		
		System.out.println("-----List-----");
		
		System.out.println();
		System.out.println(list);
		System.out.println();
		
		System.out.println("-----After Sort-----");
		
		System.out.println();
		Collections.sort(list);
		System.out.println(list);
		System.out.println();
		
		System.out.println("-----After Shuffle-----");
		
		System.out.println();
		Collections.shuffle(list);
		System.out.println(list);
	}
}
