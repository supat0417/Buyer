package com.example.Buyer.Service;

import com.example.Buyer.Entity.CheckoutEntity;
import com.example.Buyer.Entity.ProductEntity;
import com.example.Buyer.Repository.CheckoutRepository;
import com.example.Buyer.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CheckoutService {

    @Autowired
    private final ProductRepository productRepository;
    @Autowired
    private final CheckoutRepository checkoutRepository;

    public CheckoutService(ProductRepository productRepository, CheckoutRepository checkoutRepository) {
        this.productRepository = productRepository;
        this.checkoutRepository = checkoutRepository;
    }

    public List<ProductEntity> GetProducts() {
        return productRepository.findAll();
    }


    public List<CheckoutEntity> GetCheckouts() {
        return checkoutRepository.findAll();
    }

    public void Addcheckouts(CheckoutEntity checkoutEntity) {
        List< ProductEntity > products = checkoutEntity.getProduct();
        Integer total_price = 0;
        for(ProductEntity p : products){
            total_price+=p.getTotal_price_product();
        }
        Integer shipping = checkoutEntity.getShipping_fee();
        checkoutEntity.setTotal_price(total_price+shipping);

        checkoutRepository.save(checkoutEntity);

    }
}
