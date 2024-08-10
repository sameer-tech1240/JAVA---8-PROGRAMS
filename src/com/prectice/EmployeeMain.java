package com.prectice;


import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {

		List<Employee> employeeData = List.of(new Employee(1, "Sameer", 1000d), new Employee(2, "Aadil", 1000d),
				new Employee(3, "Aamir", 1500d), new Employee(4, "AbuBakar", 1500d), new Employee(5, "Ayaz", 1500d),
				new Employee(6, "Ansarul", 6000d), new Employee(7, "Asad", 500d), new Employee(8, "Zaid", 900d),
				new Employee(9, "Tufail", 8000d), new Employee(10, "Khan", 8000d));

		List<List<Employee>> rankedEmployees = employeeData.stream()
				.sorted(Comparator.comparing(Employee::getSalary).reversed())
				.collect(Collectors.groupingBy(Employee::getSalary)).entrySet().stream()
				.sorted(Comparator.comparing(e -> -e.getKey())) // Sort by salary descending
				.map(entry -> entry.getValue()) // Extract employee lists
				.collect(Collectors.toList());

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Enter your salary rank (1, 2, etc.):");
			int enterSalaryRank = scanner.nextInt();
			int maxRank = rankedEmployees.size();

			if (enterSalaryRank < 1 || enterSalaryRank > maxRank) {
				throw new IllegalArgumentException("Invalid rank. Please enter a rank between 1 and " + maxRank);
			}

			List<Employee> employeesAtRank = rankedEmployees.get(enterSalaryRank - 1);
			System.out.println("Employees at rank " + enterSalaryRank + ": " + employeesAtRank);
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a number.");
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}
	}
	
	/*
	 * [1500=[Aamir,AbuBakr]]
	 * 
	 * 
	 * */
}

