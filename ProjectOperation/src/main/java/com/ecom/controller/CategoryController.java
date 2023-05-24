package com.ecom.controller;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecom.model.Bike;
import com.ecom.model.Category;
import com.ecom.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value = "/saveCategorBike",method = RequestMethod.POST)
	@ResponseBody
	public Category saveCategory(@RequestBody Category category)
	{
		Category category2=categoryService.saveCategory(category);
		return category2;
				
	}
	
	@PutMapping("/updateCategoryProduct/{id}")
	public Category updateCategoryProduct(@RequestBody Category category,@PathVariable("id") int id)
	{
		return categoryService.updateCategory(category, id);
	}
	
	
	@GetMapping("/getCatgory/{id}")
	public Category getCategoryProduct(@PathVariable("id") int id)
	{
		return categoryService.getCategory(id);
	}
	
	@DeleteMapping("/deleteCategory/{id}")
	public String deleteCategory(@PathVariable("id") int id)
	{
		categoryService.deleteCategory(id);
		return "Category Deleted successfully";
	}
}
