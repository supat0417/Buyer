package com.example.Buyer.Controller;

import com.example.Buyer.Entity.CartEntity;
import com.example.Buyer.Repository.CartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/buyer")
public class CartController {
    @Autowired
    private CartRepository repository;
    private CartEntity cartEntity;

    @GetMapping(value = "/cart/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Optional<CartEntity> getCart(@PathVariable int id) {
        Optional<CartEntity> cart = repository.findById(id);
        return cart;
    }

    @PutMapping(value = "/cart", produces = MediaType.APPLICATION_JSON_VALUE)
    public CartEntity updateCart(@RequestBody CartEntity request) {
        System.out.println("Responses : " + request);
        System.out.println("Success");
        cartEntity = repository.save(request);
        return cartEntity;
    }

    @DeleteMapping(value = "/cart/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public void deleteCart(@PathVariable int id) {
        repository.deleteById(id);
        System.out.println("Success");
    }
}
