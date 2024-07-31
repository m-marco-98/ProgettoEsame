package com.gestionaletour.dataacces.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gestionaletour.dataacces.TourDao;
import com.gestionaletour.entity.Tour;
import com.gestionaletour.repository.TourRepository;

@Component
public class TourDaoImpl implements TourDao{
	
	@Autowired
	TourRepository tourRepository;
	
	public List<Tour> getAllTour() {
		return tourRepository.findAll();
	}
	
	public Optional<Tour> getTourById(Integer id) {
		return tourRepository.findById(id);
	}

	public void aggiungiTour(Tour tour) {
		tourRepository.save(tour);
	}

	public void rimuoviTourById(Integer id) {
		tourRepository.deleteById(id);		
	}

}
