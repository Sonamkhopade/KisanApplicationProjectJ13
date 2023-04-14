package com.app.KisanProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.KisanProject.entity.Crop;

@Repository
public interface CropRepository extends JpaRepository<Crop, Integer>{

}
