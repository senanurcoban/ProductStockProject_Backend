package com.example.demo.business.abstracts;

import java.util.List;


import com.example.demo.business.requests.employee.CreateEmployeeRequest;
import com.example.demo.business.requests.employee.DeleteEmployeeRequest;
import com.example.demo.business.requests.employee.UpdateEmployeeRequest;
import com.example.demo.business.responses.employee.CreateEmployeeResponse;
import com.example.demo.business.responses.employee.DeleteEmployeeResponse;
import com.example.demo.business.responses.employee.GetAllEmloyeesResponse;
import com.example.demo.business.responses.employee.GetEmployeeResponse;
import com.example.demo.business.responses.employee.UpdateEmployeeResponse;

public interface EmployeeService {

	List<GetAllEmloyeesResponse> getAll();
	CreateEmployeeResponse add(CreateEmployeeRequest createEmployeeRequest);
	List<GetEmployeeResponse> getByFirstName(String name);
	DeleteEmployeeResponse deleteEmployee(DeleteEmployeeRequest deleteEmployeeRequest);
	UpdateEmployeeResponse updateEmployee(UpdateEmployeeRequest updateEmployeeRequest);
}
