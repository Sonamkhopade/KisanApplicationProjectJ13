package com.app.KisanProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.KisanProject.entity.Admin;
@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {

	Admin findByemail(String email);

	Admin findBypassword(String password);

	Admin findByEmailAndPassword(String email, String password);

}
