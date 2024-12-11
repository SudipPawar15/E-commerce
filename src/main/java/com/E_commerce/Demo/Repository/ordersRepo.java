package com.E_commerce.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.E_commerce.Demo.Entity.Orders;

@Repository
public interface ordersRepo extends JpaRepository<Orders, Integer> {

}
