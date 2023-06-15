package com.orderservice.model;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Document(collection = "order")
public class Orders {

	@Id
	String orderId;
	LocalDate orderDate;
	String customerId;
	double amountPaid;
	String modeOfPayment;
	String orderStatus;
	int quantity;
	List<Items> itemsList;
	public String getProductName() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setPrice(Object price) {
		// TODO Auto-generated method stub
		
	}
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getQuantity() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setCustomerId(Object cartId) {
		// TODO Auto-generated method stub
		
	}
	public void setAmountPaid(Object totalPrice) {
		// TODO Auto-generated method stub
		
	}
	public void setModeOfPayment(Object object) {
		// TODO Auto-generated method stub
		
	}
	public void setOrderDate(LocalDate now) {
		// TODO Auto-generated method stub
		
	}
	public void setQuantity(int size) {
		// TODO Auto-generated method stub
		
	}
	public void setOrderStatus(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setItemsList(List<Orders> itemsList2) {
		// TODO Auto-generated method stub
		
	}
	public String getOrderStatus() {
		// TODO Auto-generated method stub
		return null;
	}
}
