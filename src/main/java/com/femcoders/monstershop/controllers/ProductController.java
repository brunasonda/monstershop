package com.femcoders.monstershop.controllers;
import com.femcoders.monstershop.models.Product;
import com.femcoders.monstershop.services.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.femcoders.monstershop.dtos.product.*;

import java.util.List;

@RestController
public class ProductController {
    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping("/api/products")
    public ResponseEntity<List<ProductResponse>> getAllProducts() {
        return new ResponseEntity<>(productService.getAllProducts(),HttpStatus.OK);
    }

    @GetMapping("/api/products/{productId}")
    public ProductResponse getProductById(@PathVariable("productId") Long id) {
        return productService.listProductsById(id);
    }

    @PostMapping("/api/products")
    public ResponseEntity<ProductResponse> addProduct(@RequestBody Product newProduct) {
        ProductResponse createdProduct = productService.addProduct(newProduct);
        return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
    }

    @PutMapping("/api/products/{id}")
    public ResponseEntity updateProduct(
            @PathVariable Long id,
            @RequestBody Product updatedProduct) {
        ProductResponse productResponse = productService.editProduct(id, updatedProduct);
        return ResponseEntity.ok(productResponse);
    }

    @DeleteMapping("/api/products/{id}")
    public ResponseEntity deleteProduct(@PathVariable Long id) {
        ProductResponse productResponse = productService.deleteProduct(id);
        return ResponseEntity.ok(productResponse);
    }
}
