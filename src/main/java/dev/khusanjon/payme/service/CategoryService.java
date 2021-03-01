package dev.khusanjon.payme.service;

import dev.khusanjon.payme.domain.Category;
import dev.khusanjon.payme.repository.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    private final CategoryRepository categoryRepository;

    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> listCategory(){
        return categoryRepository.findAll();
    }

    public Optional<Category> categoryById(Integer id){
        return categoryRepository.findById(id);
    }
}
