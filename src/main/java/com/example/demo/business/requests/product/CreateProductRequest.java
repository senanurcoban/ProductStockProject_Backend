package com.example.demo.business.requests.product;


import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {

	@NotNull
	@NotEmpty
	private int categoryId;
	
	@NotEmpty
	private String name;
	
	@NotEmpty
	private double unitPrice;
	
	@NotEmpty
	private int unitsInStock;
}
