package com.example.demo.business.requests.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductRequest {

	private int id;
	private int categoryId;
	private String name;
	private double unitPrice;
	private int unitsInStock;
}
