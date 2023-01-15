package com.Group3.OrderService.controller;

import java.io.IOException;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Group3.OrderService.entity.Category;
import com.Group3.OrderService.service.CategoryService;
import com.Group3.OrderService.service.StorageService;

@RestController
@RequestMapping("/category")
public class CategoryController {
	@Autowired
	StorageService storageService;
	@Autowired
	CategoryService categoryService;
	
	/***** GetAllCategoryList ******************************/
	@GetMapping(value = "/list")
	public ResponseEntity<List<Category>> getAllCategories() {
		List<Category> categories = categoryService.getAllCategories();
		return ResponseEntity.ok().body(categories);

	}
	/***** GetCategory ******************************/
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> getCategory(@PathVariable int id) {
		Category category = categoryService.getCategory(id);
		if (category == null) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok().body(category);

	}
	
	

}

