package com.E_commerce.Demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.E_commerce.Demo.Entity.Orders;
import com.E_commerce.Demo.Services.OrdersService;
import com.E_commerce.Demo.Services.ProductService;



@RestController
@RequestMapping("/api")
public class OrdersController {

	@Autowired
	OrdersService orderService;
	
	@Autowired
	ProductService productService;
	
	
	@PostMapping("/orders")
	public Orders placeOrder(@RequestBody Orders order)
	{
		
		return orderService.placeOrder(order);
	}
}
