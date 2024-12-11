package com.E_commerce.Demo.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.E_commerce.Demo.Entity.Products;
import com.E_commerce.Demo.Entity.ResponseDto;
import com.E_commerce.Demo.Repository.ProductsRepo;
import com.E_commerce.Demo.Services.ProductService;

@Service
public class ProductsServiceImpl implements ProductService {

	@Autowired
	ProductsRepo productRepo;
	
	@Override
	public ResponseDto findAllProducts(int pageNo,int pageSize) {
		Pageable p = PageRequest.of(pageNo, pageSize);
		Page<Products> page = productRepo.findAll(p);
		
		List<Products> content = page.getContent();
		
		long totalElements = page.getTotalElements();
		int totalPages =page.getTotalPages();
		boolean isLast = page.isLast();
		
		ResponseDto dto = new  ResponseDto();
		
		dto.setElements(totalElements);
		dto.setProducts(content);
		dto.isLast();
		dto.setPages(totalPages);
		
		return dto;
	}

}
