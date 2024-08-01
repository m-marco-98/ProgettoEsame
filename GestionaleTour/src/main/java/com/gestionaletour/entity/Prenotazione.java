package com.gestionaletour.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "prenotazioni")
public class Prenotazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer prenotazioneId; 
	@OneToOne
	@JoinColumn(name = "tour_id")
	private Tour tour;
	@OneToOne
	@JoinColumn(name = "utente_id")
	private Utente utente; 
	@Column(name = "data_prenotazione")
	private String dataPrenotazione;
	
	
	public int getPrenotazioneId() {
		return prenotazioneId;
	}
	public void setPrenotazioneId(Integer prenotazioneId) {
		this.prenotazioneId = prenotazioneId;
	}
	public Tour getTour() {
		return tour;
	}
	public void setTour(Tour tour) {
		this.tour = tour;
	}
	public Utente getUtente() {
		return utente;
	}
	public void setUtente(Utente utente) {
		this.utente = utente;
	}
	public String getDataPrenotazione() {
		return dataPrenotazione;
	}
	public void setDataPrenotazione(String dataPrenotazione) {
		this.dataPrenotazione = dataPrenotazione;
	}
	
	
	
	
}
