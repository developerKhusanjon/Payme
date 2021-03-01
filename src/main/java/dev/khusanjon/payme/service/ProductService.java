package dev.khusanjon.payme.service;

import dev.khusanjon.payme.domain.Product;
import dev.khusanjon.payme.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> productList(){
        return productRepository.findAll();
    }

    public Optional<Product> productById(Integer id){
        return productRepository.findById(id);
    }
}

