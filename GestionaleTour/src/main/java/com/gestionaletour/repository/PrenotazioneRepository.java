package com.gestionaletour.repository;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionaletour.entity.Prenotazione;
import com.gestionaletour.entity.Utente;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Integer>{
	
	List<Prenotazione> findByUtente(Utente utente);

}
