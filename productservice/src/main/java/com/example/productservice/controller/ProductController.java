package com.example.productservice.controller;

import com.example.productservice.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/product")
public class ProductController {

    @PostMapping("/create")
    public Product createProduct(){
        return new Product("1","Pen","Cello Company", 10);
    }

    @GetMapping("/getAll")
    public List<Product> getAllProduct(){
        List<Product> list = new ArrayList<>();
        list.add(new Product("1","Pen","Cello Company", 10));
        list.add(new Product("2","Copy","ClassMate Company", 45));
        list.add(new Product("3","Bag","American Tourist Company", 550));
        list.add(new Product("4","Laptop","HP Company", 25000));
        return list;
    }
}
