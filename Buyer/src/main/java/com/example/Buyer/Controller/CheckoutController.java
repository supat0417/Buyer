package com.example.Buyer.Controller;

import com.example.Buyer.Entity.CheckoutEntity;
import com.example.Buyer.Entity.ProductEntity;
import com.example.Buyer.Service.CheckoutService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/checkout")
public class CheckoutController {

    @Autowired
    private final CheckoutService checkoutService;

    public CheckoutController(CheckoutService checkoutService) {
        this.checkoutService = checkoutService;
    }
    @GetMapping(path = "/getproduct")
    public List<ProductEntity> GetProduct() {
           return checkoutService.GetProducts();
    }

    @GetMapping(path = "/getcheckout")
    public List<CheckoutEntity> GetCheckout(){
        return checkoutService.GetCheckouts();
    }

    @PostMapping(path = "/postcheckout")
    public void AddCheckout (@RequestBody CheckoutEntity checkoutEntity){
        checkoutService.Addcheckouts(checkoutEntity);
    }

}
