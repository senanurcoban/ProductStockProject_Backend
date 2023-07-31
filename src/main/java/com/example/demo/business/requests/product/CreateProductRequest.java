package com.example.demo.business.requests.product;


import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {

	 
	@NotNull
	private int categoryId;

	@NotNull
	private String name;
	
	@NotNull
	private double unitPrice;
	
	@NotNull
	private int unitsInStock;
	
   
	
}
