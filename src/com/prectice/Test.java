package com.prectice;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Test {

	public static void main(String[] args) {

		Function<String, String> name = str -> str.toUpperCase();

		UnaryOperator<String> unary = names -> names.toLowerCase();
		BiFunction<Integer, Integer, Integer> stBiFunction = (s, s1) -> s > s1 ? s : s1;

		BinaryOperator<Integer> binaryOperator = (s, s1) -> s > s1 ? s : s1;

	}

}
