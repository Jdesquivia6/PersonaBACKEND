package com.proyect.persona.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.proyect.persona.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Long>{

}
