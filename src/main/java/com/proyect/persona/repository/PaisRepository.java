package com.proyect.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.proyect.persona.model.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Long>{

}
