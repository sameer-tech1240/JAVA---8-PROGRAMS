package com.prectice;

import java.util.Arrays;

public class FindSmallestElementInArray {

	public static void main(String[] args) {

		int a[] = { 12, 32, 43, 5, 4, 65, 21 };

		int smallValue = Arrays.stream(a).sorted().findFirst().getAsInt();

		System.out.println("Smallest element in array : " + smallValue);

		
	}

}
