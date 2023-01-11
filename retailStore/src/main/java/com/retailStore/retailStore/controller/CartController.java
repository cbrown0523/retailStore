package com.retailStore.retailStore.controller;

import com.retailStore.retailStore.model.Cart;
import com.retailStore.retailStore.model.Product;
import com.retailStore.retailStore.payloads.CartRepository;
import com.retailStore.retailStore.payloads.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.Optional;

@RestController
@RequestMapping ("/cart")
public class CartController {
    @Autowired
    CartRepository cartRepository;
    @Autowired
    ProductRepository productRepository;
    public String path = "https://fakestoreapi.com";
    @GetMapping("/all")
    public Cart[] getCart(RestTemplate restTemplate){
       String url = path + "/carts";
       Cart[] response = restTemplate.getForObject(url, Cart[].class);
       return response;

    }
    @GetMapping("/{id}")
    public ResponseEntity<Cart> getCartById(RestTemplate restTemplate,
                            @PathVariable Integer id){
       Optional<Cart> response = cartRepository.findById(id);
       return new ResponseEntity<>(response.get(), HttpStatus.OK);

    }
    @PostMapping("/id")
    public ResponseEntity<Product> addByIdToCart(@RequestBody Product products){
        Product product = productRepository.save(products);
        return new ResponseEntity<>(product , HttpStatus.OK);

    }
    @PostMapping("/")
    public ResponseEntity<Product> addToCart(@RequestBody Product products){
     Product product = productRepository.save(products);
     return new ResponseEntity<>(product , HttpStatus.OK);

    }
}
