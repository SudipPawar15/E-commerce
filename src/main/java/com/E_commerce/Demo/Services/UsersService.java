package com.E_commerce.Demo.Services;



import com.E_commerce.Demo.Entity.Users;

public interface UsersService {

	Users registerUser(Users  user);
	
	Users findByEmail(String email);

	String verify(Users user);
}
