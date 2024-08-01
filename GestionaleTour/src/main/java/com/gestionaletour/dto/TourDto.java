package com.gestionaletour.dto;

import java.util.List;

import com.gestionaletour.entity.Prenotazione;

import jakarta.annotation.Nullable;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class TourDto {
	
	private int id; 

	private String nome; 

	private String tipo; 

	private int postiMax; 

	private boolean disponibilita;
	@Nullable
	private PrenotazioneDto prenotazione;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public int getPostiMax() {
		return postiMax;
	}
	public void setPostiMax(int postiMax) {
		this.postiMax = postiMax;
	}
	public boolean isDisponibilita() {
		return disponibilita;
	}
	public void setDisponibilita(boolean disponibilita) {
		this.disponibilita = disponibilita;
	}
	public PrenotazioneDto getPrenotazione() {
		return prenotazione;
	}
	public void setPrenotazione(PrenotazioneDto prenotazione) {
		this.prenotazione = prenotazione;
	}
	
	
}
