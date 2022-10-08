package com.linkedin.learning.hplus.controller;

import com.linkedin.learning.hplus.data.Product;
import com.linkedin.learning.hplus.data.ProductRepository;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;


/**
 * Created by santoshsharma on 08 Oct, 2022
 */

@RestController
public class ProductController {
    private final ProductRepository productRepository;

    public ProductController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @QueryMapping
    public Iterable<Product> products() {
        return this.productRepository.findAll();
    }

    @QueryMapping
    public Product productById(@Argument String id){
        return this.productRepository.findById(id).orElseThrow();
    }
}
