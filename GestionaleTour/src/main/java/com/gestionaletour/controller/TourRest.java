package com.gestionaletour.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestionaletour.entity.Tour;
import com.gestionaletour.service.TourService;

@RestController
@RequestMapping(path = "/tour")
@CrossOrigin
public class TourRest {
	
	@Autowired
	TourService tourService;
	
	@GetMapping(path = "find-all-tour")
	public List<Tour> getAllTour(){
		return tourService.getAllTour();
	}	
	
	@GetMapping(path = "find-tour-by-id")
	public Optional<Tour> getTourById(Integer id) {
		return tourService.getTourById(id);
	}
	
	@PostMapping(path = "aggiungi-tour")
	public void aggiungiTour(Tour tour) {
		tourService.aggiungiTour(tour);
	}
	
	@DeleteMapping(path = "rimuovi-tour")
	public void rimuoviTourById(Integer id) {
		tourService.rimuoviTourById(id);
	}

}
