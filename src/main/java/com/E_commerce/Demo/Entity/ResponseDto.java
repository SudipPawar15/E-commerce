package com.E_commerce.Demo.Entity;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDto {
	
	private List<Products> products;
private int Pages;
private long elements;
private boolean isLast;


}
