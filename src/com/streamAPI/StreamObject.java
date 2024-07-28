package com.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamObject {
	public static void main(String[] args) {
		// Blank
		Stream<Object> stream = Stream.empty();
		String name[] = { "Sameer", "Aadil ", "Noor", "Ayaz", "Tufail" };

		// using array object (Group of objects)
		Stream<String> stream1 = Stream.of(name);
		stream1.forEach(e -> {
			System.out.println("Names :" + e);
		});

		// using builder methos of stream
		Stream<Object> build = Stream.builder().build();

		// using arrays with anonymous array object
		IntStream stream2 = Arrays.stream(new int[] { 21, 2, 3, 5, 43 });
		stream2.forEach(e -> {
			System.out.println("My numbers : " + e);
		});
		
		// List & Set etc...
		List<Integer> of = List.of(1,2,3,4,5,6,7);
		Stream<Integer> stream3 = of.stream();
		stream3.forEach(e -> {
			System.out.print(e);
		});
	}

}
