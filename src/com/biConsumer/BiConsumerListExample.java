package com.biConsumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;

public class BiConsumerListExample {

	public static void main(String[] args) {

		BiConsumer<List<String>, String> appendToEach = (list, suffix) -> {

			for (int i = 0; i < list.size(); i++)
				list.set(i, list.get(i) + suffix);
		};

		List<String> fruitList = new ArrayList<>();
		fruitList.add("Apple");
		fruitList.add("Banana");
		fruitList.add("Cherry");
		appendToEach.accept(fruitList, " Fruit");

		System.out.println("Updated List : " + fruitList);
	}

}
