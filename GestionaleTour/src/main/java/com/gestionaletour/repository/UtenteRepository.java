package com.gestionaletour.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestionaletour.entity.Utente;

@Repository
public interface UtenteRepository extends JpaRepository<Utente, Integer>{

}
