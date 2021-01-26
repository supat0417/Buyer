package com.example.Buyer.Repository;

import com.example.Buyer.Entity.CheckoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CheckoutRepository extends JpaRepository <CheckoutEntity,Integer> {



}
