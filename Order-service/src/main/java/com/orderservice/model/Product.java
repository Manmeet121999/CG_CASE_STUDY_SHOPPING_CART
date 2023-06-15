package com.orderservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {

	String productId;
	String productName;
	double price;
	public Object getPrice() {
		// TODO Auto-generated method stub
		return null;
	}
}