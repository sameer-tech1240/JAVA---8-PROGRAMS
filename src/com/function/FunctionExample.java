package com.function;

import java.util.function.Function;

public class FunctionExample {
	public static void main(String[] args) {
		Function<String, Integer> getLength = x -> x.length();
		System.out.println(getLength.apply("Sameer Siddiqui"));
		
		Function<String, String> getCharacter = c -> c.substring(0 , 4);
		System.out.println(getCharacter.apply("Aadil Noor"));
	}

}
