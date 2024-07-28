package com.lambda.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentMain {
	public static void main(String[] args) {
		Student student1 = new Student(1, "Sameer", "9987654329", "Wajid ali compound 90ft road sakinaka..");
		Student student2 = new Student(2, "Aadil Noor", "9078563409", "Wajid ali compound sakinaka..");
		Student student3 = new Student(3, "Ayaz", "1234236543", "Wajid ali compound sakinaka..");
		Student student4 = new Student(4, "Dilshad", "4365789645", "santosh bhawan nallasopara..");

		List<Student> arrayList = new ArrayList<>();
		arrayList.add(student1);
		arrayList.add(student2);
		arrayList.add(student3);
		arrayList.add(student4);

		Collections.sort(arrayList, (a, b) -> b.getId() - a.getId());
		for (Student student : arrayList) {
			System.out.println(student);
		}

	}

}
