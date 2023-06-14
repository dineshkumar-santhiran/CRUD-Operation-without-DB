package com.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmployeeService {
	
	private static Map<Integer, Employee> employees = new HashMap<>();
	
	private static int intex = 3;
	
	static {
		employees.put(1, new Employee(1, "Dinesh", "9874562", "30000"));
		employees.put(2, new Employee(2, "Pravin", "329846", "450000"));
		employees.put(3, new Employee(3, "Arun", "948546", "28000"));
	}

	public static List<Employee> getAllEmployees() {
		
		return new ArrayList<>(employees.values());
	}

	public static Employee getEmployee(int id) {
		
		return employees.get(id);
	}

	public static String deleteEmployee(int id) {
		
		employees.remove(id);
		return "Employee Removed Successfully";
	}

	public static Employee addEmployee(Employee employee) {
		intex += 1;
		employee.setId(intex);
		employees.put(intex, employee);
		return employee;
	}

	public static Employee updateEmployee(int id, Employee employee) {
		employee.setId(id);
		employees.put(id, employee);
		return employee;
	}

	public static Employee getEmpTest(int id) {
		
		return employees.get(id);
	}
	
	

}
