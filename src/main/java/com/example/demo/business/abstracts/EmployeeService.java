package com.example.demo.business.abstracts;

import java.util.List;


import com.example.demo.business.requests.employee.CreateEmployeeRequest;
import com.example.demo.business.requests.employee.UpdateEmployeeRequest;
import com.example.demo.business.responses.employee.CreateEmployeeResponse;
import com.example.demo.business.responses.employee.DeleteEmployeeResponse;
import com.example.demo.business.responses.employee.GetAllEmloyeesResponse;
import com.example.demo.business.responses.employee.GetEmployeeResponse;
import com.example.demo.business.responses.employee.UpdateEmployeeResponse;
import com.example.demo.core.result.DataResult;

public interface EmployeeService {

	
	DataResult<CreateEmployeeResponse> add(CreateEmployeeRequest createEmployeeRequest);
	DataResult<List<GetAllEmloyeesResponse>> getAll();
	DataResult<GetEmployeeResponse> getById(int id);
	DataResult<DeleteEmployeeResponse> delete(int id);
	DataResult<UpdateEmployeeResponse> update (UpdateEmployeeRequest updateEmployeeRequest);
	
}
