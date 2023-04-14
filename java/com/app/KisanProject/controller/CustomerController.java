package com.app.KisanProject.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.KisanProject.dto.CustomerRequest;
import com.app.KisanProject.dto.CustomerResponse;
import com.app.KisanProject.dto.UserRequest;
import com.app.KisanProject.dto.UserResponse;
import com.app.KisanProject.entity.Customer;
import com.app.KisanProject.entity.UserRegistration;
import com.app.KisanProject.service.CustomerService;

@RestController
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	Logger logger=LoggerFactory.getLogger(CustomerController.class);
	
	@RequestMapping(value="/addCustomer",method=RequestMethod.POST,
			consumes="application/json",produces="application/json")
	public ResponseEntity<CustomerResponse> addCustomer(@RequestBody CustomerRequest request){
		logger.info("CustomerController class start addCustomer() method request is..."+request);
		CustomerResponse response=customerService.addCustomer(request);
		logger.info("Customercontroller class end addCustomer() method response is..."+response);
		return new ResponseEntity<CustomerResponse>(response,HttpStatus.CREATED);
	}
	
	@RequestMapping(value="/customerList",method=RequestMethod.GET,
			produces="application/json")
	public ResponseEntity<List<Customer>> customerList(){
		logger.info("CustomerController class start customerList() method request is...");
		List<Customer> response=customerService.customerList();
		logger.info("customerController class end customerList() method response is..."+response);
		return new ResponseEntity<List<Customer>>(response,HttpStatus.OK);
	}
	
	@RequestMapping(value="/customerLogin",method=RequestMethod.POST,
			consumes="application/json",produces="application/json")
	public ResponseEntity<CustomerResponse> customerLogin(@RequestBody CustomerRequest request){
		logger.info("CustomerController class start customerLogin() method request is..."+request);
		CustomerResponse response=customerService.customerLogin(request);
		logger.info("CustomerController class end customerLogin() method request is..."+response);
		return new ResponseEntity<CustomerResponse>(response,HttpStatus.OK);
	}
	
	@RequestMapping(value="/getCustomerById",method=RequestMethod.GET,
			produces="application/json")
	public ResponseEntity<Customer> getCustomerById(@RequestParam long id){
		logger.info("CustomerController class start getCustomerById() method request is...");
		Customer response=customerService.getCustomerById(id);
		logger.info("CustomerController class end getCustomerById() method response is..."+response);
		return new ResponseEntity<Customer>(response,HttpStatus.OK);
	}
	
	@RequestMapping(value="/updateCustomer",method=RequestMethod.PUT,
			consumes="application/json",produces="application/json")
	public ResponseEntity<Customer> updateCustomer(@RequestParam long id,
			@RequestBody CustomerRequest request){
		logger.info("CustomerController class start updateCustomer() method request is..."+request);
		Customer response=customerService.updateCustomer(id,request);
		logger.info("CustomerController class end updateCustomer() method response is..."+response);
		return new ResponseEntity<Customer>(response,HttpStatus.OK);
	}
	
	@RequestMapping(value="/deleteCustomer",method=RequestMethod.DELETE)
	public ResponseEntity<String> deleteCustomer(@RequestParam long id){
		logger.info("CustomerController class start deleteCustomer() method request is...");
		customerService.deleteCustomer(id);
		logger.info("CustomerController class end deleteCustomer() method response is...");
		return new ResponseEntity<String>("delete successfully...",HttpStatus.OK);
	}
}
