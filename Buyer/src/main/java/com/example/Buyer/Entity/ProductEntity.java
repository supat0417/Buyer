package com.example.Buyer.Entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name = "product")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "prod_seq")
    @SequenceGenerator(name = "prod_seq",allocationSize = 1)
    private Integer product_id;
    private String product_name;
    private String product_picture;
    private Integer product_price;
    private Integer number_of_product;
    private Integer total_price_product;

    public Integer getTotal_price_product() {
        total_price_product = number_of_product * product_price;
        return total_price_product;
    }

    public void setTotal_price_product(Integer total_price_product) {
        this.total_price_product = total_price_product;
    }
}
