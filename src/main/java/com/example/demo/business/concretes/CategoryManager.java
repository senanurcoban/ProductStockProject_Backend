package com.example.demo.business.concretes;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.CategoryService;
import com.example.demo.business.requests.category.CreateCategoryRequest;
import com.example.demo.business.requests.category.UpdateCategoryRequest;
import com.example.demo.business.responses.category.CreateCategoryResponse;
import com.example.demo.business.responses.category.DeleteCategoryResponse;
import com.example.demo.business.responses.category.GetAllCategoryResponse;
import com.example.demo.business.responses.category.GetCategoryResponse;
import com.example.demo.business.responses.category.UpdateCategoryResponse;
import com.example.demo.core.exceptions.BusinessException;
import com.example.demo.core.mapping.ModelMapperService;
import com.example.demo.core.messages.BusinessMessage;
import com.example.demo.core.result.DataResult;
import com.example.demo.core.result.SuccessDataResult;
import com.example.demo.dataAccess.abstracts.CategoryRepository;
import com.example.demo.entities.Category;


import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {
	
	private ModelMapperService modelMapperService;
	private CategoryRepository categoryRepository;
	
	@Override
	public DataResult<List<GetAllCategoryResponse>> getAll() {
		List<Category> categories=this.categoryRepository.findAll();
		List<GetAllCategoryResponse> getAllCategoryResponse=categories.stream().map(category -> this.modelMapperService.forResponse().map(category, GetAllCategoryResponse.class))
				.collect(Collectors.toList());
		return new SuccessDataResult<>(getAllCategoryResponse, BusinessMessage.GlobalMessages.DATA_LISTED_SUCCESSFULLY);
		
	}

	@Override
	public DataResult<CreateCategoryResponse> add(CreateCategoryRequest createCategoryRequest) {
		
		Category category=this.modelMapperService.forRequest().map(createCategoryRequest,Category.class);
		this.categoryRepository.save(category);
		CreateCategoryResponse createCategoryResponse=this.modelMapperService.forResponse().map(category, CreateCategoryResponse.class);
		return new SuccessDataResult<>(createCategoryResponse, BusinessMessage.GlobalMessages.DATA_ADDED_SUCCESSFULLY);
		
	}

	@Override
	public DataResult<GetAllCategoryResponse> getByName(String name) {
		List<Category> category=this.categoryRepository.getByName(name);
		GetAllCategoryResponse getAllCategoryResponse= this.modelMapperService.forResponse().map(category, GetAllCategoryResponse.class);	
		return new SuccessDataResult<>(getAllCategoryResponse,BusinessMessage.GlobalMessages. DATA_NAME_LISTED_SUCCESSFULLY);
		
	}

	@Override
	public DataResult<GetCategoryResponse> getById(int id) {
		Category category = this.categoryRepository.findById(id).get();
        GetCategoryResponse getAllCategoryResponse= this.modelMapperService.forResponse().map(category, GetCategoryResponse.class);
        return new SuccessDataResult<>(getAllCategoryResponse,BusinessMessage.GlobalMessages.DATA_LISTED_SUCCESSFULLY);
		
	}

	@Override
	public DataResult<DeleteCategoryResponse> delete(int id) {
		Category category = this.categoryRepository.findById(id).get();
		DeleteCategoryResponse deleteCategoryResponse=this.modelMapperService.forResponse().map(category,DeleteCategoryResponse.class);
		this.categoryRepository.delete(category);
		return new SuccessDataResult<>(deleteCategoryResponse,BusinessMessage.GlobalMessages.DATA_DELETED_SUCCESSFULLY);
		
	}

	@Override
	public DataResult<UpdateCategoryResponse> update(UpdateCategoryRequest updateCategoryRequest) {
		Category category=this.modelMapperService.forRequest().map(updateCategoryRequest,Category.class);
		this.categoryRepository.save(category);
		UpdateCategoryResponse updateCategoryResponse=this.modelMapperService.forResponse().map(category,UpdateCategoryResponse.class);
		return new SuccessDataResult<>(updateCategoryResponse, BusinessMessage.GlobalMessages.DATA_UPDATED_SUCCESSFULLY);
	}
	
	private void checkIfCategoryExistsByName(String name){
        List<Category> category = this.categoryRepository.getByName(name);
        if (category != null ){
            throw new BusinessException("Category name already exists");
        }
    }

	
}
