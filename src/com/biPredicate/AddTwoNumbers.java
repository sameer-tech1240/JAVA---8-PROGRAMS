package com.biPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;

public class AddTwoNumbers {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> isSumGreaterThan100 = (a, b) -> (a + b) > 100;

		int num1 = 10;
		int num2 = 45;

		boolean result = isSumGreaterThan100.test(num1, num2);
		List<Object> arrayList = new ArrayList<>();
		arrayList.add(1);
		arrayList.add(1);
		arrayList.parallelStream().forEach(s -> System.out.println(s));
		System.out.println("Sum of " + num1 + " and " + num2 + " is greater than 100: " + result);
	}

}
