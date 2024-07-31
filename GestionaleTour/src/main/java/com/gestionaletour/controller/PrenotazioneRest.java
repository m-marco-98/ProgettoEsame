package com.gestionaletour.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gestionaletour.entity.Prenotazione;
import com.gestionaletour.service.PrenotazioneService;

@RestController
@RequestMapping(path = "/prenotazione")
@CrossOrigin
public class PrenotazioneRest {
	
	@Autowired
	PrenotazioneService prenotazioneService;
	
//	@GetMapping
//	public List<Prenotazione> getPrenotazioniByUserId(Integer userId) {
//		return prenotazioneService.getPrenotazioniByUserId(userId);
//	}
	
	@GetMapping(path = "find-all-prenotazioni")
	public List<Prenotazione> getAllPrenotazioni(){
		return prenotazioneService.getAllPrenotazioni();
	}
	
	@PostMapping(path = "add-prenotazione")
	public void aggiungiPrenotazione(Prenotazione prenotazione) {
		prenotazioneService.aggiungiPrenotazione(prenotazione);
	}
	
	@DeleteMapping(path = "delete-prenotazione-by-id")
	public void rimuoviPrenotazioneById(Integer id) {
		prenotazioneService.rimuoviPrenotazioneById(id);
	}
	
	

}
