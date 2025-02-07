/**
 * 
 */
package com.wipro.java.java8;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;

/**
 * This class demonstrates the usage of TemporalAdjusters to adjust dates.
 */
public class Adjust {

	/**
	 * @param args
	 */
	public static void checkingAdjusters() {
		// Get the current date
		LocalDate date = LocalDate.now();
		System.out.println("The current date is" + " " + date);
		// Get the first day of the next month
		LocalDate dayofNextMonth = date.with(TemporalAdjusters.firstDayOfNextMonth());
		System.out.println("firstDayOfNextMonth" + " " + dayofNextMonth);
		// Get the next Saturday from the current date
		LocalDate nextSaturDay = date.with(TemporalAdjusters.next(DayOfWeek.SATURDAY));
		System.out.println("We have print the nextSaturday" + " " + nextSaturDay);
		// Get the first day of the current month
		LocalDate firstday = date.with(TemporalAdjusters.firstDayOfMonth());
		System.out.println("Firstdayofmonth" + " " + firstday);
		// Get the last day of the current month
		LocalDate lastday = date.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("LastdayOfMonth" + " " + lastday);

	}

	public static void main(String[] args) {
		// Calling the checkingAdjusters
		checkingAdjusters();

	}

}
