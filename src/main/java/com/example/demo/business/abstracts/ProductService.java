package com.example.demo.business.abstracts;

import java.util.List;


import com.example.demo.business.requests.product.CreateProductRequest;
import com.example.demo.business.requests.product.UpdateProductRequest;
import com.example.demo.business.responses.product.CreateProductResponse;
import com.example.demo.business.responses.product.DeleteProductResponse;
import com.example.demo.business.responses.product.GetAllProductsResponse;
import com.example.demo.business.responses.product.GetProductResponse;
import com.example.demo.business.responses.product.UpdateProductResponse;

public interface ProductService {

	List<GetAllProductsResponse> getAll();
	CreateProductResponse add(CreateProductRequest createProductRequest);
	List<GetAllProductsResponse> getByName(String name);
	GetProductResponse getById(int id);
	DeleteProductResponse deleteProduct(int id);
	UpdateProductResponse updateProduct(UpdateProductRequest updateProductRequest);
}
