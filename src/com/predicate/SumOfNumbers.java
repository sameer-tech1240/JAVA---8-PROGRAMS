package com.predicate;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbers {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,2,3,4,5,4,3,2,1);
		int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();
		System.out.println(sum);
	}

}
