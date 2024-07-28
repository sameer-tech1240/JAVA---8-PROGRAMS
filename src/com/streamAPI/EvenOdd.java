package com.streamAPI;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EvenOdd {
	public static void main(String[] args) {
		List<Integer> list = List.of(12, 32, 43, 56, 75, 41);
		// first way to find even numbers in list

		Stream<Integer> stream = list.stream();
		List<Integer> newList = stream.filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(newList);

		// second way

		List<Integer> evenList = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		List<Integer> oddList = list.stream().filter(i -> i % 2 != 0).collect(Collectors.toList());
		System.out.println("Even number in given list : " + evenList);
		System.out.println("Odd number in given list : " + oddList);

		// find number in given list which is grater than 50
		List<Integer> graterNumberList = list.stream().filter(i -> i > 50).collect(Collectors.toList());
		System.out.println(graterNumberList);

	}

}
