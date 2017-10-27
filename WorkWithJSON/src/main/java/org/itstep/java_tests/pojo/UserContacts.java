package org.itstep.java_tests.pojo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserContacts {
	private String email;
	private String phone;
	private String address;
	
	public UserContacts() {
		// TODO Auto-generated constructor stub
	}
	
	public UserContacts(String email, String phone, String address) {
		this.email = email;
		this.phone = phone;
		this.address = address;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
	    	sb.append("	e-mail: " + getEmail() + "\n");
	    	sb.append("	phone: " + getPhone() + "\n");
	    	sb.append("	address: " + getAddress() + "\n");
	    return sb.toString();
	}
}
