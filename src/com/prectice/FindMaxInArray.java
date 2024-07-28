package com.prectice;

import java.util.Arrays;
import java.util.OptionalInt;

public class FindMaxInArray {

	public static void main(String[] args) {

		int a[] = { 333, 56, 64, 34, 2, 32 };

		int maxNumber = Arrays.stream(a).max().getAsInt();

		System.out.println("Max number in given array : " + maxNumber);

		/* Second way to find this... */

		OptionalInt maxNum = Arrays.stream(a).reduce((left, right) -> left > right ? left : right);

		System.out.println("Max number in given array : " + maxNum);
	}

}
