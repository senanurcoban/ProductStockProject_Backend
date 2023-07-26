package com.example.demo.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.EmployeeService;
import com.example.demo.business.requests.employee.CreateEmployeeRequest;
import com.example.demo.business.requests.employee.UpdateEmployeeRequest;
import com.example.demo.business.responses.employee.CreateEmployeeResponse;
import com.example.demo.business.responses.employee.DeleteEmployeeResponse;
import com.example.demo.business.responses.employee.GetAllEmloyeesResponse;
import com.example.demo.business.responses.employee.GetEmployeeResponse;
import com.example.demo.business.responses.employee.UpdateEmployeeResponse;
import com.example.demo.core.exceptions.BusinessException;
import com.example.demo.core.mapping.ModelMapperService;
import com.example.demo.core.messages.BusinessMessage;
import com.example.demo.core.result.DataResult;
import com.example.demo.core.result.SuccessDataResult;
import com.example.demo.dataAccess.abstracts.EmployeeRepository;
import com.example.demo.entities.Employee;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeManager implements EmployeeService{
	
	private ModelMapperService modelMapperService;
	private EmployeeRepository employeeRepository;
	
	@Override
	public DataResult<CreateEmployeeResponse> add(CreateEmployeeRequest createEmployeeRequest) {
		Employee employee = this.modelMapperService.forRequest().map(createEmployeeRequest,Employee.class);
        this.employeeRepository.save(employee);
        CreateEmployeeResponse createEmployeeResponse= this.modelMapperService.forResponse().map(employee, CreateEmployeeResponse.class);
        return new SuccessDataResult<>(createEmployeeResponse, BusinessMessage.GlobalMessages.DATA_ADDED_SUCCESSFULLY);
		
	}

	@Override
	public DataResult<List<GetAllEmloyeesResponse>> getAll() {
		 List<Employee> employees = this.employeeRepository.findAll();
	     List<GetAllEmloyeesResponse> getAllEmployeeResponses = employees.stream().map(employee -> this.modelMapperService.forResponse().map(employee,GetAllEmloyeesResponse.class)).collect(Collectors.toList());
	     return new SuccessDataResult<>(getAllEmployeeResponses,BusinessMessage.GlobalMessages.DATA_LISTED_SUCCESSFULLY);
		
	}

	@Override
	public DataResult<GetEmployeeResponse> getById(int id) {
		 checkIfExistsById(id);
		 Employee employee = this.employeeRepository.findById(id).get();
	     GetEmployeeResponse getAllEmployeeResponse= this.modelMapperService.forResponse().map(employee, GetEmployeeResponse.class);
	     return new SuccessDataResult<>(getAllEmployeeResponse,BusinessMessage.GlobalMessages.DATA_LISTED_SUCCESSFULLY);
		
	}

	@Override
	public DataResult<DeleteEmployeeResponse> delete(int id) {
		checkIfExistsById(id);
		Employee employee = this.employeeRepository.findById(id).get();
        DeleteEmployeeResponse deleteEmployeeResponse = this.modelMapperService.forResponse().map(employee, DeleteEmployeeResponse.class);
        this.employeeRepository.delete(employee);
        return new SuccessDataResult<>(deleteEmployeeResponse,BusinessMessage.GlobalMessages.DATA_DELETED_SUCCESSFULLY);
		
	}

	@Override
	public DataResult<UpdateEmployeeResponse> update(UpdateEmployeeRequest updateEmployeeRequest) {
		  checkIfExistsById(updateEmployeeRequest.getId());
		  Employee employee = this.modelMapperService.forRequest().map(updateEmployeeRequest,Employee.class);
	      this.employeeRepository.save(employee);
	      UpdateEmployeeResponse updateEmployeeResponse= this.modelMapperService.forResponse().map(employee, UpdateEmployeeResponse.class);
	      return new SuccessDataResult<>(updateEmployeeResponse, BusinessMessage.GlobalMessages.DATA_UPDATED_SUCCESSFULLY);
		
	}
	
	
	private void checkIfExistsById(int id) {
        if (!this.employeeRepository.existsById(id)){
            throw new BusinessException(BusinessMessage.Employee.Employee_LIST_EMPTY);
        }
    }
	
}
