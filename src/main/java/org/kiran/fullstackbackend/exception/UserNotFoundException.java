package org.kiran.fullstackbackend.exception;

public class UserNotFoundException extends RuntimeException {

	public UserNotFoundException(Long id) {
		super("Cound Not Found The User id"+id);
	}
}
