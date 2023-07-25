package com.example.demo.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.ProductService;
import com.example.demo.business.requests.product.CreateProductRequest;
import com.example.demo.business.requests.product.UpdateProductRequest;
import com.example.demo.business.responses.product.CreateProductResponse;
import com.example.demo.business.responses.product.DeleteProductResponse;
import com.example.demo.business.responses.product.GetAllProductsResponse;
import com.example.demo.business.responses.product.GetProductResponse;
import com.example.demo.business.responses.product.UpdateProductResponse;
import com.example.demo.core.mapping.ModelMapperService;
import com.example.demo.core.messages.BusinessMessage;
import com.example.demo.core.result.DataResult;
import com.example.demo.core.result.SuccessDataResult;
import com.example.demo.dataAccess.abstracts.ProductRepository;
import com.example.demo.entities.Product;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductManager implements ProductService{

	private ProductRepository productRepository;
	private ModelMapperService modelMapperService;
	@Override
	public DataResult<List<GetAllProductsResponse>> getAll() {
		List<Product> products=this.productRepository.findAll();
		List<GetAllProductsResponse> getAllProductResponse=products.stream().map(product -> this.modelMapperService.forResponse().map(product, GetAllProductsResponse.class))
				.collect(Collectors.toList());
		return new SuccessDataResult<>(getAllProductResponse, BusinessMessage.GlobalMessages.DATA_LISTED_SUCCESSFULLY);
	}
	@Override
	public DataResult<CreateProductResponse> add(CreateProductRequest createProductRequest) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<GetAllProductsResponse> getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<GetProductResponse> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<DeleteProductResponse> deleteProduct(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public DataResult<UpdateProductResponse> updateProduct(UpdateProductRequest updateProductRequest) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
	

}
