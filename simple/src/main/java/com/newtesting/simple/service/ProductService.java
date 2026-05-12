package com.newtesting.simple.service;

import com.newtesting.simple.model.Product;
import org.springframework.stereotype.Service;
import com.newtesting.simple.repository.ProductRepository;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

      public   ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;

    }

    public void addProduct(Product product) {
        productRepository.save(product);
    }

     public Product getProductById(int id) {
        return productRepository.findById((long) id).orElse(null);
    }
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

     public void deleteProduct(int id) {
        productRepository.deleteById((long) id);
    }

    public void updateProduct(int id, Product updatedProduct) {

        productRepository.save(updatedProduct);

    }


}
