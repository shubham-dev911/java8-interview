package com.trickyQuestions;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.management.openmbean.OpenDataException;

public class Java8Demo {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 12, 3, 1, 5, 6, 55, 53, 5);
		// first occurance
		list.stream().findFirst().ifPresent(System.out::println);

		// no.of element present
		Long count = list.stream().count();
		System.out.println(count);

		// all even numbers
		List<Integer> evenNumbers = list.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
		System.out.println("Even numbers : " + evenNumbers);

		// all odd numbers
		List<Integer> oddNumbers = list.stream().filter(num -> num % 2 != 0).collect(Collectors.toList());
		System.out.println("Odd numbers : " + oddNumbers);

		// numbers starting with 5
		List<Integer> startsWith5 = list.stream().filter(num -> num.toString().startsWith("5"))
				.collect(Collectors.toList());
		System.out.println(startsWith5);

		// find duplicate element in list
		Set<Integer> set = new HashSet<>();
		list.stream().filter(num -> !set.add(num)).forEach(System.out::print);

		// find max and min from given list
		Integer min = list.stream().min(Integer::compareTo).get();
		Integer max = list.stream().max(Integer::compareTo).get();
		System.out.println("min : " + min);
		System.out.println("max : " + max);

		// sort the list
		// asceiding
		List<Integer> ascendingList = list.stream().sorted().collect(Collectors.toList());
		System.out.println("Ascending : " + ascendingList);
		// descending
		List<Integer> descendingList = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
		System.out.println("Descending : " + descendingList);

		// array contains dupliacte number or not
		int[] arr = { 2, 5, 6, 3, 3, 7, 8, 6, 4, 1 };
		if (Arrays.stream(arr).distinct().count() != arr.length) {
			System.out.println(" contains duplicate values");
		} else {
			System.out.println(" contains unique values");
		}

		// square all the elements and filter greater than 50
		List<Integer> l1 = list.stream().map(num -> num * num).filter(num1 -> num1 > 50).collect(Collectors.toList());
		System.out.println(l1);

		// convert array and convert into stream
		Arrays.stream(arr).sorted().forEach(System.out::println);

		// list of string convert it to uppercase
		List<String> letters = Arrays.asList("abc", "pqr", "klo", "wert", "abc", "pqr");
		List<String> uppercase = letters.stream().map(letter -> letter.toUpperCase()).collect(Collectors.toList());
		System.out.println(uppercase);

		// maximum element length in Array
		String[] str = { "abc", "pwr", "they", "Lombndud" };
		Optional<Integer> res = Arrays.stream(str).map(s -> s.length()).sorted(Comparator.reverseOrder()).findFirst();
		System.out.println(res);

		// concat to stream
		Stream<Integer> s1 = Stream.of(1, 2, 3);
		Stream<Integer> s2 = Stream.of(4, 5, 6);
		Stream.concat(s1, s2).forEach(System.out::println);
		;

		// to print 10 reandom numbers
		Random random = new Random();
		Stream.generate(random::nextInt).limit(10).forEach(System.out::println);

		// print date using java 8
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);

		// convert above into dd-mm-yyyy format
		DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd-MM-yyy");
		System.out.println(dateTimeFormatter.format(localDateTime));

		// print not null
		List<String> strs = null;
		Optional<List<String>> optionalString = Optional.ofNullable(strs);
		optionalString.ifPresentOrElse(s -> s.stream().forEach(System.out::println),
				() -> System.out.println("List is empty"));

		// no. of occurance of integers in an array
		int[] i = { 2, 3, 4, 1, 3, 4, 2, 6, 2, 3, 1, 5 };
		Long occurance = Arrays.stream(i).filter(num -> num == 2).count();
		System.out.println(occurance);

		// only duplicate element in arrayList
		Map<String, Long> map = letters.stream().collect(Collectors.groupingBy(s -> s, Collectors.counting()));
		map.entrySet().stream().filter(num -> num.getValue() > 1)
				.forEach(s -> System.out.println(s.getKey() + " : " + s.getValue()));

		// sum of all salaries
		Employee e1 = new Employee(101, "Mohan", 55000.0);
		Employee e2 = new Employee(102, "Prakash", 63000.0);
		Employee e3 = new Employee(103, "Pankaj", 48000.0);
		Employee e4 = new Employee(104, "Akshay", 79000.0);
		Employee e5 = new Employee(105, "Akshay", 99000.0);

		List<Employee> emps = Arrays.asList(e1, e2, e3, e4, e5);
		Double totalSalary = emps.stream().collect(Collectors.summingDouble(Employee::getSalary));
		Double totalSalary1 = emps.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println(totalSalary);
		System.out.println(totalSalary1);

		// count occurance of each chracter in String usimg stream
		String word = "devByteSchool";
		Map<Character, Long> m1 = word.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(m1);

		// unique emps by name
		Map<String, Double> uniqueEmployees = emps.stream().collect(
				Collectors.toMap(Employee::getName, Employee::getSalary, (existing, replacement) -> replacement));
		System.out.println(uniqueEmployees);

		// find first non repeated character in string
		System.out.println("First non repeated character is : "+findFirstNonReapitngChar("amravati"));

	}
			// find first non repeated character in string
			public static Character findFirstNonReapitngChar(String str) {
				if (str == null || str.isEmpty()) {
					return null;
				}
					Map<Character, Long> charCounts = str.chars().mapToObj(c -> (char) c)
							.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));

					return charCounts.entrySet().stream().filter(enty -> enty.getValue() == 1).map(Map.Entry::getKey)
							.findFirst().orElse(null);
			}
}

class Employee {
	private int id;
	private String name;
	private Double salary;

	public Employee(int id, String name, Double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

}
