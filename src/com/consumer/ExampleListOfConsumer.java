package com.consumer;

import java.util.List;
import java.util.function.Consumer;

public class ExampleListOfConsumer {

	public static void main(String[] args) {

		/*
		 * Consumer accept() method
		 */

		Consumer<List<Integer>> listConsumer = list -> {
			for (Integer element : list) {
				System.out.println(element + 100);
			}
		};
		/* listConsumer.accept(List.of(1, 2, 3, 4)); */

		/*
		 * Consumer andThen() method
		 */

		Consumer<List<Integer>> listConsumeandThen = lst -> {
			for (Integer values : lst)
				System.out.println(values);

		};
		listConsumeandThen.andThen(listConsumer).accept(List.of(1, 2, 3, 4));

	}

}
