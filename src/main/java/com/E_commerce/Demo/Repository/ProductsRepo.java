package com.E_commerce.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.E_commerce.Demo.Entity.Products;

@Repository
public interface ProductsRepo extends JpaRepository<Products, Integer> {

}
