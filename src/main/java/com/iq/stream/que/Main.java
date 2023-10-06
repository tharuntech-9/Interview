package com.iq.stream.que;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		Address address1=new Address("Gandhi street", "tirupati", 517501);
		Address address2=new Address("yashoda street", "ongole", 517709);
		Address address3=new Address("sapthagiri street", "tirupati", 517501);
		Address address4=new Address("housgton street", "tirupati", 517501);
		Address address5=new Address("jamica street", "vizag", 656543);
		
		Employee employee1=new Employee("Tharun", 23, address1);
		Employee employee2=new Employee("pavan", 29, address2);
		Employee employee3=new Employee("kiran", 28, address1);
		Employee employee4=new Employee("siva", 20, address1);
		Employee employee5=new Employee("lohith", 23, address4);
		
		List<Employee> employees=Arrays.asList(employee1,employee2,employee3,employee4,employee5);
		
		Map<Integer, List<Employee>> collect = employees.stream().collect(Collectors.groupingBy(Emp -> Emp.getAddress().pincode));
		System.out.println(collect);
		
		Map<Integer, List<Employee>> collect2 = employees.stream().collect(Collectors.groupingBy(Employee::getAge));
		System.out.println(collect2);
		
		List<Integer> integers=Arrays.asList(1,2,8,4,4,3,2);
		integers.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
	}
}
