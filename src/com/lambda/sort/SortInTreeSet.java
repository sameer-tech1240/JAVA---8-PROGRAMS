package com.lambda.sort;

import java.util.Set;
import java.util.TreeSet;

public class SortInTreeSet {
	public static void main(String[] args) {
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(12);
		treeSet.add(11);
		treeSet.add(9);
		treeSet.add(23);
		treeSet.add(4);
		System.out.println("Before manual sorting : " + treeSet);

		Set<Integer> desc = new TreeSet<>((a, b) -> b - a);
		desc.add(12);
		desc.add(11);
		desc.add(9);
		desc.add(23);
		desc.add(4);
		System.out.println("After manual sorting desc : " + desc);

	}

}
