package com.cg.shopping.walletservice.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ToString
@Builder
public class WalletRequest {
    private int walletId;
    private double amount;
    private String transactionType;
	public int getWalletId() {
		// TODO Auto-generated method stub
		return 0;
	}
	public Object getTransactionType() {
		// TODO Auto-generated method stub
		return null;
	}
	public int getAmount() {
		// TODO Auto-generated method stub
		return 0;
	}
}
