package com.biFunction;

import java.util.function.BiFunction;

public class BiFunctionLogicalOperations {

	public static void main(String[] args) {

		BiFunction<Integer, Integer, Boolean> isGreater = (a, b) -> a > b;

		BiFunction<Integer, Integer, Boolean> isLess = (a, b) -> a < b;

		BiFunction<Integer, Integer, Integer> max = (a, b) -> a > b ? a : b;

		BiFunction<Integer, Integer, Integer> min = (a, b) -> a < b ? a : b;

		System.out.println("Is 12 greater than 142? " + isGreater.apply(12, 142));

		System.out.println("Is 132 less than 192? " + isLess.apply(132, 192));

		System.out.println("Maximum of 9 and 76 is: " + max.apply(9, 76));

		System.out.println("Minimum of 12 and 4 is: " + min.apply(12, 4));

	}

}
