package com.websitecontroller.security.modelclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Profile {

    private String profileId;
    private String fullName;
    private String emailId;
    private long mobilenumber;
    private String role;
    private String password;
	public String getFullName() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getPassword() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getProfileId() {
		// TODO Auto-generated method stub
		return null;
	}
	public String getRole() {
		// TODO Auto-generated method stub
		return null;
	}


}
