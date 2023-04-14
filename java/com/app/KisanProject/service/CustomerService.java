package com.app.KisanProject.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.KisanProject.dto.CustomerRequest;
import com.app.KisanProject.dto.CustomerResponse;
import com.app.KisanProject.entity.Admin;
import com.app.KisanProject.entity.Customer;
import com.app.KisanProject.repository.CustomerRepository;

@Service
public class CustomerService {
	@Autowired
	private CustomerRepository customerRepo;
	Logger logger=LoggerFactory.getLogger(CustomerService.class);
	CustomerResponse response=new CustomerResponse();
	
	public CustomerResponse addCustomer(CustomerRequest request) {
		// TODO Auto-generated method stub
		logger.info("CustomerController class start addCustomer() method request is..."+request);
		Customer customer=CreateCustomerObject(request);
		Customer c=customerRepo.save(customer);
		if(c!=null) {
			response.setResponse(c);
			response.setStatus("Customer add in database...");
		}
		else {
			response.setResponse(c);
			response.setStatus("Customer not added in database...");
		}
		logger.info("CustomerController class end addCustomer() method request is..."+response);
		return response;
	}

	private Customer CreateCustomerObject(CustomerRequest request) {
		// TODO Auto-generated method stub
		Customer customer=new Customer();
		customer.setcName(request.getcName());
		customer.setAddress(request.getAddress());
		customer.setMobileNo(request.getMobileNo());
		customer.setEmail(request.getEmail());
		customer.setPassword(request.getPassword());
		customer.setAdmin(request.getAdmin());
		return customer;
	}

	public List<Customer> customerList() {
		// TODO Auto-generated method stub
		return customerRepo.findAll();
	}

	public CustomerResponse customerLogin(CustomerRequest request) {
		// TODO Auto-generated method stub
		Customer customer=customerRepo.findByEmailAndPassword(request.getEmail(),request.getPassword());
		if(customer!=null) {
			response.setResponse(customer);
			response.setStatus("Login Successfully....");
		}
		else {
			response.setResponse(customer);
			response.setStatus("Login failed....");
		}
		return response;
	}

	public Customer getCustomerById(long id) {
		// TODO Auto-generated method stub
		return customerRepo.findById(id).get();
	}

	public Customer updateCustomer(long id, CustomerRequest request) {
		// TODO Auto-generated method stub
		logger.info("CustomerController class start updateCustomer() method request is..."+request);
		//Customer customer=CreateCustomerObject(request);
		Customer c=customerRepo.findById(id).get();
		if(c!=null) {
			c.setcName(request.getcName());
			c.setAddress(request.getAddress());
			c.setEmail(request.getEmail());
			c.setMobileNo(request.getMobileNo());
			c.setPassword(request.getPassword());
			customerRepo.save(c);
		}
		return c;
	}

	public void deleteCustomer(long id) {
		// TODO Auto-generated method stub
		customerRepo.deleteById(id);
	}
	
}
