package com.sreenu.demo.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Registration")
public class RegistrationEntity {

	private String firstName;
	private String lastName;
	private String email;
	private Integer phno;
	private Boolean gender;
	private String country;
	private String state;
	private String city;
}
