package com.cg.shopping.walletservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "ewallet")
@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class Wallet {

    @Id
    private String id;

    private int walletId;

    private int customerId;
    private double currentBalance;
	public int getCustomerId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setWalletId(int nextId) {
		// TODO Auto-generated method stub
		
	}
	public int getCurrentBalance() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void setCurrentBalance(int i) {
		// TODO Auto-generated method stub
		
	}
	public static Object builder() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getWalletId() {
		// TODO Auto-generated method stub
		return 0;
	}
}
