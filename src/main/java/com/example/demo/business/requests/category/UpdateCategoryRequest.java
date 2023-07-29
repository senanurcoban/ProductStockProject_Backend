package com.example.demo.business.requests.category;


import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCategoryRequest {

	@NotNull
	private int id;
	
	@NotNull
	@Size(min=3)
	private String name;
}
