package in.co.rays.date;

import java.time.LocalDate;
import java.time.Period;

public class TestTimePeriod {
	public static void main(String[] args) {
		
		LocalDate todayDate = LocalDate.now();
		System.out.println("Today's Date: "+todayDate);
		
		LocalDate birthDate = LocalDate.of(1999, 04, 18);
		System.out.println("Birth Date: "+birthDate);
		
		Period period = Period.between(birthDate, todayDate);
		System.out.println(period.getYears()+" years "+period.getMonths()+ " months "+period.getDays()+ " days ");
		
	}

}
