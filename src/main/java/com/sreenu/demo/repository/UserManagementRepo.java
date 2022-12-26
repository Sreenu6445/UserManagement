package com.sreenu.demo.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sreenu.demo.binding.RegistrationEntity;

public interface UserManagementRepo extends JpaRepository<RegistrationEntity, Serializable>{

}
