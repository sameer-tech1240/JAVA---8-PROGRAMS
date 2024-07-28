package com.binaryOperatorInterface;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class OperationWithBinaryOperatorInterface {

	public static void main(String[] args) {

		BiFunction<String, String, String> str1 = (name, lname) -> name.toUpperCase() + lname.toUpperCase();

		BinaryOperator<String> str = (name, lname) -> name.toUpperCase() + lname.toUpperCase();

		System.out.println(str.apply("Sameer", " Siddiqui"));

		System.out.println(str1.apply("Sameer", " Siddiqui"));
	}

}
