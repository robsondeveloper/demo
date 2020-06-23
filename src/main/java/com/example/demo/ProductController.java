package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/products")
public class ProductController {

    @GetMapping
    public List<Product> all() {
        List<Product> products = new ArrayList<>();
        products.add(new Product(1, "Samsung X"));
        products.add(new Product(2, "Playstation 5"));
        products.add(new Product(3, "Motorola G8"));
        return products;
    }

}