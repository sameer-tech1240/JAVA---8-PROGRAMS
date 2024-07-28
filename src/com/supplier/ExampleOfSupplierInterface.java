package com.supplier;

import java.util.function.Supplier;

public class ExampleOfSupplierInterface {

	public static void main(String[] args) {

		Supplier<Double> randomeSupplier = () -> Math.random();

		Double result = randomeSupplier.get();

		System.out.println(result);

	}

}
