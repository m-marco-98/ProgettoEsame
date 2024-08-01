package com.gestionaletour.entity;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;


@Entity
@Table(name = "utenti")
public class Utente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer utenteId;
	@Column(name = "nome")
	private String nome;
	@Column(name = "cognome")
	private String cognome;
	@Column(name = "eta")
	private int eta;
	@OneToOne(mappedBy = "utente")
	@JoinColumn(name = "prenotazione_id")
	private Prenotazione prenotazione;
	
	
	public int getUtenteId() {
		return utenteId;
	}
	public void setUtenteId(Integer utenteId) {
		this.utenteId = utenteId;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getEta() {
		return eta;
	}
	public void setEta(int eta) {
		this.eta = eta;
	}
//	public Prenotazione getPrenotazione() {
//		return prenotazione;
//	}
//	public void setPrenotazione(Prenotazione prenotazione) {
//		this.prenotazione = prenotazione;
//	}
//	
	
}
