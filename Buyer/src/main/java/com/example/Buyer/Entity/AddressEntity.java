package com.example.Buyer.Entity;

import lombok.Data;

import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@Embeddable
public class AddressEntity {
    private String street_address;
    private String city;
    private String state;
    private Integer zipcode;
}
