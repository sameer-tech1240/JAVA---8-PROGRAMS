package com.prectice;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class UserMain {

	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
			System.out.println("Enter the input for salary");
			String input = br.readLine();
			int nth = Integer.parseInt(input);
			var user = List.of(new User(1, "Sameer", 1000d), new User(2, "Aadil", 1000d), new User(3, "Aamir", 1500d),
					new User(4, "AbuBakar", 1500d), new User(5, "Ayaz", 1500d), new User(6, "Ansarul", 6000d),
					new User(7, "Asad", 500d), new User(8, "Zaid", 900d), new User(9, "Tufail", 8000d),
					new User(10, "Khan", 8000d));

			Entry<Double, List<String>> nthNoOfUser = getNthNoOfSalaryEmployee(nth, user);
			System.out.println(nthNoOfUser);

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static Entry<Double, List<String>> getNthNoOfSalaryEmployee(int nth, List<User> user) {
		if (nth > user.size()) {
			throw new RuntimeException("Invalid input");
		}
		return user.stream()
				.collect(Collectors.groupingBy(User::salary, Collectors.mapping(User::name, Collectors.toList())))
				.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByKey())).toList().get(nth);

	}
}

record User(int id, String name, Double salary) {
}
