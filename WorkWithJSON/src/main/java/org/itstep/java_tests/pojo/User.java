package org.itstep.java_tests.pojo;

import java.sql.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	private long id;
	private String fullName;
	private Date dateBirthday;
	private UserContacts userContacts;
	
	public User() {
		// TODO Auto-generated constructor stub
	}

	public User(long id, String fullName, Date dateBirthday, UserContacts userContacts) {
		this.id = id;
		this.fullName = fullName;
		this.dateBirthday = dateBirthday;
		this.userContacts = userContacts;
	}
	
	@Override
	public String toString() {
		 StringBuilder sb = new StringBuilder();
	        sb.append("\n----- User Information-----\n");
	        sb.append("ID: " + getId() + "\n");
	        sb.append("Full Name: " + getFullName() + "\n");
	        sb.append("Date Birthday: " + getDateBirthday() + "\n");
	        sb.append("Contacts: \n" + getUserContacts().toString() + "\n");
	        sb.append("*****************************");
		return sb.toString();
	}
}
