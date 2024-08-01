package com.gestionaletour.dataacces;

import java.util.List;
import java.util.Optional;

import com.gestionaletour.entity.Prenotazione;
import com.gestionaletour.entity.Utente;

public interface PrenotazioneDao {

	List<Prenotazione> getAllPrenotazioni();
	List<Prenotazione> getPrenotazioneByUtente(Utente utente);
	
	void aggiungiPrenotazione(Prenotazione prenotazione);
	void rimuoviPrenotazioneById(Integer id);
	
}
