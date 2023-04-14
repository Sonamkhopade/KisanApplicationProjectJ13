package com.app.KisanProject.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.KisanProject.dto.AdminRequest;
import com.app.KisanProject.dto.AdminResponse;
import com.app.KisanProject.entity.Admin;
import com.app.KisanProject.service.AdminService;

@RestController
public class AdminController {
	@Autowired
	private AdminService adminService;
	
	Logger logger=LoggerFactory.getLogger(AdminController.class);
	
	@RequestMapping(value="/addAdmin", method=RequestMethod.POST,
			consumes="application/json",produces="application/json")
	public ResponseEntity<AdminResponse> addAdmin(@RequestBody AdminRequest request){
		logger.info("AdminController class start addAdmin() method request is..."+request);
		AdminResponse response=adminService.addAdmin(request);
		logger.info("AdminController class end addAdmin() method request is..."+response);
		return new ResponseEntity<AdminResponse>(response,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/listAdmin",method = RequestMethod.GET,
			produces = "application/json")
	public ResponseEntity<List<Admin>>getAdmin(){
	logger.info("UserController class start getAdmin() merhod request is..");
	List<Admin> response=adminService.getAdmin();
	logger.info("UserController class end getAdmin() merhod response is.."+response);
	return new ResponseEntity<List<Admin>>(response,HttpStatus.OK);
	}
	
	@PostMapping(value="/loginAdmin",
			consumes="application/json",produces="application/json")
	public ResponseEntity<AdminResponse> loginAdmin(@RequestBody AdminRequest request){
		logger.info("AdminController class start loginAdmin() method request is..."+request);
		AdminResponse response=adminService.loginAdmin(request);
		logger.info("AdminController class end loginAdmin() method response is..."+response);
		return new ResponseEntity<AdminResponse>(response,HttpStatus.OK);
	}
	
	@RequestMapping(value="/updateAdmin",method=RequestMethod.PUT,
			consumes="application/json")
	public ResponseEntity<Admin> updateUser(@RequestParam int id,
			@RequestBody AdminRequest request){
		logger.info("AdminController class start updateAdmin() method request is..."+request);
		Admin response=adminService.updateAdmin(id,request);
		logger.info("AdminController class end updateAdmin() method response is..."+response);
		return new ResponseEntity<Admin>(response,HttpStatus.OK);
	}
	
	@RequestMapping(value="/deleteAdmin",method=RequestMethod.DELETE,
			consumes="application/json",produces="application/json")
	public ResponseEntity<String> deleteAdmin(@RequestParam int id){
		logger.info("AdminController class start deleteAdmin() method request is...");
		adminService.deleteAdmin(id);
		logger.info("AdminController class end deleteAdmin() method response is...");
		return new ResponseEntity<String>("Admin delete successfully..",HttpStatus.OK);
	}

}
