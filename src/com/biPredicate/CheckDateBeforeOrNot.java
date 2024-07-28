package com.biPredicate;

import java.time.LocalDate;
import java.util.function.BiPredicate;

public class CheckDateBeforeOrNot {

	public static void main(String[] args) {

		BiPredicate<LocalDate, LocalDate> isBefore = (date1, date2) -> date1.isBefore(date2);

		LocalDate today = LocalDate.now();
		LocalDate tomorrow = today.plusDays(1);
		System.out.println(isBefore.test(today, tomorrow));
	}

}
