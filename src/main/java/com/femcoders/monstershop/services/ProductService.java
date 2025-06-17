package com.femcoders.monstershop.services;
import com.femcoders.monstershop.models.Product;
import com.femcoders.monstershop.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product listProductsById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product addProduct(Product newProduct){
        return productRepository.save(newProduct);
    }

    public void editProduct(Long id, Product updatedProduct) {
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No encontrado!"));

        existingProduct.setName(updatedProduct.getName());
        existingProduct.setPrice(updatedProduct.getPrice());
        existingProduct.setImageUrl(updatedProduct.getImageUrl());

        productRepository.save(existingProduct);
    }

}

