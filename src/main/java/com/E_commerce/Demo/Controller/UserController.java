package com.E_commerce.Demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.E_commerce.Demo.Entity.Users;
import com.E_commerce.Demo.Repository.UserRepo;
import com.E_commerce.Demo.Services.UsersService;

@RestController
@RequestMapping("/api")
public class UserController {

	@Autowired
	UsersService usersService;
	
	
	
	@PostMapping("/register")
	public Users registerUser(@RequestBody Users user)
	{
		System.out.print(user.getPassword());
		return usersService.registerUser(user);
	}
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody Users user) {
	    String token = usersService.verify(user);
	    
	    if (token != null) {
	       
	        return ResponseEntity.ok()
	                             .contentType(MediaType.TEXT_PLAIN)
	                             .body(token);  
	    } else {
	        return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
	                             .body("Invalid credentials");
	    }
	}
	//http://localhost:8080/api/uId?email=shankar@gmail.com
	@GetMapping("/uId")
	public int getUserId(@RequestParam String email)
	{
		Users user = usersService.findByEmail(email);
		if(user!=null)
		{System.out.println("user is resent");}
		else
		{
			System.out.println("no user");
		}
		int uId = user.getId();
		return uId;
		
	}

	
}
