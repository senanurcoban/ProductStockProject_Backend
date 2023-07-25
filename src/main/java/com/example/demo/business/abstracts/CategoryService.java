package com.example.demo.business.abstracts;

import java.util.List;

import com.example.demo.business.requests.category.CreateCategoryRequest;
import com.example.demo.business.requests.category.UpdateCategoryRequest;
import com.example.demo.business.responses.category.CreateCategoryResponse;
import com.example.demo.business.responses.category.DeleteCategoryResponse;
import com.example.demo.business.responses.category.GetAllCategoryResponse;
import com.example.demo.business.responses.category.GetCategoryResponse;
import com.example.demo.business.responses.category.UpdateCategoryResponse;
import com.example.demo.core.result.DataResult;

public interface CategoryService {

	DataResult<List<GetAllCategoryResponse>> getAll();
	DataResult<CreateCategoryResponse> add(CreateCategoryRequest createCategoryRequest);
	DataResult<GetAllCategoryResponse> getByName(String name);
	DataResult<GetCategoryResponse> getById(int id);
	DataResult<DeleteCategoryResponse> delete(int id);
    DataResult<UpdateCategoryResponse> update(UpdateCategoryRequest updateCategoryRequest);
}
