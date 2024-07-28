package com.biConsumer;

import java.util.function.BiConsumer;

public class CombineTwoString {

	public static void main(String[] args) {

		BiConsumer<String, String> combineString = (a, b) -> System.out.println(a + " " + b);

		BiConsumer<Integer, Integer> printSum = (a, b) -> System.out
				.println("Sum of " + a + " and " + b + " is: " + (a + b));

		combineString.accept("Sameer", "Siddiqui");

		printSum.accept(12, 976);
	}

}
