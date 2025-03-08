
package com.mycompany.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/products")
public class ProductController {

    @GetMapping
    public List<Product> getProducts() {
        // Example product data
        return List.of(
            new Product(1, "Product 1", "Description for product 1", 100.00),
            new Product(2, "Product 2", "Description for product 2", 150.00)
        );
    }
}

class Product {
    private int id;
    private String name;
    private String description;
    private double price;

    // Constructor, getters, and setters
    public Product(int id, String name, String description, double price) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
    }
    // Getters and setters
}
