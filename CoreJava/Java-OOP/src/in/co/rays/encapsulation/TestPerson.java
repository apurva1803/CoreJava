package in.co.rays.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		Person p1 = new Person();
		
		p1.setName("Apurva");
		p1.setDate(sdf.parse("1999-04-18"));
		p1.setAddress("Indore");
		
		System.out.println("Name: "+p1.getName());
		System.out.println("Birthdate: "+p1.getDate());
		System.out.println("Address: "+p1.getAddress());
		System.out.println("Age: "+p1.getAge(p1.getDate()));
	}

}
