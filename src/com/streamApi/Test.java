package com.streamApi;

import java.util.ArrayList;	
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	
	public static void main(String[] args) {
		
	
	Employee e1=new Employee(101,"Mahesh","Dev",50000,"Pune");
	Employee e2=new Employee(102,"Naman","HR",48000,"Nagpur");
	Employee e3=new Employee(103,"Raghav","QA",40000,"Pune");
	Employee e4=new Employee(104,"Suman","Dev",61000,"Nashik");
	Employee e5=new Employee(105,"Ravi","HR",65000,"Nagpur");
	Employee e6=new Employee(106,"Pranita","Dev",56000,"Nashik");
	Employee e7=new Employee(107,"Lata","QA",73000,"Nagar");
	Employee e8=new Employee(108,"Sonu","QA",61000,"Pune");
	Employee e9=new Employee(109,"Gokul","Dev",52000,"Nagar");
	
	List<Employee> emps = new ArrayList<>();
	emps.add(e1);
	emps.add(e2);
	emps.add(e3);
	emps.add(e4);
	emps.add(e5);
	emps.add(e6);
	emps.add(e7);
	emps.add(e8);
	emps.add(e9);
	
	List<Employee> fiftyPlusSalary=emps.stream().filter(emp->emp.getSalary()>=50000).collect(Collectors.toList());
	System.out.println(fiftyPlusSalary);
	
	Map<String, Long> map = emps.stream().collect(Collectors.groupingBy(Employee::getDept , Collectors.counting()));
	System.out.println(map);
	
	//print all depts
	emps.stream().map(emp->emp.getDept()).distinct().forEach(System.out::println);
	
	//avg salary of each dept
	Map<String, Double>map1=emps.stream().collect(Collectors.groupingBy(Employee::getDept , Collectors.averagingInt(Employee::getSalary)));
	System.out.println(map1);
	
	//highest salary
	Employee e=emps.stream().collect(Collectors.maxBy(Comparator.comparingInt(Employee::getSalary))).get();
	System.out.println(e);
	
	//nth highest salary
	Integer sal= emps.stream().map(emp->emp.getSalary()).sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
	System.out.println(sal);
	
	//summary
	DoubleSummaryStatistics summary=emps.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
	System.out.println(summary);
	
	Immutable im = new Immutable("ABC123");
	String s1 =im.getPancardNumber();
	s1.concat(s1);
	System.out.println(s1);
}
}
