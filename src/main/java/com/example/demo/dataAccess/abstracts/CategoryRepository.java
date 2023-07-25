package com.example.demo.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Integer>{

	List<Category> getByName(String name);
}
