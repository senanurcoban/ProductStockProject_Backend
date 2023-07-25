package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.business.requests.category.CreateCategoryRequest;
import com.example.demo.business.requests.category.DeleteCategoryRequest;
import com.example.demo.business.requests.category.UpdateCategoryRequest;
import com.example.demo.business.responses.category.CreateCategoryResponse;
import com.example.demo.business.responses.category.DeleteCategoryResponse;
import com.example.demo.business.responses.category.GetAllCategoryResponse;
import com.example.demo.business.responses.category.GetCategoryResponse;
import com.example.demo.business.responses.category.UpdateCategoryResponse;

public interface CategoryService {

	List<GetAllCategoryResponse> getAllCategory();
	CreateCategoryResponse add(CreateCategoryRequest createCategoryRequest);
	List<GetAllCategoryResponse> getByName(String name);
	GetCategoryResponse getById(int id);
	DeleteCategoryResponse deleteCategory(DeleteCategoryRequest deleteCategoryRequest);
	UpdateCategoryResponse updateCategory(UpdateCategoryRequest updateCategoryRequest);
}
