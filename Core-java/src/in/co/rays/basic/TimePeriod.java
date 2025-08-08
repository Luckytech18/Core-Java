package in.co.rays.basic;

import java.time.LocalDate;
import java.time.Period;

public class TimePeriod {
	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		
		System.out.println(now);
		
		System.out.println("--------------------");
		
		LocalDate dob = LocalDate.of(2005, 1, 18);
		
		System.out.println(dob);
		
		Period p = Period.between(dob, now);
		
		System.out.println(p.getYears() + " " + p.getMonths()+ " "  + p.getDays());
	}

}
