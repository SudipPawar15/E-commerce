package com.E_commerce.Demo.ServiceImpl;

import java.nio.file.attribute.UserPrincipalNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.E_commerce.Demo.Entity.UserPrincipal;
import com.E_commerce.Demo.Entity.Users;
import com.E_commerce.Demo.Repository.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService{

	@Autowired
	UserRepo userRepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = userRepo.findByEmail(username);
		if(user==null)
		{
			throw new UsernameNotFoundException(username) ;
		}
		return new UserPrincipal(user);
	}

}
