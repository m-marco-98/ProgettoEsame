package com.gestionaletour.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionaletour.dataacces.impl.TourDaoImpl;
import com.gestionaletour.entity.Tour;

@Service
public class TourService {
	
	@Autowired
	TourDaoImpl tourDaoImpl;
	
	public List<Tour> getAllTour() {
		return tourDaoImpl.getAllTour();
	}
	
	public Optional<Tour> getTourById(Integer id) {
		return tourDaoImpl.getTourById(id);
	}
	
	public void aggiungiTour(Tour tour) {
		tourDaoImpl.aggiungiTour(tour);
	}
	
	public void rimuoviTourById(Integer id) {
		tourDaoImpl.rimuoviTourById(id);
	}

}
