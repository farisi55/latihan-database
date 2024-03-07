package com.example.latihandatabase.models.repos;

import com.example.latihandatabase.models.entity.Product;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ProductRepo extends CrudRepository<Product, Long> {
    List<Product> findBynameContains(String name);
}
