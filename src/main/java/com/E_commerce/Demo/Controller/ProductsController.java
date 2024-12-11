package com.E_commerce.Demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.E_commerce.Demo.Entity.ResponseDto;
import com.E_commerce.Demo.Services.ProductService;

@RestController
@RequestMapping("/api")
public class ProductsController {

	@Autowired
	ProductService productService;
	
	//http://localhost:8080/api/products?pageNo=5&pageSize=5
	@GetMapping("/products")
	public ResponseDto getAllProducts(@RequestParam(value = "pageNo",defaultValue = "0",required = false) int pageNo,
			@RequestParam(value = "pageSize",defaultValue = "10",required = false) int pageSize)
	{
		return productService.findAllProducts(pageNo, pageSize);
		
	}
	
	
}
