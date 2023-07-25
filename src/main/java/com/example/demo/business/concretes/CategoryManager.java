package com.example.demo.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.business.abstracts.CategoryService;
import com.example.demo.business.requests.category.CreateCategoryRequest;
import com.example.demo.business.requests.category.DeleteCategoryRequest;
import com.example.demo.business.requests.category.UpdateCategoryRequest;
import com.example.demo.business.responses.category.CreateCategoryResponse;
import com.example.demo.business.responses.category.DeleteCategoryResponse;
import com.example.demo.business.responses.category.GetAllCategoryResponse;
import com.example.demo.business.responses.category.GetCategoryResponse;
import com.example.demo.business.responses.category.UpdateCategoryResponse;
import com.example.demo.core.result.DataResult;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CategoryManager implements CategoryService {
	@Override
	public DataResult<List<GetAllCategoryResponse>> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<CreateCategoryResponse> add(CreateCategoryRequest createCategoryRequest) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<GetAllCategoryResponse> getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<GetCategoryResponse> getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<DeleteCategoryResponse> delete(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DataResult<UpdateCategoryResponse> update(UpdateCategoryRequest updateCategoryRequest) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

	
}
