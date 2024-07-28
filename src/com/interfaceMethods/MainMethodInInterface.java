package com.interfaceMethods;

import java.util.List;
import java.util.stream.Collectors;

public interface MainMethodInInterface {
	
	static int add(int a, int b) {
		return a + b;
	}

	public static void main(String[] args) {
		List<Integer> of = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		List<Integer> collect = of.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println("Even Number List : " + collect);
		System.out.println("Odd NUmber List : " + of.stream().filter(i -> i % 2 != 0).collect(Collectors.toList()));
		System.out.println(MainMethodInInterface.add(1, 23));
	}

}
