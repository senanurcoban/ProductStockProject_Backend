package com.example.demo.business.responses.product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetProductResponse {

	  private int id;
	  private String name;
	  private double unitPrice;
	  private int  unitsInStock;
	  private int categoryId;
}
