package com.ecom.service;

import java.util.List;

import com.ecom.model.Category;

public interface CategoryService {
	
	public Category saveCategory(Category category);
	
	public Category getCategory(int id);
	
	public List<Category> categoryList();

	public void deleteCategory(int id);
	
	
	public Category updateCategory(Category category,int id);
	
}
