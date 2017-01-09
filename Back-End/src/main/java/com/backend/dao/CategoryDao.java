package com.backend.dao;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Repository;

import com.backend.model.CategoryModel;
@Repository
@ComponentScan("com")
public interface CategoryDao {
	public void addCategory(CategoryModel category);

}
