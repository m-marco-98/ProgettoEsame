package com.gestionaletour.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestionaletour.dataacces.impl.PrenotazioneDaoImpl;
import com.gestionaletour.entity.Prenotazione;
import com.gestionaletour.entity.Tour;
import com.gestionaletour.entity.Utente;

@Service
public class PrenotazioneService {
	
	@Autowired
	PrenotazioneDaoImpl prenotazioneDao;
	
	public List<Prenotazione> getAllPrenotazioni() {
		return prenotazioneDao.getAllPrenotazioni();
	}
	
	public List<Prenotazione> getPrenotazioniByUtente(Utente utente) {
		return prenotazioneDao.getPrenotazioneByUtente(utente);		
	}

	public void aggiungiPrenotazione(Prenotazione prenotazione) {
		prenotazioneDao.aggiungiPrenotazione(prenotazione);
	}
	
	public void rimuoviPrenotazioneById(Integer id) {
		prenotazioneDao.rimuoviPrenotazioneById(id);
	}	
	
}
