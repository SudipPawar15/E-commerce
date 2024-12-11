package com.E_commerce.Demo.ServiceImpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.E_commerce.Demo.Entity.Users;
import com.E_commerce.Demo.ExceptionHandler.UserAlreadyExistsException;
import com.E_commerce.Demo.Repository.UserRepo;
import com.E_commerce.Demo.Services.UsersService;

@Service
public class UserServiceImpl implements UsersService{

	@Autowired
	UserRepo userRepo;
	@Autowired
	AuthenticationManager authManager;
	
	@Autowired
	JWTService jwtService;
	
	private BCryptPasswordEncoder encoder = new BCryptPasswordEncoder(12);
	
	@Override
	public Users registerUser(Users user) {
	    Users checkUser = userRepo.findByEmail(user.getEmail());
	    
	    if (checkUser != null) {
	        throw new UserAlreadyExistsException("Email already in use. Please choose a different email.");
	    }

	    if (user.getPassword() == null || user.getPassword().isEmpty()) {
	        throw new IllegalArgumentException("Password cannot be null or empty");
	    }
	    
	    user.setPassword(encoder.encode(user.getPassword()));
	    return userRepo.save(user);
	}



	@Override
	public Users findByEmail(String email) {
		
		return userRepo.findByEmail(email);
	}


	@Override
	public String verify(Users user) {
		Authentication authentication = authManager.authenticate(new UsernamePasswordAuthenticationToken(user.getEmail(),user.getPassword()));
		
		if(authentication.isAuthenticated())
		{
			return jwtService.generateToken(user.getEmail());
		}
		return "fail";
	}

}
