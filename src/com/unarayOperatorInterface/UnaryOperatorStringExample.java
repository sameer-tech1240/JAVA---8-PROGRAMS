package com.unarayOperatorInterface;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorStringExample {
	public static void main(String[] args) {

		Function<String, String> trans = str1 -> str1.toUpperCase().trim() + "!!!";

		UnaryOperator<String> transform = str -> str.toUpperCase().trim() + "!!!";

		String input = " hello world ";

		System.out.println("Transformed: " + transform.apply(input));

		System.out.println("Transformed: " + trans.apply(input));
	}
}
