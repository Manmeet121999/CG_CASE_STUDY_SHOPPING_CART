package com.cartservice.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Document(collection = "shoppingCart")
public class Cart {

	public Cart(String string, int i, List<Items> subList) {
		// TODO Auto-generated constructor stub
	}
	@Id
	String cartId;
	double totalPrice;
	List<Items> itemsList;
	public Object getCartId() {
		// TODO Auto-generated method stub
		return null;
	}
	public double getTotalPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setCartId(String userID) {
		// TODO Auto-generated method stub
		
	}
}