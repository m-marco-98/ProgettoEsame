package com.gestionaletour.dataacces;

import java.util.List;
import java.util.Optional;

import com.gestionaletour.entity.Prenotazione;

public interface PrenotazioneDao {

	List<Prenotazione> getAllPrenotazioni();
//	List<Prenotazione> getPrenotazioniByUserId(Integer userId);
	
	void aggiungiPrenotazione(Prenotazione prenotazione);
	void rimuoviPrenotazioneById(Integer id);
	
}
