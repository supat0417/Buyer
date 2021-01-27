package com.example.Buyer.Entity;

import javax.persistence.Entity;
import javax.persistence.*;

@Entity
@Table(name = "product")
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer product_id;
    private String product_name;
    private String product_picture;
    private Integer product_price;
    private Integer product_unit;
    private String product_status;

    public ProductEntity() {
    }

    public ProductEntity(Integer product_id, String product_name, String product_picture, Integer product_price, Integer product_unit, String product_status) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_picture = product_picture;
        this.product_price = product_price;
        this.product_unit = product_unit;
        this.product_status = product_status;
    }

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_picture() {
        return product_picture;
    }

    public void setProduct_picture(String product_picture) {
        this.product_picture = product_picture;
    }

    public Integer getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Integer product_price) {
        this.product_price = product_price;
    }

    public Integer getProduct_unit() {
        return product_unit;
    }

    public void setProduct_unit(Integer product_unit) {
        this.product_unit = product_unit;
    }

    public String getProduct_status() {
        return product_status;
    }

    public void setProduct_status(String product_status) {
        this.product_status = product_status;
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "product_id=" + product_id +
                ", product_name='" + product_name + '\'' +
                ", product_picture='" + product_picture + '\'' +
                ", product_price=" + product_price +
                ", product_unit=" + product_unit +
                ", product_status='" + product_status + '\'' +
                '}';
    }

}
