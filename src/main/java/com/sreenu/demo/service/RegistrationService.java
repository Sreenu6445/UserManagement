package com.sreenu.demo.service;

import java.util.List;

import com.sreenu.demo.binding.RegistrationEntity;

public interface RegistrationService {
	
	public void reset();
	public void register(List<RegistrationEntity> register);
	
}
