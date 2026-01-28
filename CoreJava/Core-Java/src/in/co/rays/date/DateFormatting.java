package in.co.rays.date;

import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.Date;

public class DateFormatting {
	public static void main(String[] args) throws ParseException {
		
		Date d = new Date();
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		
		System.out.println("Default Date Format: "+d);
		
		String s = sdf.format(d);
		
		System.out.println("Format Date: "+ s);
		
		System.out.println("...................");
		
		String dob = "1999-04-18";
		
		System.out.println("String DOB: "+dob);
		
		Date date = sdf.parse(dob);
		
		System.out.println("DOB Date: "+date);
	}

}
