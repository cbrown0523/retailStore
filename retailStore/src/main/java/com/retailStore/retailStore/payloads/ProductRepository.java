package com.retailStore.retailStore.payloads;

import com.retailStore.retailStore.model.Product;
import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product , Integer> {
    Product findByUserId(Integer id);
}
