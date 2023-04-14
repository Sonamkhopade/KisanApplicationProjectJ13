package com.app.KisanProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.KisanProject.entity.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {

}
