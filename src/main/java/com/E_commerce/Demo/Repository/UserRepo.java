package com.E_commerce.Demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.E_commerce.Demo.Entity.Users;

@Repository
public interface UserRepo extends JpaRepository<Users, Integer> {


	 @Query("SELECT u FROM Users u WHERE LOWER(u.email) = LOWER(?1)")
	    Users findByEmail(String email);

}
