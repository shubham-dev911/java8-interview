package com.streamApi;

public class Employee {
	
	 private int id;
	 private String name;
	 private String dept;
	 private int salary;
	 private String address;
	
	public Employee() {
		
	}

	public Employee(int id,String name,String dept,int salary,String address) {
		this.id=id;
		this.name=name;
		this.dept=dept;
		this.salary=salary;
		this.address=address;
	}
	
	public void setId(int id) {
		this.id=id;
	}
	public int getId() {
		return id;
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

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", salary=" + salary + ", address="
				+ address + "]";
	}
	
	
}
