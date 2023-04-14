package com.app.KisanProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.KisanProject.entity.Soil;
@Repository
public interface SoilRepository extends JpaRepository<Soil, Integer> {

}
