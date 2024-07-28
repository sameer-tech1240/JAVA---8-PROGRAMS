package com.biPredicate;

import java.util.function.BiPredicate;
import java.util.stream.IntStream;

public class CheckEvenOdd {

	public static void main(String[] args) {

		BiPredicate<Integer, Integer> isEven = (num, divisor) -> num % divisor == 0;

		BiPredicate<Integer, Integer> isOdd = (num, divisor) -> num % divisor != 0;

		System.out.println("Even numbers between 1 to 10:");
		IntStream.rangeClosed(1, 10).forEach(num -> {
			if (isEven.test(num, 2)) {

				System.out.println(num);

			}
		});

		System.out.println("Odd numbers between 1 to 10:");
		IntStream.rangeClosed(1, 10).forEach(num -> {
			if (isOdd.test(num, 2)) {

				System.out.println(num);

			}
		});
	}

}
