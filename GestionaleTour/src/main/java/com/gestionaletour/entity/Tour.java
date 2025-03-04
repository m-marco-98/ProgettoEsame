package com.gestionaletour.entity;

import java.util.List;

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
@Table(name = "tours")
public class Tour {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer tourId; 
	@Column(name = "nome")
	private String nome; 
	@Column(name = "tipo")
	private String tipo; 
	@Column(name = "posti_max")
	private int postiMax; 
	@Column(name = "disponibilita")
	private boolean disponibilita;
	@OneToOne(mappedBy = "tour")
	@JoinColumn(name = "prenotazione_id")
	private Prenotazione prenotazione;
	
	
	public int getTourId() {
		return tourId;
	}
	public void setTourId(Integer tourId) {
		this.tourId = tourId;
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
//	public Prenotazione getPrenotazione() {
//		return prenotazione;
//	}
//	public void setPrenotazione(Prenotazione prenotazione) {
//		this.prenotazione = prenotazione;
//	}
	
			
}
