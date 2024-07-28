package com.constructorRefrence;

import java.util.Arrays;
import java.util.List;

public class ConstructorReferenceExamplePeopleWithArray {

	public static void main(String[] args) {

		List<String> names = Arrays.asList("Sameer", "Aadil", "Ayaz", "Abu Bakar");

		List<Person> namesList = names.stream().map(Person::new).toList();

		System.out.println(namesList);
	}

}
