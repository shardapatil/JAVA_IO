package com.collectionassignment.q7;

import java.util.Calendar;

public class CalendarDisplay {

	public static void main(String[] args) {
		//  Use a calendar to display DAY, MONTH,YEAR,MINUTE,HOUR, SECONDS in the console

		Calendar cal = Calendar.getInstance();
		
		String months[] = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", 
		         "Oct", "Nov", "Dec"};
		
		System.out.println("DAY : "+cal.get(Calendar.DATE));
		
		System.out.println("MONTH : "+months[cal.get(Calendar.MONTH)]);
		
		System.out.println("YEAR : "+cal.get(Calendar.YEAR));
		
		System.out.println("HOUR : "+cal.get(Calendar.HOUR));
		
		System.out.println("MINUTE : "+cal.get(Calendar.MINUTE));
		
		System.out.println("SECONDS : "+cal.get(Calendar.SECOND));
	}
}
