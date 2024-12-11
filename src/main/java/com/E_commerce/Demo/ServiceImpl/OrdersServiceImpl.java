package com.E_commerce.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.E_commerce.Demo.Entity.Orders;
import com.E_commerce.Demo.Entity.Products;
import com.E_commerce.Demo.Entity.Users;
import com.E_commerce.Demo.Repository.ProductsRepo;
import com.E_commerce.Demo.Repository.UserRepo;
import com.E_commerce.Demo.Repository.ordersRepo;
import com.E_commerce.Demo.Services.OrdersService;

import jakarta.transaction.Transactional;

@Service
public class OrdersServiceImpl implements OrdersService {

	@Autowired
	ordersRepo orderRepo;
	
	@Autowired
	ProductsRepo productsRepo;
	
	@Autowired
	UserRepo usersRepo;
	
	@Override
	 @Transactional
	    public Orders placeOrder(Orders order) {
	        
	        if (order.getUser() == null) {
	            throw new RuntimeException("User cannot be null.");
	        }

	       
	        Users user = usersRepo.findById(order.getUser().getId())
	            .orElseThrow(() -> new RuntimeException("User not found"));

	        
	        order.setUser(user);

	        
	        for (Products product : order.getProducts()) {
	            int productId = product.getId();
	            Products existingProduct = productsRepo.findById(productId)
	                .orElseThrow(() -> new RuntimeException("Product not found"));

	            if (existingProduct.getStockQuantity() >= 1) {
	                existingProduct.setStockQuantity(existingProduct.getStockQuantity() - 1);
	                productsRepo.save(existingProduct); 
	            } else {
	                throw new RuntimeException("Insufficient stock for product: " + existingProduct.getName());
	            }
	        }

	        
	        return orderRepo.save(order);
	    }

}
