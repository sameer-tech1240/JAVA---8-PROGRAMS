package com.constructorRefrence;

import java.util.function.Function;

public class ConstructorReferenceExamplePeople {
	public static void main(String[] args) {
		// Constructor reference
		Function<String, Person> personCreator = Person::new;

		Person person = personCreator.apply("Sameer");
		System.out.println(person);
	}
}
