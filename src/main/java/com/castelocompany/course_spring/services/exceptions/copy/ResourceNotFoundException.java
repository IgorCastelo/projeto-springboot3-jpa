package com.castelocompany.course_spring.services.exceptions.copy;

public class ResourceNotFoundException extends RuntimeException{


	private static final long serialVersionUID = 1L;
	
	public  ResourceNotFoundException(Object id ) {
		super("Resource not find Id " + id);
	}

}
