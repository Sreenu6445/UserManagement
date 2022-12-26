package com.sreenu.demo.binding;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="Unlock_Account")
public class UnlockAccountEntity {

	private String temporaryPwd;
	private String newPwd;
	private String confirmPwd;
	
}
