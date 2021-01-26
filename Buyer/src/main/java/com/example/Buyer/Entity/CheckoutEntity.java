package com.example.Buyer.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import net.bytebuddy.build.Plugin;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Entity
@Data
@Table(name = "checkout")
public class CheckoutEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "bill_seq")
    @SequenceGenerator(name = "bill_seq",allocationSize = 1)
    private Integer bill_id;
    private String payment_channel;
    private Integer shipping_fee;
    private Integer total_price;

    @OneToMany(targetEntity = ProductEntity.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "bill_id",referencedColumnName = "bill_id")
    private List<ProductEntity> product ;

    public Integer getShipping_fee() {
        shipping_fee = 50 ;
        return shipping_fee;
    }

    public void setShipping_fee(Integer shipping_fee) {
        this.shipping_fee = shipping_fee;
    }



}
