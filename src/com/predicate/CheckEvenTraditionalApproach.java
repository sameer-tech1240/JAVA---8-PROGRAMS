package com.predicate;

import java.util.function.Predicate;

public class CheckEvenTraditionalApproach implements Predicate<Integer> {
	@Override
	public boolean test(Integer t) {
		if (t % 2 == 0) {
			return true;
		}
		return false;
	}

	public static void main(String[] args) {
		CheckEvenTraditionalApproach checkEvenNumber = new CheckEvenTraditionalApproach();
		System.out.println(checkEvenNumber.test(101));
	}
}