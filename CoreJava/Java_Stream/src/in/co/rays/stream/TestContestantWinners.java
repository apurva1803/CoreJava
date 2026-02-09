package in.co.rays.stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class TestContestantWinners 
{
	public static void main(String[] args) 
	{
		ArrayList<Contestant> list = new ArrayList<Contestant>();
		
		list.add(new Contestant("Ameya", "9098877665"));
		list.add(new Contestant("Apurva", "9098877666"));
		list.add(new Contestant("Shivam", "8818969605"));
		list.add(new Contestant("Shivansh", "6818969608"));
		list.add(new Contestant("Shiv", "8818969605"));
		list.add(new Contestant("Prakash", "7818969609"));
		list.add(new Contestant("Suvarna", "881896"));
		list.add(new Contestant("Shrikant", "8969605"));
		
		//Phone Number
		System.out.println("Phone Number");
		System.out.println();
		
		list.stream().map(e -> e.phoneNo).forEach(System.out::println);
		
		System.out.println();
		System.out.println("--------------");
		
		
		// get valid phoneNo
		System.out.println("Get Valid Phone Number");
		System.out.println();
		
		list.stream().map(e -> e.phoneNo).filter(e ->e.length() == 10).forEach(System.out::println);
		
		System.out.println();
		System.out.println("--------------");
		
		
		//remove duplicate phone Number
		System.out.println("Remove Duplicate Phone Number");
		System.out.println();
		
		list.stream().map(e ->e.phoneNo).filter(e -> e.length() == 10).distinct().forEach(System.out::println);
		
		System.out.println();
		
		
		// shuffle phoneNo
		System.out.println("-----Winners-----");
		list.stream().map(e -> e.phoneNo).filter(e -> e.length() == 10).distinct()
						.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
							Collections.shuffle(e);
							return e.stream();
					})).limit(3).forEach(System.out::println);

		
	}
}
