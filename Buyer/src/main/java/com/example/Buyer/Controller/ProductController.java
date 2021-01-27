package com.example.Buyer.Controller;

import com.example.Buyer.Entity.ProductEntity;
import com.example.Buyer.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/buyer")
public class ProductController {

    @Autowired
    private ProductRepository repo;

    @GetMapping("/product")
    public ProductRepository getAllProduct()
    {
        return null;
    }

}

