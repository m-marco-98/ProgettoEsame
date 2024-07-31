package com.gestionaletour.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionaletour.entity.Tour;

@Repository
public interface TourRepository extends JpaRepository<Tour, Integer>{
	

}
