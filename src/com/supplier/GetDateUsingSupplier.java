package com.supplier;

import java.util.Date;
import java.util.function.Supplier;

public class GetDateUsingSupplier {

	public static void main(String[] args) {

		Supplier<Date> dateSupplier = () -> new Date();
		System.out.println("Current Date and  Time : " + dateSupplier.get());

	}

}
