package com.example.demo.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.EmployeeService;
import com.example.demo.business.requests.employee.CreateEmployeeRequest;
import com.example.demo.business.requests.employee.UpdateEmployeeRequest;
import com.example.demo.business.responses.employee.CreateEmployeeResponse;
import com.example.demo.business.responses.employee.DeleteEmployeeResponse;
import com.example.demo.business.responses.employee.GetAllEmloyeesResponse;
import com.example.demo.business.responses.employee.GetEmployeeResponse;
import com.example.demo.business.responses.employee.UpdateEmployeeResponse;
import com.example.demo.core.result.DataResult;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeManager implements EmployeeService{
	@Override
	public DataResult<CreateEmployeeResponse> add(CreateEmployeeRequest createEmployeeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<List<GetAllEmloyeesResponse>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<GetEmployeeResponse> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<DeleteEmployeeResponse> delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<UpdateEmployeeResponse> update(UpdateEmployeeRequest updateEmployeeRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<GetEmployeeResponse> getByFirstName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
