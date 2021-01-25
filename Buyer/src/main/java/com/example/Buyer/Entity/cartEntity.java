package com.example.Buyer.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
public class cartEntity {
    @Id
    @JsonProperty("cart_id")
    private int cart_id;

    @JsonProperty("cart_unit")
    private int cart_unit;

    @JsonProperty("cart_price")
    private int cart_price;

    @JsonProperty("cart_status")
    private int cart_status;
}
