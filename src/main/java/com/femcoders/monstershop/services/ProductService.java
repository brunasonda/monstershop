package com.femcoders.monstershop.services;
import com.femcoders.monstershop.models.Product;
import com.femcoders.monstershop.repositories.ProductRepository;
import jdk.jfr.Event;
import org.springframework.stereotype.Service;

import java.util.List;

public class ProductService {
    private final ProductRepository productRepository;
    public ProductService(ProductRepository productRepository){
        this.productRepository = productRepository;

    }
}
