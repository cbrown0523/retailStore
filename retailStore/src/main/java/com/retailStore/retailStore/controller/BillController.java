package com.retailStore.retailStore.controller;

import com.retailStore.retailStore.model.Cart;
import com.retailStore.retailStore.model.Merchandise;
import com.retailStore.retailStore.model.Product;
import com.retailStore.retailStore.payloads.MerchandiseRepository;
import com.retailStore.retailStore.payloads.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bill/{id}")
public class BillController {
    @Autowired
    MerchandiseRepository merchandiseRepository;
    public Double totalBill(@PathVariable int id){
        Merchandise merchandise = merchandiseRepository.fin
        Cart cart = new Cart();
        //Merchandise merchandise = new Merchandise();
        return 1.3;
    }
}
