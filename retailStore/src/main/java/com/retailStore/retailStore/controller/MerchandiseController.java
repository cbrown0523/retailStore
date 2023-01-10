//use try catch block work on exception
//can sort use a algorithm with price etch('https://fakestoreapi.com/products?sort=desc')
package com.retailStore.retailStore.controller;

import com.retailStore.retailStore.model.Merchandise;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/product")

public class MerchandiseController {
    public String path = "https://fakestoreapi.com";


    @GetMapping("/all")
    public Merchandise[] getAllProducts(RestTemplate restTemplate){
        String url = path + "/products" ;
      Merchandise[] response = restTemplate.getForObject(url, Merchandise[].class);
        return response;
    }
    @GetMapping("/categories")
    public ResponseEntity<String> getCategories(RestTemplate restTemplate){
        String url = path + "/products/categories";
        String response = restTemplate.getForObject(url , String.class);
        return ResponseEntity.ok(response);
    }
    @GetMapping("/jewelery")
    public Merchandise[] getJewelry(RestTemplate restTemplate){
        String url = path + "/products/category/jewelery";
        Merchandise[] response = restTemplate.getForObject( url ,Merchandise[].class);
        return response;
    }
    @GetMapping("/electronics")
    public Merchandise[] getElectronics(RestTemplate restTemplate){
        String url = path + "/products/category/electronics";
        Merchandise[] response = restTemplate.getForObject( url ,Merchandise[].class);
        return response;
    }
    @GetMapping("/womenClothing")
    public Merchandise[] getWomenClothing(RestTemplate restTemplate){
        String url = path + "/products/category/women's clothing";
        Merchandise[] response = restTemplate.getForObject( url ,Merchandise[].class);
        return response;
    }
    @GetMapping("/menClothing")
    public Merchandise[] getMenClothing(RestTemplate restTemplate){
        String url = path + "/products/category/men's clothing";
        Merchandise[] response = restTemplate.getForObject( url ,Merchandise[].class);
        return response;
    }

}
