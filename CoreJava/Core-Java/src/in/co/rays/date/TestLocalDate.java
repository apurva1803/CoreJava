package in.co.rays.date;

import java.time.LocalDate;

public class TestLocalDate {
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		
		System.out.println("Today's Date: "+now);
		System.out.println("Day of week: "+now.getDayOfWeek());
		System.out.println("Day of Months: "+now.getDayOfMonth());
		System.out.println("Month: "+now.getMonth());
		System.out.println("Day of Year: "+now.getDayOfYear());
		System.out.println("Year: "+now.getYear());
		
		System.out.println(".......................");
		
		LocalDate dob = LocalDate.of(1999,04,18);
		
		System.out.println("Today's Date: "+dob);
		System.out.println("Day of week: "+dob.getDayOfWeek());
		System.out.println("Day of Months: "+dob.getDayOfMonth());
		System.out.println("Month: "+dob.getMonth());
		System.out.println("Day of Year: "+dob.getDayOfYear());
		System.out.println("Year: "+dob.getYear());
		
		System.out.println(".......................");
		
		System.out.println("Age: "+(now.getYear() - dob.getYear()));
		
	}

}
