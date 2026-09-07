package com.akash.backend.service;

import com.akash.backend.model.Category;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    private final List<Category> categories = new ArrayList<>();
    private Long nextID = 1L;

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public void createCategory(Category category) {
        category.setCategoryID(nextID++);
        categories.add(category);
    }

    @Override
    public String deleteCategory(Long categoryID) {
        Category category = categories.stream()
                            .filter(c -> c.getCategoryID().equals(categoryID))
                            .findFirst().orElse(null);

        if (category == null) {
            return "Category not found";
        }

        categories.remove(category);
        return category.getCategoryName() + " category is deleted successfully!!";
    }
}
