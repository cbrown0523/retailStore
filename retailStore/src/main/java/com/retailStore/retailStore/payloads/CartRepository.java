package com.retailStore.retailStore.payloads;

import com.retailStore.retailStore.model.Cart;
import org.springframework.data.repository.CrudRepository;

public interface CartRepository extends CrudRepository<Cart, Integer> {
}
