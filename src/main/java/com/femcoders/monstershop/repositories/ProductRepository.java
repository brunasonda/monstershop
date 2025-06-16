package com.femcoders.monstershop.repositories;
import com.femcoders.monstershop.models.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
