package com.E_commerce.Demo.Services;

import java.util.List;

import com.E_commerce.Demo.Entity.Products;
import com.E_commerce.Demo.Entity.ResponseDto;

public interface ProductService {

	ResponseDto findAllProducts(int pageNo,int pageSize);
	

}
