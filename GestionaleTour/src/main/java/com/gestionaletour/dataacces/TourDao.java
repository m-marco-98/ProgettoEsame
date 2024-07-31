package com.gestionaletour.dataacces;

import java.util.List;
import java.util.Optional;

import com.gestionaletour.entity.Tour;

public interface TourDao {
	
	List<Tour> getAllTour();
	Optional<Tour> getTourById(Integer id);
	
	void aggiungiTour(Tour tour);
	void rimuoviTourById(Integer id);

}
