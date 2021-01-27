package com.example.Buyer.Service;

import com.example.Buyer.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PrdductService {

    @Autowired
    private ProductRepository repo;
}
