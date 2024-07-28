package com.methodRefrence;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PersonMain {

	public static void main(String[] args) {

		List<Person> people = Arrays.asList(new Person("Sameer", 20), new Person("Noor", 21), new Person("Aadil", 22),
				new Person("Ayaz", 20));

		/*
		 * Instance method reference of an arbitrary object of a particular type
		 */

		List<Person> filterPeople = people.stream().filter(p -> p.getAge() > 20).collect(Collectors.toList());

		System.out.println("People older than 20: " + filterPeople);

		/* Static method refrence */

		List<String> names = people.stream().map(Person::getName).toList();

		System.err.println("People Names : " + names);

		/* Method Refrence..... */

		List<Person> compareByName = people.stream().sorted(Person::compareByName).toList();

		System.out.println("Sorted by name: " + compareByName);

	}

}
