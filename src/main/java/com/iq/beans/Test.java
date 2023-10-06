package com.iq.beans;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.iq.stream.que.Address;
import com.iq.stream.que.Employee;

public class Test {
	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<>();

		map.put(1, "tharun");
		map.put(4, "kumar");
		map.put(2, "u");
		map.put(3, "r");

//		Map<Integer, String> collect = map.entrySet().stream().sorted().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1,e2) -> e1));
//		System.out.println(collect);
//
//		map.entrySet().stream().sorted(Map.Entry.comparingByValue())
//				.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

		// map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(entry ->
		// System.out.println(entry.getKey() + " " + entry.getValue()));
		
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(each -> System.out.println(each.getKey() + " - " + each.getValue()));
		Address address = new Address("", "", 0);

		Employee employee = new Employee("tharun", 22, address);
		Employee employee1 = new Employee("p", 23, address);
		Employee employee2 = new Employee("t", 23, address);
		Employee employee3 = new Employee("ta", 24, address);
		Employee employee4 = new Employee("un", 24, address);
		Employee employee5 = new Employee("n", 22, address);

		List<Employee> asList = Arrays.asList(employee, employee1, employee2, employee3, employee4, employee5);

		Map<Integer, List<Employee>> collect = asList.stream().collect(Collectors.groupingBy(Employee::getAge));
		System.out.println(collect);

		asList.stream().filter(emp -> emp.getAge() > 23).collect(Collectors.toList()).forEach(System.out::println);
		System.out.println("--------------------------------------");
		Arrays.asList(1, 1, 2, 2, 3, 4, 5, 5).stream().distinct().collect(Collectors.toList())
				.forEach(System.out::print);

		System.out.println("--------------------------------------");
		Test t = new Test();
		t.test();

		System.out.println("--------------------------------------");

		String name = "racecar09";
		String longestpalindromeSubString = longestpalindromeSubString(name);
		System.out.println(longestpalindromeSubString);
		System.out.println("--------------------------------------");
		t.test2();
		System.out.println("--------------------------------------");
		t.test3();

		System.out.println("--------------------------------------");
		multidimensionalmatrix();
		
		
	}

	private void test() {
		int[] arr = { 10, 20, 50, 30, 60, 70 };
		Arrays.sort(arr);
		int k = 31;

		for (int i = 0; i < arr.length; i++) {
//			if(arr[i] < k) {
//				continue;
//				
//			}else {
//				System.out.println(i);
//				return;
//			}

			if (arr[i] > k) {
				System.out.println("index " + i);
				return;
			}
		}
	}

	private void test2() {
		Integer[] arr = { 5, 4, 3, 2, 1, 4, 2 };

		Arrays.stream(arr).collect(Collectors.groupingBy(e -> e, Collectors.counting())).entrySet().stream()
				.filter(entry -> entry.getValue() > 1)
				.forEach(en -> System.out.println("duplicate keys" + en.getKey()));
		// .map(Map.Entry::getKey)
		// .collect(Collectors.toList());
		// System.out.println(duplicates);

	}

	public void test3() {
		int[][] arr1 = { { 1, 2, 3 }, { 4, 5, 6 } }; // 2*3
		int[][] arr2 = { { 10, 20 }, { 30, 40 }, { 50, 60 } }; // 3*2
		int[][] result = new int[2][2];

		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 2; j++) {

				result[i][j] = 0;
				for (int k = 0; k < 3; k++) {
					result[i][j] = result[i][j] + arr1[i][k] * arr2[k][j];
				}
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void multidimensionalmatrix() {

		int[][] arr1 = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } }; // 3*4
		int[][] arr2 = { { 13, 14, 15 }, { 16, 17, 18 }, { 19, 20, 21 }, { 22, 23, 24 } }; // 4*3

		int[][] result = new int[3][3];

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {

				result[i][j] = 0;
				for (int k = 0; k < 4; k++) {
					result[i][j] += arr1[i][k] * arr2[k][j];
				}
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}

	}

	public static String longestpalindromeSubString(String string) {

		String lps = "";
		int length = string.length();

		for (int i = 0; i < length; i++) {
			String odd = expandpalindrome(string, i, i);
			String even = expandpalindrome(string, i, i + 1);

			if (lps.length() < odd.length()) {
				lps = odd;
			}

			if (lps.length() < even.length()) {
				lps = even;
			}
		}

		return lps;

	}

	public static String expandpalindrome(String string, int left, int right) {

		while (left >= 0 && right < string.length() && string.charAt(left) == string.charAt(right)) {
			left--;
			right++;
		}
		return string.substring(left + 1, right);
	}

}
