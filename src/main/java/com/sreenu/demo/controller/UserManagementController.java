package com.sreenu.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sreenu.demo.binding.RegistrationEntity;
import com.sreenu.demo.service.RegistrationService;
import com.sreenu.demo.service.SignInService;
import com.sreenu.demo.service.UnlockAccountService;

@RestController
public class UserManagementController {
	
	@Autowired
	public SignInService signInService;
	@Autowired
	public RegistrationService regService;
	@Autowired
	public UnlockAccountService unlockService;
	
	@GetMapping("/reset")
	public void reset() {
		
	}
	
	@GetMapping("/register")
	public void register(List<RegistrationEntity> register) {
		
	}
	
	@GetMapping("/signin")
	public void signIn() {
		
	}
	
	@GetMapping("/signup")
	public void signUp() {
		
	}
	
	@GetMapping("/forgotpwd")
	public void forgotPwd() {
		
	}
	
	@GetMapping("/submit")
	public void submit() {
		
	}
	
	@GetMapping("/forgotpwdsubmit")
	public void forgotPwdSubmit() {
		
	}
	

}
