package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.UserDTO;
import com.example.demo.Model.User;
import com.example.demo.Service.UserService;
@RestController
public class UserController {
	@Autowired
	UserService userservice;

	@PostMapping("/createnewuser")

	public void createEn(@RequestBody UserDTO userdto) {
		userservice.CreateUserEntity(userdto);

	}
	@GetMapping("/displayresult")
	
	public List<User> displayUserDetails()
	{
		return userservice.Display();
	}
	@PutMapping("/UpdateRecors/{id}")
	public void update(@PathVariable(value="id") Long id , @RequestBody UserDTO userdto)
	
	{
		userservice.UpdateRecord(id, userdto);
	}
	}
	
	
	
	
	
	
	
	
	
	
	