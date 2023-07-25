package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.EmployeeService;
import com.example.demo.business.requests.employee.CreateEmployeeRequest;
import com.example.demo.business.requests.employee.DeleteEmployeeRequest;
import com.example.demo.business.requests.employee.UpdateEmployeeRequest;
import com.example.demo.business.responses.employee.CreateEmployeeResponse;
import com.example.demo.business.responses.employee.DeleteEmployeeResponse;
import com.example.demo.business.responses.employee.GetAllEmloyeesResponse;
import com.example.demo.business.responses.employee.GetEmployeeResponse;
import com.example.demo.business.responses.employee.UpdateEmployeeResponse;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

	private EmployeeService employeeService;

	@GetMapping("/getall")
	public List<GetAllEmloyeesResponse> getAll(){
		return employeeService.getAll();
	}
	
	@PostMapping("/add")
	public CreateEmployeeResponse add(@RequestBody CreateEmployeeRequest createEmployeeRequest) {
		 return this.employeeService.add(createEmployeeRequest);
	}
	@GetMapping("/getByFirstName")
	public List<GetEmployeeResponse> getByFirstName(String name) {
		return employeeService.getByFirstName(name);
    }
	 @DeleteMapping("/delete")
		public DeleteEmployeeResponse deleteEmployee(DeleteEmployeeRequest deleteEmployeeRequest) {
			return employeeService.deleteEmployee(deleteEmployeeRequest);
		}
		@PutMapping("/update")
		public UpdateEmployeeResponse updateEmployee(UpdateEmployeeRequest updateEmployeeRequest) {
			return employeeService.updateEmployee(updateEmployeeRequest);
		}
}
