package com.iq.interview;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		Employee employee1 = new Employee("hari", 21, "male", "IT");
		Employee employee2 = new Employee("deva", 23, "male", "IT");
		Employee employee3 = new Employee("sai", 25, "male", "HR");
		Employee employee4 = new Employee("pavani", 21, "female", "HR");
		Employee employee5 = new Employee("harika", 27, "female", "ACCOUNTS");
		Employee employee6 = new Employee("Eshwar", 30, "male", "IT");
		Employee employee7 = new Employee("hari", 21, "male", "ACCOUNTS");

		List<Employee> employees = Arrays.asList(employee1, employee2, employee3, employee4, employee5, employee6,
				employee7);

		List<Employee> collect = employees.stream()
				.sorted(Comparator.comparing(Employee::getName).thenComparingInt(Employee::getAge))
				.collect(Collectors.toList());

		collect.forEach(System.out::println);

		Map<String, Map<String, List<Employee>>> map = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment, Collectors.groupingBy(Employee::getGender)));

		map.forEach((department, gendermap) -> {
			System.out.println("Department  = " + department);
			gendermap.forEach((gender, employeelist) -> {
				System.out.println("gender = " + gender);
				employeelist.forEach(System.out::println);

			});
		});
	}

}
