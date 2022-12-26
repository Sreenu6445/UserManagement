package com.sreenu.demo.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Sign_In_Table")
public class SignInEntity {

	private String email;
	private String password;
	
}
