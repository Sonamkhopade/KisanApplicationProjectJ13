package com.app.KisanProject.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.KisanProject.dto.AdminRequest;
import com.app.KisanProject.dto.AdminResponse;
import com.app.KisanProject.entity.Admin;
import com.app.KisanProject.entity.UserRegistration;
import com.app.KisanProject.repository.AdminRepository;

@Service
public class AdminService {
	@Autowired
	private AdminRepository repo;
	AdminResponse response=new AdminResponse();
	Logger logger=LoggerFactory.getLogger(AdminService.class);

	public AdminResponse addAdmin(AdminRequest request) {
		// TODO Auto-generated method stub
		logger.info("UserService class start addAdmin() method request is..."+request);
		Admin admin=CreateAdminObject(request);
		Admin a=repo.save(admin);
		if(a!=null) {
			response.setResponse(a);
			response.setStatus("Successfully User added in database....");
		}
		else {
			response.setResponse(a);
			response.setStatus("Failed to add User in database....!");
		}
		logger.info("UserService class end addAdmin method response is..."+response);
		return response;
	}


	private Admin CreateAdminObject(AdminRequest request) {
		// TODO Auto-generated method stub
		Admin admin=new Admin();
		admin.setaName(request.getaName());
		admin.setEmail(request.getEmail());
		admin.setPassword(request.getPassword());
		return admin;
	}
	
	public AdminResponse loginAdmin(AdminRequest request) {
		// TODO Auto-generated method stub
		Admin admin=repo.findByEmailAndPassword(request.getEmail(),request.getPassword());
		if(admin!=null) {
			response.setResponse(admin);
			response.setStatus("Login successfully...");
		}
		else {
			response.setResponse(admin);
			response.setStatus("Invalid UserName and password");
		}
		return response;
	}
	
	public Admin updateAdmin(int id, AdminRequest request) {
		// TODO Auto-generated method stub
		logger.info("AdminService class start updateAdmin() method request is..."+request);
		Admin admin=CreateAdminObject(request);
		Admin a=repo.findById(id).get();
		Admin a1=null;
		//UserRegistration u1=null;
		if(a!=null) {
			a.setaName(request.getaName());
			a.setEmail(request.getEmail());
			a.setPassword(request.getPassword());
			repo.save(a);
		}
		logger.info("AdminService class end updateAdmin method response is..."+response);
		return a1;
	}

	public void deleteAdmin(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}


	public List<Admin> getAdmin() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}


}
