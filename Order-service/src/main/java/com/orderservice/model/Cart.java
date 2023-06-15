package com.orderservice.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Cart {

	String cartId;
	double totalPrice;
	List<Items> itemsList;
	public List<Orders> getItemsList() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setTotalPrice(double totalValue) {
		// TODO Auto-generated method stub
		
	}
	public Object getCartId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getTotalPrice() {
		// TODO Auto-generated method stub
		return null;
	}
}