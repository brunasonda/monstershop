package com.femcoders.monstershop.models;

import jakarta.persistence.*;

@Entity
@Table(name = "reviews")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private double rating;
    private String body;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    public Review() {
    }
    public Review(Long id, Product product, String username, double rating, String body) {
        this.id = id;
        this.product = product;
        this.username = username;
        this.rating = rating;
        this.body = body;
    }

    public Review(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }


}