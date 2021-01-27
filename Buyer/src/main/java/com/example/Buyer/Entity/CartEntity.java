package com.example.Buyer.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Entity
@Table(name = "cart")
public class CartEntity {
    @Id
    @JsonProperty("cart_id")
    private int cart_id;

    @JsonProperty("cart_unit")
    private int cart_unit;

    @JsonProperty("cart_price")
    private int cart_price;

    @JsonProperty("cart_status")
    private int cart_status;

//    @OneToMany
//    @JoinColumn(name = "customer_id")
//    @JsonProperty("customer_id")
//    private Customer customer_id;
//
//    @OneToMany
//    @JoinColumn(name = "merchant_id")
//    @JsonProperty("merchant_id")
//    private Merchant merchant_id;
//
//    @OneToMany
//    @JoinColumn(name = "product_id")
//    @JsonProperty("product_id")
//    private Product product_id;
}
