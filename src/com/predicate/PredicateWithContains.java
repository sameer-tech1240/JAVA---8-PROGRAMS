package com.predicate;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateWithContains {
	
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter name here : ");
		String name = scanner.nextLine();
		Predicate<String> contains = x -> x.toLowerCase().charAt(0) == 's';
		System.out.println(contains.test(name));
        scanner.close();
	}

}
