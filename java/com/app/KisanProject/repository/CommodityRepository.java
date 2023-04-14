package com.app.KisanProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.KisanProject.entity.Commodity;

public interface CommodityRepository extends JpaRepository<Commodity, Long> {

}
