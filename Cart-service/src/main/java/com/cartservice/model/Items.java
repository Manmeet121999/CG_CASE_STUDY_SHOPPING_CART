package com.cartservice.model;

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
public class Items {

	public Items(String string, int i, int j, String string2) {
		// TODO Auto-generated constructor stub
	}
	String productName;
	double price;
	int quantity;
	String image;
}
