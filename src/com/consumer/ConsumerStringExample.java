package com.consumer;

import java.util.function.Consumer;

public class ConsumerStringExample {
	public static void main(String[] args) {

		Consumer<String> toUpperCaseConsumer = (s) -> System.out.println("Uppercase: " + s.toUpperCase());

		Consumer<String> printLengthConsumer = (s) -> System.out.println("Length: " + s.length());

		Consumer<String> combinedConsumer = toUpperCaseConsumer.andThen(printLengthConsumer);

		combinedConsumer.accept("hello world");
	}
}
