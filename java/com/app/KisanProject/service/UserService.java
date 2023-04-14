package com.app.KisanProject.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.KisanProject.dto.UserRequest;
import com.app.KisanProject.dto.UserResponse;
import com.app.KisanProject.entity.UserRegistration;
import com.app.KisanProject.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repo;
	Logger logger=LoggerFactory.getLogger(UserService.class);
	UserResponse response=new UserResponse();
	
	public UserResponse addUser(UserRequest request) {
		// TODO Auto-generated method stub
		logger.info("UserService class start addUser() method request is..."+request);
		UserRegistration user=CreateUserObject(request);
		UserRegistration u=repo.save(user);
		if(u!=null) {
			response.setResponse(u);
			response.setStatus("Successfully User added in database....");
		}
		else {
			response.setResponse(u);
			response.setStatus("Failed to add User in database....!");
		}
		logger.info("UserService class end addUser method response is..."+response);
		return response;
	}


	private UserRegistration CreateUserObject(UserRequest request) {
		// TODO Auto-generated method stub
		UserRegistration user=new UserRegistration();
		user.setName(request.getName());
		user.setAddress(request.getAddress());
		user.setEmail(request.getEmail());
		user.setMobileNo(request.getMobileNo());
		user.setPassword(request.getPassword());
		user.setAdmin(request.getAdmin());
		return user;
	}
	
	public UserResponse login(UserRequest request) {
		// TODO Auto-generated method stub
		UserRegistration user=repo.findByEmailAndPassword(request.getEmail(),request.getPassword());
		if(user!=null) {
			response.setResponse(user);
			response.setStatus("Login Successfully...");
		}
		else {
			response.setResponse(user);
			response.setStatus("Invalid UserName and password");
		}
		return response;
	}

	public List<UserRegistration> userList() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	public UserRegistration getUserById(long id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}
	public void deleteUser(long id) {
		repo.deleteById(id);
	}

	public UserRegistration updateUser(long id, UserRequest request) {
		// TODO Auto-generated method stub
		logger.info("UserService class start updateUser() method request is..."+request);
		UserRegistration user=CreateUserObject(request);
		UserRegistration u=repo.findById(id).get();
		UserRegistration u1=null;
		//UserRegistration u1=null;
		if(u!=null) {
			u.setName(request.getName());
			u.setAddress(request.getAddress());
			u.setMobileNo(request.getMobileNo());
			u.setEmail(request.getEmail());
			u.setPassword(request.getPassword());
			repo.save(u);
		}
		logger.info("UserService class end updateUser method response is..."+response);
		return u1;
	}


	public UserRegistration getUserByName(String name) {
		// TODO Auto-generated method stub
		return repo.findByName(name).get();
	}

}
