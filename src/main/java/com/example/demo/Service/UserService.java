package com.example.demo.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.DTO.UserDTO;
import com.example.demo.Model.User;
import com.example.demo.Repo.UserRepo;
@Service
public class UserService {
	@Autowired
	UserRepo userrepo;

	
	public void CreateUserEntity(UserDTO userdto)
	{
		User user1 = new User();
		user1.setEmail(userdto.getEmail());
		user1.setMobile(userdto.getMobile());
		user1.setName(userdto.getName());
		user1.setPassword(userdto.getPassword());
		userrepo.save(user1);
	}	
	
	public List<User> Display (){
		return userrepo.findAll();
	}
	
	public void UpdateRecord(UserDTO userdto) {
	Optional<User> user1 = userrepo.findById(id);
	if(user1.isPresent())
	{
		User user1 = new User();
		user1.setEmail(userdto.getEmail());
		user1.setMobile(userdto.getMobile());
		user1.setName(userdto.getName());
		user1.setPassword(userdto.getPassword());
		userrepo.save(user1);
	}
	}
}