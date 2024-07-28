package com.biFunction;

import java.util.function.BiFunction;

public class AddTwoStringsLength {

	public static void main(String[] args) {

		BiFunction<String, String, Integer> length = (str1, str2) -> str1.length() + str2.length();
		System.out.println(length.apply("Sameer", "Aadil Noor"));
	}

}
