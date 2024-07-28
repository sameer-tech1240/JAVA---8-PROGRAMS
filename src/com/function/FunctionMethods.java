package com.function;

import java.util.function.Function;

public class FunctionMethods {
	public static void main(String[] args) {

		/*
		 * andThen()Method
		 */

		Function<String, String> toUpperCase = str -> str.toUpperCase();

		Function<String, String> toLowerCase = str11 -> str11.substring(0, 5);

		System.out.println(toUpperCase.andThen(toLowerCase).apply("SamEEr"));

		/*
		 * compose() Method
		 */

		Function<Integer, Integer> square = num -> num * num;

		Function<Integer, Integer> cube = num -> num * num * num;

		System.out.println(square.compose(cube).apply(2));

		/*
		 * identity() Method
		 */

		Function<String, String> identity = Function.identity();
		System.out.println(identity.apply("I am doing work "));
		
	}

}
