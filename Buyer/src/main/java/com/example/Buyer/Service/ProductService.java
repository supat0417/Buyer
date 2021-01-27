package com.example.Buyer.Service;

import com.example.Buyer.Entity.ProductEntity;
import com.example.Buyer.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repo;

    public List<ProductEntity> getAllProduct()
    {
        return repo.findAll();
    }

    public void DeleteProduct(Integer product_id) {
        repo.deleteById(product_id);
    }


}
