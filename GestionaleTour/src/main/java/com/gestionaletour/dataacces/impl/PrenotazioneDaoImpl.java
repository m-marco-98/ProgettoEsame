package com.gestionaletour.dataacces.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.gestionaletour.dataacces.PrenotazioneDao;
import com.gestionaletour.entity.Prenotazione;
import com.gestionaletour.repository.PrenotazioneRepository;

@Component
public class PrenotazioneDaoImpl implements PrenotazioneDao{

	@Autowired
	PrenotazioneRepository prenotazioneRepository;

	public void aggiungiPrenotazione(Prenotazione prenotazione) {
		prenotazioneRepository.save(prenotazione);
	}
	
	public void rimuoviPrenotazioneById(Integer id) {
		prenotazioneRepository.deleteById(id);
	}

	public List<Prenotazione> getAllPrenotazioni() {
		return prenotazioneRepository.findAll();
	}

//	public List<Prenotazione> getPrenotazioniByUserId(Integer userId) {
//		return prenotazioneRepository.findPrenotazioneBy(userId);
//	}
}
