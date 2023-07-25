package com.example.demo.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.ProductService;
import com.example.demo.business.requests.product.CreateProductRequest;
import com.example.demo.business.requests.product.UpdateProductRequest;
import com.example.demo.business.responses.product.CreateProductResponse;
import com.example.demo.business.responses.product.DeleteProductResponse;
import com.example.demo.business.responses.product.GetAllProductsResponse;
import com.example.demo.business.responses.product.GetProductResponse;
import com.example.demo.business.responses.product.UpdateProductResponse;
import com.example.demo.dataAccess.abstracts.ProductRepository;

@Service
public class ProductManager implements ProductService{

	private ProductRepository productRepository;
	
	@Override
	public List<GetAllProductsResponse> getAll() {
		
		return null;
	}

	@Override
	public CreateProductResponse add(CreateProductRequest createProductRequest) {
		
		return null;
	}

	@Override
	public List<GetAllProductsResponse> getByName(String name) {
		
		return null;
	}

	@Override
	public GetProductResponse getById(int id) {
		
		return null;
	}

	@Override
	public DeleteProductResponse deleteProduct(int id) {
		
		return null;
	}

	@Override
	public UpdateProductResponse updateProduct(UpdateProductRequest updateProductRequest) {
		
		return null;
	}

}
