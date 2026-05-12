package com.newtesting.simple.service;

import com.newtesting.simple.model.Product;
import com.newtesting.simple.repository.ProductRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ProductServiceTest {


    @Mock
    ProductRepository productRepository;
    @InjectMocks
    ProductService productService;

  public ProductServiceTest () {
      MockitoAnnotations.openMocks(this);
  }

    @Test
    public void testAddProduct() {
        Product product = new Product();
        product.setProdName("Test Product");
        product.setProdPrice(10.0);
        product.setProdDescription("This is a test product.");

        productService.addProduct(product);

    }
    @Test
    void testgetProductById() {
        int id = 1;
        productService.getProductById(id);
    }

}


