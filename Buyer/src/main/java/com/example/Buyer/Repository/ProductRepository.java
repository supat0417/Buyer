package com.example.Buyer.Repository;

import com.example.Buyer.Entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<ProductEntity,Integer> {
    //public ProductEntity findByEmail(String email);
    //public ProductEntity findByEmailAndPassword(String email , String password);
}
