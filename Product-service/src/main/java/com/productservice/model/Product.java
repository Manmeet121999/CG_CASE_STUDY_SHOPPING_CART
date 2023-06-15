package com.productservice.model;

import java.util.List;
import java.util.Map;

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
@ToString
@EqualsAndHashCode
@Document(collection = "product")
public class Product {

	public Product(String string, String string2, String string3, String string4, Object object, Object object2,
			Object object3, double d, String string5, Object object4) {
		// TODO Auto-generated constructor stub
	}
	@Id
	String productId;
	String productType;
	String productName;
	String category;
	Map<Integer, Double> rating;
	Map<Integer, String> review;
	String image;
	double price;
	String description;
	Map<String, String> specification;
	public Object getProductId() {
		// TODO Auto-generated method stub
		return null;
	}
	public Object getProductName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getCategory() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getProductType() {
		// TODO Auto-generated method stub
		return null;
	}		
}
