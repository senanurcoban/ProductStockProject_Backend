package com.example.demo.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.business.abstracts.CategoryService;
import com.example.demo.business.requests.category.CreateCategoryRequest;
import com.example.demo.business.requests.category.DeleteCategoryRequest;
import com.example.demo.business.requests.category.UpdateCategoryRequest;
import com.example.demo.business.responses.category.CreateCategoryResponse;
import com.example.demo.business.responses.category.DeleteCategoryResponse;
import com.example.demo.business.responses.category.GetAllCategoryResponse;
import com.example.demo.business.responses.category.GetCategoryResponse;
import com.example.demo.business.responses.category.UpdateCategoryResponse;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/categories")
public class CategoryController {

private CategoryService categoryService;
	
	@GetMapping("/getall")
	public List<GetAllCategoryResponse> getAllCategory(){
		return categoryService.getAllCategory();
	}
	
	@PostMapping("/add")
	public CreateCategoryResponse add(CreateCategoryRequest createCategoryRequest) {
		return categoryService.add(createCategoryRequest);
	}
	
	@GetMapping("/getbyname")
	public List<GetAllCategoryResponse> getbyname(String name){
		return categoryService.getByName(name);
	}
	@GetMapping("/getbyid/{id}")
	public GetCategoryResponse getById(int id) {
		return categoryService.getById(id);
	}
	@DeleteMapping("/delete")
	public DeleteCategoryResponse deleteCategory(DeleteCategoryRequest deleteCategoryRequest) {
		return categoryService.deleteCategory(deleteCategoryRequest);
	}
	@PutMapping("/update")
	public UpdateCategoryResponse updateCategory(UpdateCategoryRequest updateCategoryRequest) {
		return categoryService.updateCategory(updateCategoryRequest);
	}
}
