package com.hashtech.SecureApp.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.hashtech.SecureApp.UserPricipal;
import com.hashtech.SecureApp.Model.User;
import com.hashtech.SecureApp.Repository.UserRepository;
@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		
		User user= userRepo.findByUsername(username);
		
		if(user==null)
		{
			throw new UsernameNotFoundException("User Do Not Exist");
			//System.out.println("User Not Found");
		}
		
		return new UserPricipal(user);
	}

}
