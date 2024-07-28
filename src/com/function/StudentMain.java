package com.function;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StudentMain {
	public static void main(String[] args) {
		Function<String, String> getCharacter = c -> c.substring(0, 5);
		System.out.println(getCharacter.apply("Aadil Noor"));

		Function<List<Student>, List<Student>> studentWithContaisA = li -> {
			List<Student> result = new ArrayList<>();
			for (Student student : li) {
				if (getCharacter.apply(student.getName().toLowerCase()).contains("a")) {
					result.add(student);
				}
			}
			return result;
		};

		Student student = new Student(1, "Sameer", "Sakinaka");
		Student student2 = new Student(2, "Aadil", "Mumbai");
		Student student3 = new Student(3, "Ayazk", "Sakinaka");
		List<Student> asList = Arrays.asList(student, student2, student3);

		List<Student> filteredStudent = studentWithContaisA.apply(asList);

		filteredStudent.forEach(s -> {
			System.out.println(s);
		});

		// System.out.println(filteredStudent);
	}
}