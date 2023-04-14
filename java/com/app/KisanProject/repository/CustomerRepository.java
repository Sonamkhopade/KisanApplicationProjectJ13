package com.app.KisanProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.KisanProject.entity.Customer;
@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Customer findByemail(String email);

	Customer findBypassword(String password);

	Customer findByEmailAndPassword(String email, String password);

}
