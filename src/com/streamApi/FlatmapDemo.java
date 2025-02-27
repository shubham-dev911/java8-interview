package com.streamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

class Worker {
	int id;
	String name;
	String dept;
	List<String> citiesWorked;
	double salary;

	public Worker() {

	}

	public Worker(int id, String name, String dept, List<String> citiesWorked, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.citiesWorked = citiesWorked;
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

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public List<String> getCitiesWorked() {
		return citiesWorked;
	}

	public void setCitiesWorked(List<String> citiesWorked) {
		this.citiesWorked = citiesWorked;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Worker [id=" + id + ", name=" + name + ", dept=" + dept + ", citiesWorked=" + citiesWorked + ", salary="
				+ salary + "]";
	}

}

public class FlatmapDemo {

	public static void main(String[] args) {
		Worker w1 = new Worker(101, "Ramesh", "EE", Arrays.asList("Pune", "Mumbai"), 75000.0);
		Worker w2 = new Worker(102, "Aarohi", "IT", Arrays.asList("Pune", "Mumbai", "Nagpur", "Calcutta"), 52000.0);
		Worker w3 = new Worker(103, "Priti", "HR", Arrays.asList("Pune", "Mumbai", "Banglore", "Aurangbad"), 72000.0);
		Worker w4 = new Worker(104, "Mukund", "IT", Arrays.asList("Pune", "Mumbai", "Chennai", "Delhi"), 47000.0);

		List<Worker> list = Arrays.asList(w1, w2, w3, w4);

		Set<String> set = list.stream().flatMap(worker -> worker.getCitiesWorked().stream())
				.collect(Collectors.toSet());

		System.out.println(set);
	}

}
