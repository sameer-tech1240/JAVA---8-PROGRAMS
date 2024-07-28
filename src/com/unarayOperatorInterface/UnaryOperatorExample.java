package com.unarayOperatorInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	public static void main(String[] args) {

		/* UnaryOperator to double the input integer */

		UnaryOperator<Integer> doubleValue = x -> x * 2;

		/* Example values */

		int value = 5;

		/* Apply the UnaryOperator */

		int result = doubleValue.apply(value);

		/* Print the result */

		System.out.println("Double of " + value + " is: " + result);
	}
}
