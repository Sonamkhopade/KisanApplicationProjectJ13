package com.app.KisanProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.KisanProject.entity.Market;

@Repository
public interface MarketRepository extends JpaRepository<Market, Long> {

}
