package com.uniq.MyFirstRestService.MyFirstRestService.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.uniq.MyFirstRestService.MyFirstRestService.UserDaoService;
import com.uniq.MyFirstRestService.MyFirstRestService.bean.User;
import com.uniq.MyFirstRestService.MyFirstRestService.bean.UserXML;

@RestController
public class UserResource {

	@Autowired
	private UserDaoService service;

	// GET /users
	// retrieveAllUsers
	// http://localhost:8080/users/
	@GetMapping("/users")
	public List<User> retrieveAllUsers() {
		return service.findAll();
	}

	// http://localhost:8080/users/3/uniq/dummy?testData=uniq123

	@GetMapping("/users/{id}/{username}/dummy")
	public User retrieveUser(@PathVariable int id, @PathVariable String username,
			@RequestParam(value = "testData", required = false) String test) throws Exception {

		System.out.println(username + " " + test);
		User user = service.findOne(id);
		System.out.println(user);
		if (user == null)
			throw new Exception();

		return user;
	}

	@GetMapping("/users/{id}")
	public User retrieveUser_1(@PathVariable int id) throws Exception {

		User user = service.findOne(id);
		System.out.println(user);
		if (user == null)
			throw new Exception();

		return user;
	}

	@PostMapping("/users")
	public ResponseEntity<Object> createUser(@RequestBody User user) {

		User saveduser = service.save(user);

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(saveduser.getId())
				.toUri();

		return ResponseEntity.created(location).build();

	}

//	@PostMapping(value = "/userXML", consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
//	public UserXML createUser_1(@RequestBody UserXML user) {
//		// Process the user object (save to database, etc.)
//		return user;
//	}

	@PostMapping(value = "/userXML", consumes = MediaType.APPLICATION_XML_VALUE
			+ ";charset=UTF-8", produces = MediaType.APPLICATION_XML_VALUE + ";charset=UTF-8")
	public UserXML createUser_1(@RequestBody UserXML user) {
		// Process the user object (save to database, etc.)
		return user;
	}

//	<userXML><id>8</id><name>John Doe</name><birthDate>1990-01-01</birthDate></userXML>
}
