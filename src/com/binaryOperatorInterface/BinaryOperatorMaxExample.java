package com.binaryOperatorInterface;

import java.util.function.BinaryOperator;

public class BinaryOperatorMaxExample {

	public static void main(String[] args) {

		BinaryOperator<Integer> max = (num, num1) -> num > num1 ? num : num1;

		System.out.println(max.apply(23, 12));
	}
	
}
