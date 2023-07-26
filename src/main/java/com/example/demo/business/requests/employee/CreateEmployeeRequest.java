package com.example.demo.business.requests.employee;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateEmployeeRequest {

	@NotNull
	@Size(min=3)
	private String firstName;
	
	@NotNull
	private String lastName;
	
	@NotNull
	private int salary;
}
