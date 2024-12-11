package com.E_commerce.Demo.ExceptionHandler;

public class UserAlreadyExistsException extends RuntimeException{

	public UserAlreadyExistsException(String message) {
        super(message);
    }
}
