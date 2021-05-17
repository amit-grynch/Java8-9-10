package com.datatimeAPIExample;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   LocalTime localTime=LocalTime.now();
   System.out.println(localTime);
   System.out.println(LocalDate.now());
   System.out.println(" Get Day Month Year Detail :");
   System.out.println("Day : "+LocalDate.now().getDayOfMonth());
   System.out.println("Month : "+LocalDate.now().getMonthValue());
   System.out.println("Year : "+LocalDate.now().getYear());
   System.out.println(" min :"+localTime.getMinute());
   System.out.println(" Time ZOne "+ZoneId.systemDefault());
	}  

}
