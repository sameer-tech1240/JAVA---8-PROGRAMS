package com.biPredicate;

import java.util.List;
import java.util.function.BiPredicate;

public class CheckListEqualOrNot {

	public static void main(String[] args) {

		BiPredicate<List<Integer>, List<Integer>> l = (lst, lst1) -> lst.size() != lst1.size();

		System.out.println(l.test(List.of(1, 2, 3), List.of(1, 2, 3)));
	}

}
