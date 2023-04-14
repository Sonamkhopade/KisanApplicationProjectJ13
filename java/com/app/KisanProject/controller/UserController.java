package com.app.KisanProject.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.KisanProject.dto.UserRequest;
import com.app.KisanProject.dto.UserResponse;
import com.app.KisanProject.entity.UserRegistration;
import com.app.KisanProject.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService userService;
	Logger logger=LoggerFactory.getLogger(UserController.class);
	
	@RequestMapping(value="/addUser",method=RequestMethod.POST,
			consumes="application/json",produces="application/json")
	public ResponseEntity<UserResponse> addUser(@RequestBody UserRequest request){
		logger.info("UserController class start addUser() method request is..."+request);
		UserResponse response=userService.addUser(request);
		logger.info("Usercontroller class end addUser() method response is..."+response);
		return new ResponseEntity<UserResponse>(response,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/login",method=RequestMethod.POST,
			consumes="application/json",produces="application/json")
	public ResponseEntity<UserResponse> login(@RequestBody UserRequest request){
		logger.info("UserController class start login() method request is..."+request);
		UserResponse response=userService.login(request);
		logger.info("UserController class end login() method request is..."+response);
		return new ResponseEntity<UserResponse>(response,HttpStatus.OK);
	}
	
	@RequestMapping(value="/userList",method=RequestMethod.GET,
			produces="application/json")
	public ResponseEntity<List<UserRegistration>> userList(){
		logger.info("UserController class start userList() method request is...");
		List<UserRegistration> response=userService.userList();
		logger.info("UserController class end userList() method response is..."+response);
		return new ResponseEntity<List<UserRegistration>>(response,HttpStatus.OK);
	}
	
	@RequestMapping(value="/getById",method=RequestMethod.GET,
			produces="application/json")
	public ResponseEntity<UserRegistration> getUserById(@RequestParam long id){
		logger.info("UserController class start getUserById() method request is...");
		UserRegistration response=userService.getUserById(id);
		logger.info("UserController class end getUserById() method response is..."+response);
		return new ResponseEntity<UserRegistration>(response,HttpStatus.OK);
	}
	
	@RequestMapping(value="/getByName",method=RequestMethod.GET,
			produces="application/json")
	public ResponseEntity<UserRegistration> getUserByName(@RequestParam String name){
		logger.info("UserController class start getUserByName() method request is...");
		UserRegistration response=userService.getUserByName(name);
		logger.info("UserController class end getUserByName() method response is..."+response);
		return new ResponseEntity<UserRegistration>(response,HttpStatus.OK);
	}
	
	@RequestMapping(value="/updateUser",method=RequestMethod.PUT,
			consumes="application/json",produces="application/json")
	public ResponseEntity<UserRegistration> updateUser(@RequestParam long id,
			@RequestBody UserRequest request){
		logger.info("UserController class start updateUser() method request is..."+request);
		UserRegistration response=userService.updateUser(id,request);
		logger.info("UserController class end updateUser() method response is..."+response);
		return new ResponseEntity<UserRegistration>(response,HttpStatus.OK);
	}
	
	@RequestMapping(value="/deleteUser",method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteUser(@RequestParam long id){
		userService.deleteUser(id);
		logger.info("Usercontroller class end deleteUser() method response is...");
		return new ResponseEntity<String>("delete successfully...",HttpStatus.OK);
	}

}
