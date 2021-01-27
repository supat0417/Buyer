package com.example.Buyer.Controller;

import com.example.Buyer.Entity.ProductEntity;
import com.example.Buyer.Repository.ProductRepository;
import com.example.Buyer.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/buyer")
public class ProductController {

    @Autowired
    private ProductRepository repo;
    @Autowired
    private ProductService service;

    @GetMapping("/product")
    public List<ProductEntity> getAllProduct()
    {
        return repo.findAll();
    }

    @DeleteMapping(path = "/product/del/{product_id}")
    public String DelectProduct (@PathVariable Integer product_id){
        service.DeleteProduct(product_id);
        return "Delete Prodect : "+product_id+" Success";
    }

}

