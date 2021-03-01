package dev.khusanjon.payme.controller;

import dev.khusanjon.payme.domain.Category;
import dev.khusanjon.payme.service.CategoryService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class CategoryController {
    private final CategoryService categoryService;

    public CategoryController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @GetMapping("/category/list")
    public List<Category> getListCategory(){
        return categoryService.listCategory();
    }

    @GetMapping("/category")
    public Optional<Category> getCategoryById(@RequestParam Integer product_id){
        return categoryService.categoryById(product_id);
    }
}
