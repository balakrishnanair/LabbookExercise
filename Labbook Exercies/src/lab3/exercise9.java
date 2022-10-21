package lab3;


import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.Temporal;
import java.util.Date;


public class exercise9 {



	public static void main(String[] args)
	{
	exercise9 ex9 = new exercise9();
	
	LocalDate d= LocalDate.of(2022, 7, 12);
	ex9.DateDifference(d);
	}

	public void DateDifference(LocalDate d)
	{
		LocalDate now = LocalDate.now();
		Period period= Period.between(now,d);
		int years=Math.abs(period.getYears());
		int months= Math.abs(period.getMonths());
		int days =Math.abs(period.getDays());
		
		System.out.println(" Years = "+years+" months = "+months+" days = "+days);
		
	}
}
