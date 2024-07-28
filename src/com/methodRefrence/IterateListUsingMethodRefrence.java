package com.methodRefrence;

import java.util.Arrays;
import java.util.List;

public class IterateListUsingMethodRefrence {

	public static void main(String[] args) {

		List<Integer> asList = Arrays.asList(1, 2, 3, 4, 5, 6);

		asList.forEach(System.out::println);
	}

}
