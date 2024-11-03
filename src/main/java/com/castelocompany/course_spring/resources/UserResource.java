package com.castelocompany.course_spring.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.castelocompany.course_spring.entities.User;

import java.net.ResponseCache;
import java.net.http.HttpResponse.ResponseInfo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll(){//função retorna um comando http REST 
		User user = new User(1L,"igor","igor@castelo.com", "5585992793578","123456" );
		return ResponseEntity.ok().body(user);				
	}

}
