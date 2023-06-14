package com.example;

public class Employee {
	
	private int Id;
	private String Name;
	private String Number;
	private String salary;
	
	public Employee(int id, String name, String number, String salary) {
		super();
		Id = id;
		Name = name;
		Number = number;
		this.salary = salary;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getNumber() {
		return Number;
	}

	public void setNumber(String number) {
		Number = number;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	public String toString() {
		return Id+" "+Name+" "+Number+" "+salary;
	}

}
