package com.predicate;

import java.util.function.Predicate;

public class CheckEvenWithLambdaUsingPredicate {

	public static void main(String[] args) {

		Predicate<Integer> predicate = t -> t % 2 == 0;
		System.out.println(predicate.test(100));
	}
}