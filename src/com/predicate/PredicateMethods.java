package com.predicate;

import java.util.function.Predicate;

public class PredicateMethods {
	public static void main(String[] args) {

		Predicate<String> containsS = x -> x.toLowerCase().charAt(0) == 's';
		System.out.println(containsS.test("sameer"));

		/* and() method & test() method also */

		Predicate<String> startsWithS = x -> x.toLowerCase().startsWith("s");
		Predicate<String> lengthGreaterThan5 = x -> x.length() > 5;
		Predicate<String> startsWithSAndLengthGreaterThan5 = startsWithS.and(lengthGreaterThan5);

		System.out.println(startsWithSAndLengthGreaterThan5.test("Sam"));
		System.out.println(startsWithSAndLengthGreaterThan5.test("Sameer"));
		System.out.println(startsWithSAndLengthGreaterThan5.test("Aadil"));

		/* or() method */
		Predicate<String> or = startsWithS.or(startsWithSAndLengthGreaterThan5);
		System.out.println(or.test("amee"));

	}

}
