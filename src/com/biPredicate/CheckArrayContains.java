package com.biPredicate;

import java.util.Arrays;
import java.util.function.BiPredicate;

public class CheckArrayContains {

	public static void main(String[] args) {

		BiPredicate<int[], int[]> containsAll = (arr1, arr2) -> Arrays.stream(arr2)
				.allMatch(x -> Arrays.stream(arr1).anyMatch(y -> y == x));

		int[] array1 = { 1, 2, 3, 4, 5 };
		int[] array2 = { 2 };
		System.out.println(containsAll.test(array1, array2));

	}

}
