package com.hashtech.SecureApp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hashtech.SecureApp.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	User findByUsername(String username);

}
