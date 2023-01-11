package com.retailStore.retailStore.payloads;

import com.retailStore.retailStore.model.Merchandise;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface MerchandiseRepository extends CrudRepository<Merchandise, Integer> {
    //List<Merchandise>findAllById
}
