package com.gestionaletour.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionaletour.entity.Prenotazione;

@Repository
public interface PrenotazioneRepository extends JpaRepository<Prenotazione, Integer>{
	
//	List<Prenotazione> findPrenotazioneByUserId(Integer userId);

}
