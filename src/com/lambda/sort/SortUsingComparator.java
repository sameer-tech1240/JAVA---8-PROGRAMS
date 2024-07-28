package com.lambda.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortUsingComparator {
	public static void main(String[] args) {
		List<Integer> of = new ArrayList<>();
		of.add(21);
		of.add(11);
		of.add(14);
		of.add(10);
		of.add(123);

		Collections.sort(of, (a, b) -> a - b);
		System.out.println("Ascending order : " + of);

		Collections.sort(of);
		System.out.println("Ascending order : " + of);

		Collections.sort(of, (a, b) -> b - a);
		System.out.println("Desending order : " + of);
	}

}
