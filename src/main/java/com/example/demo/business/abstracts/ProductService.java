package com.example.demo.business.abstracts;

import java.util.List;


import com.example.demo.business.requests.product.CreateProductRequest;
import com.example.demo.business.requests.product.UpdateProductRequest;
import com.example.demo.business.responses.product.CreateProductResponse;
import com.example.demo.business.responses.product.DeleteProductResponse;
import com.example.demo.business.responses.product.GetAllProductsResponse;
import com.example.demo.business.responses.product.GetProductResponse;
import com.example.demo.business.responses.product.UpdateProductResponse;
import com.example.demo.core.result.DataResult;

public interface ProductService {

	DataResult<List<GetAllProductsResponse>> getAll();
	DataResult<CreateProductResponse> add(CreateProductRequest createProductRequest);
	DataResult<GetAllProductsResponse> getByName(String name);
	DataResult<GetProductResponse> getById(int id);
	DataResult<DeleteProductResponse> deleteProduct(int id);
	DataResult<UpdateProductResponse> updateProduct(UpdateProductRequest updateProductRequest);
	
	
	
}
