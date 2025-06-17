package com.femcoders.monstershop.controllers;
import com.femcoders.monstershop.models.Product;
import com.femcoders.monstershop.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();
        return new ResponseEntity<List<Product>>(products, HttpStatus.OK);
        //return eventService.getAllEvents();
    }

    @GetMapping("/api/products/{productId}")
    public Product listProductsById(@PathVariable("productId") Long id) {
        return productService.listProductsById(id);
    }


    @PostMapping("/api/products")
    public ResponseEntity<Product> addProduct(@RequestBody Product newProduct) {
        Product createdProduct = productService.addProduct(newProduct);
        return new ResponseEntity<Product>(createdProduct, HttpStatus.CREATED);
    }
}
