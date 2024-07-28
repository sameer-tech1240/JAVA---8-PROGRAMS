package com.biPredicate;

import java.util.List;
import java.util.function.BiPredicate;

public class CheckTwoListHaveSameElement {

	public static void main(String[] args) {

		BiPredicate<List<Integer>, List<Integer>> sameElements = (list1, list2) -> list1.equals(list2);

		List<Integer> list1 = List.of(1, 2, 3);

		List<Integer> list2 = List.of(2, 1, 3);

		System.out.println(sameElements.test(list1, list2));
	}

}
