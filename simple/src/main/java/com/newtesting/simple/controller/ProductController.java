package com.newtesting.simple.controller;

import com.newtesting.simple.model.Product;
import org.springframework.web.bind.annotation.*;
import com.newtesting.simple.service.ProductService;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService){
        this.productService = productService;
    }



//    @PostMapping
//    public void addProduct(@RequestBody String product) {
//        System.out.println(product);
//    }


    @PostMapping
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

//
//    @PostMapping
//    public void addProduct(@RequestBody String product) {
//        System.out.println(product);
//    }


    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable int id) {
        return productService.getProductById(id);
    }

@DeleteMapping ("/{id}")
     public void deleteProduct(@PathVariable int id) {
        productService.deleteProduct(id);
    }
    @PutMapping("/{id}")
    public void updateProduct(@PathVariable int id, @RequestBody  Product updatedProduct) {
        productService.updateProduct(id, updatedProduct);
    }
}
