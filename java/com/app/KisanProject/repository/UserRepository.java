package com.app.KisanProject.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.KisanProject.entity.UserRegistration;
@Repository
public interface UserRepository extends JpaRepository<UserRegistration, Long> {

	UserRegistration findByEmailAndPassword(String email, String password);

	Optional<UserRegistration> findByname(String name);

	Optional<UserRegistration> findByName(String name);

}
