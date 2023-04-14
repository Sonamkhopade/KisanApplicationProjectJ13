package com.app.KisanProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.KisanProject.entity.Fertilizer;
@Repository
public interface FertilizerRepository extends JpaRepository<Fertilizer, Integer> {

}
