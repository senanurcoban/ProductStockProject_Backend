package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.ProductService;
import com.example.demo.business.requests.product.CreateProductRequest;
import com.example.demo.business.requests.product.UpdateProductRequest;
import com.example.demo.business.responses.product.CreateProductResponse;
import com.example.demo.business.responses.product.DeleteProductResponse;
import com.example.demo.business.responses.product.GetAllProductsResponse;
import com.example.demo.business.responses.product.GetProductResponse;
import com.example.demo.business.responses.product.UpdateProductResponse;
import com.example.demo.core.result.DataResult;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/api/products")
public class ProductController {

	private ProductService productService;
	
	@GetMapping("/getall")
	public DataResult<List<GetAllProductsResponse>> getAll() {
		return productService.getAll();
	}
	
	@PostMapping("/add")
	public DataResult<CreateProductResponse> add(@RequestBody CreateProductRequest createProductRequest) {
		return productService.add(createProductRequest);
		
	}
	
	@GetMapping("/getbyname")
	public DataResult<GetAllProductsResponse> getByName(String name) {
		return productService.getByName(name);
	}

	@GetMapping("/getbyid")
	public DataResult<GetProductResponse> getById(int id) {
		return productService.getById(id);
	}
	@DeleteMapping("/delete")
	public DataResult<DeleteProductResponse> deleteById(int id) {
		return productService.deleteProduct(id);
	}
	@PutMapping("/update")
	public DataResult<UpdateProductResponse> updateProduct(@RequestBody UpdateProductRequest updateProductRequest) {
		return productService.updateProduct(updateProductRequest);
	}
	
}
