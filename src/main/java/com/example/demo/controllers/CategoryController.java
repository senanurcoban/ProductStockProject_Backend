package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.CategoryService;
import com.example.demo.business.requests.category.CreateCategoryRequest;
import com.example.demo.business.requests.category.UpdateCategoryRequest;
import com.example.demo.business.responses.category.CreateCategoryResponse;
import com.example.demo.business.responses.category.DeleteCategoryResponse;
import com.example.demo.business.responses.category.GetAllCategoryResponse;
import com.example.demo.business.responses.category.GetCategoryResponse;
import com.example.demo.business.responses.category.UpdateCategoryResponse;
import com.example.demo.core.result.DataResult;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/categories")
public class CategoryController {

private CategoryService categoryService;
	
	@GetMapping("/getall")
	public DataResult<List<GetAllCategoryResponse>> getAll(){
		return categoryService.getAll();
	}
	
	@PostMapping("/add")
	public DataResult<CreateCategoryResponse> add(@RequestBody CreateCategoryRequest createCategoryRequest) {
		return categoryService.add(createCategoryRequest);
	}
	
	@GetMapping("/getbyname")
	public DataResult<GetAllCategoryResponse> getbyname(String name){
		return categoryService.getByName(name);
	}
	@GetMapping("/getbyid/{id}")
	public DataResult<GetCategoryResponse> getById(int id) {
		return categoryService.getById(id);
	}
	@DeleteMapping("/delete")
	public DataResult<DeleteCategoryResponse> delete(int id) {
		return categoryService.delete(id);
	}
	@PutMapping("/update")
	public DataResult<UpdateCategoryResponse> update(@RequestBody UpdateCategoryRequest updateCategoryRequest) {
		return categoryService.update(updateCategoryRequest);
	}
}
