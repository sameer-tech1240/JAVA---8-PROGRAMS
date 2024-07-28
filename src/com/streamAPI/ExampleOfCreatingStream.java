package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ExampleOfCreatingStream {

	public static void main(String[] args) {

		Stream<Integer> limit = Stream.iterate(1, num -> num + 1).limit(5);
		System.err.println("Printing Number using stream....");
		limit.forEach(System.out::println);

		List<Integer> number = Arrays.asList(1, 2, 3, 4, 5, 62);
		Stream<Integer> numberStream = number.stream();
		System.err.println("Print List Numbers....");
		numberStream.forEach(n -> System.out.println(n));

		String[] city = { "Mumbai", "Delhi", "Lucknow" };
		Stream<String> citytStream = Arrays.stream(city);
		System.err.println("Print Array of city...");
		citytStream.forEach(cityname -> {
			System.out.println(cityname);
		});
		

	}

}
