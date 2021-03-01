package dev.khusanjon.payme.controller;

import dev.khusanjon.payme.domain.Product;
import dev.khusanjon.payme.service.DetailService;
import dev.khusanjon.payme.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
public class ProductController {
    private final ProductService productService;
    private final DetailService detailService;

    public ProductController(ProductService productService, DetailService detailService) {
        this.productService = productService;
        this.detailService = detailService;
    }

    @GetMapping("/high_demand_products")
    public List<Map<String,?>> getHighDemandProducts(){
        return detailService.highDemandProducts();
    }

    @GetMapping("/bulk_products")
    public List<Map<String,?>> getBulkProducts(){
        return detailService.bulkProducts();
    }

    @GetMapping("/product/list")
    public List<Product> getProductList(){
        return productService.productList();
    }

    @GetMapping("/product/details")
    public Optional<Product> getProductById(@RequestParam Integer product_id){
        return productService.productById(product_id);
    }

}
