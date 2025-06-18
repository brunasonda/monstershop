package com.femcoders.monstershop.services;
import com.femcoders.monstershop.dtos.product.ProductMapper;
import com.femcoders.monstershop.dtos.product.ProductResponse;
import com.femcoders.monstershop.models.Product;
import com.femcoders.monstershop.repositories.ProductRepository;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<ProductResponse> getAllProducts() {
        List<Product> products = productRepository.findAll();
        return products.stream().map(product -> ProductMapper.entityToDto(product)).toList();
    }

    public ProductResponse listProductsById(Long id) {
        Product product = productRepository.findById(id).orElse(null);
        return product != null ? ProductMapper.entityToDto(product) : null;
    }

    public ProductResponse addProduct(Product newProduct) {
        Product createdProduct = productRepository.save(newProduct);
        return ProductMapper.entityToDto(createdProduct);
    }

    public ProductResponse editProduct(Long id, Product updatedProduct) {
        Product existingProduct = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("No encontrado!"));

        existingProduct.setName(updatedProduct.getName());
        existingProduct.setPrice(updatedProduct.getPrice());
        existingProduct.setImageUrl(updatedProduct.getImageUrl());

        Product savedProduct = productRepository.save(existingProduct);
        return ProductMapper.entityToDto(savedProduct);
    }

    public ProductResponse deleteProduct(Long id) {
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "ID: " + id + " No encontrado!"));

        productRepository.deleteById(id);

        return ProductMapper.entityToDto(product);
    }
}
