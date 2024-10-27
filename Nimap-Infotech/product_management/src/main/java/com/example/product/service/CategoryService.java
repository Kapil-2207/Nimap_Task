package com.example.product.service;

import com.example.product.entity.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoryService {
    Page<Category> getAllCategories(Pageable pageable);
    Category createCategory(Category category);
    Category getCategoryById(Long id);
    Category updateCategory(Long id, Category category);
    void deleteCategory(Long id);
	Category updateCategory(int id, Category category);
}
