package com.userprofile.model;

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
@Document(collection = "userProfile")
public class UserProfile {

	@Id
	String profileId;
	
	String fullName;
//	String image;
	String emailId;
	long mobilenumber;
	String about;
	String dateOfBirth;
	String gender;
	String role;
	String password;
	List<Address> userAddresses;
	public CharSequence getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	public void setRole(String customer) {
		// TODO Auto-generated method stub
		
	}
	public void setPassword(String encode) {
		// TODO Auto-generated method stub
		
	}
	public String getProfileId() {
		// TODO Auto-generated method stub
		return null;
	}
}
