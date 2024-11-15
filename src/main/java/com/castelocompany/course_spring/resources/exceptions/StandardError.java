package com.castelocompany.course_spring.resources.exceptions;

import java.io.Serializable;
import java.time.Instant;

import org.springframework.web.bind.annotation.ControllerAdvice;

import com.fasterxml.jackson.annotation.JsonFormat;

public class StandardError implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
	private Instant timeTamp;
	
	private Integer status;
	private String  error;
	private String message;
	private String path;
	
	public StandardError() {
		
	}

	public StandardError(Instant timeTamp, Integer status, String error, String message, String path) {
		super();
		this.timeTamp = timeTamp;
		this.status = status;
		this.error = error;
		this.message = message;
		this.path = path;
	}

	public Instant getTimeTamp() {
		return timeTamp;
	}

	public void setTimeTamp(Instant timeTamp) {
		this.timeTamp = timeTamp;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getError() {
		return error;
	}

	public void setError(String error) {
		this.error = error;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	
	

}
