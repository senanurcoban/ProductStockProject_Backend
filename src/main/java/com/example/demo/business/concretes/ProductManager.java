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
		Product product=this.modelMapperService.forRequest().map(createProductRequest,Product.class);
		this.productRepository.save(product);
		CreateProductResponse createProductResponse=this.modelMapperService.forResponse().map(product, CreateProductResponse.class);
		return new SuccessDataResult<>(createProductResponse, BusinessMessage.GlobalMessages.DATA_ADDED_SUCCESSFULLY);
	}
	
	@Override
	public DataResult<GetAllProductsResponse> getByName(String name) {
		List<Product> product=this.productRepository.findByName(name);
		GetAllProductsResponse getAllProductResponse= this.modelMapperService.forResponse().map(product, GetAllProductsResponse.class);	
		return new SuccessDataResult<>(getAllProductResponse,BusinessMessage.GlobalMessages. DATA_NAME_LISTED_SUCCESSFULLY);
	}
	
	@Override
	public DataResult<GetProductResponse> getById(int id) {
		    Product product = this.productRepository.findById(id).get();
	        GetProductResponse getAllProductResponse= this.modelMapperService.forResponse().map(product, GetProductResponse.class);
	        return new SuccessDataResult<>(getAllProductResponse,BusinessMessage.GlobalMessages.DATA_LISTED_SUCCESSFULLY);
		
	}
	
	@Override
	public DataResult<DeleteProductResponse> deleteProduct(int id) {
		Product product = this.productRepository.findById(id).get();
		DeleteProductResponse deleteProductResponse=this.modelMapperService.forResponse().map(product,DeleteProductResponse.class);
		this.productRepository.delete(product);
		return new SuccessDataResult<>(deleteProductResponse,BusinessMessage.GlobalMessages.DATA_DELETED_SUCCESSFULLY);
	}
	
	@Override
	public DataResult<UpdateProductResponse> updateProduct(UpdateProductRequest updateProductRequest) {
		 Product product = this.modelMapperService.forRequest().map(updateProductRequest, Product.class);
	     this.productRepository.save(product);
	     UpdateProductResponse updateProductResponse = this.modelMapperService.forResponse().map(product, UpdateProductResponse.class);
		 return new SuccessDataResult<>(updateProductResponse, BusinessMessage.GlobalMessages.DATA_UPDATED_SUCCESSFULLY);
	}
	
	

	
	

}
