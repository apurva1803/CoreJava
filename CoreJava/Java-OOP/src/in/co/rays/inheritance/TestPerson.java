package in.co.rays.inheritance;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestPerson {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat d = new SimpleDateFormat("yyyy-MM-dd");
		
		Businessman b = new Businessman();
		
		System.out.println(".....Businessman.....");
		
		b.setName("Apurva");
		b.setAddress("Indore");
		b.setDob(d.parse("1999-04-18"));
		b.setIncome(100000);
		
		System.out.println(b.getName());
		System.out.println(b.getAddress());
		System.out.println(b.getDob());
		System.out.println(b.getIncome());
		
		Doctor d1 = new Doctor();
		
		System.out.println(".....Doctor.....");
		
		d1.setName("Shivansh");
		d1.setAddress("Indore");
		d1.setDob(d.parse("2026-02-28"));
		d1.setRegistrationNo("1456");
		
		System.out.println(d1.getName());
		System.out.println(d1.getAddress());
		System.out.println(d1.getDob());
		System.out.println(d1.getRegistrationNo());
		
		
		Student s = new Student();
		
		System.out.println(".....Student.....");
		
		s.setName("Shivam");
		s.setAddress("Indore");
		s.setDob(d.parse("1997-02-03"));
		s.setRollNo("14");
		s.setMarks(90);
		
		System.out.println(s.getName());
		System.out.println(s.getAddress());
		System.out.println(s.getDob());
		System.out.println(s.getRollNo());
		System.out.println(s.getMarks());
		
		
	}
}
