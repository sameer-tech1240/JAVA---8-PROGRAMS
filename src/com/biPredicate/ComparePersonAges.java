package com.biPredicate;

import java.util.function.BiPredicate;

class Person {
	String name;
	int age;

	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
}

public class ComparePersonAges {

	public static void main(String[] args) {

		BiPredicate<Person, Person> isOlder = (p1, p2) -> p1.age > p2.age;
		Person person1 = new Person("Sameer", 20);
		Person person2 = new Person("Aadil", 20);
		System.out.println(isOlder.test(person1, person2)); 

	}

}
