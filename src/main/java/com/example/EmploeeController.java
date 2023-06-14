package com.example;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmploeeController {
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees(){
		return EmployeeService.getAllEmployees();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployeeDetails(@PathVariable int id) {
		
		return EmployeeService.getEmployee(id);
	}
	
	@PostMapping("/addEmployee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return EmployeeService.addEmployee(employee);
	}
	
	@PutMapping("/updateEmployee/{id}")
	public Employee updateEmployee(@RequestBody Employee employee, @PathVariable int id) {
		return EmployeeService.updateEmployee(id,employee);
	}
	
	@DeleteMapping("/deleteEmployee/{id}" )
	public String deleteEmployee(@PathVariable int id) {
		return EmployeeService.deleteEmployee(id);
	}
	
	@GetMapping("/employes")
	public Employee getemp(@RequestParam int id) {
		return EmployeeService.getEmpTest(id);
	}

}
