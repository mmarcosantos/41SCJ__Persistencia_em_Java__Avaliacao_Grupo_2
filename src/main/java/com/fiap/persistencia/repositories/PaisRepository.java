package com.fiap.persistencia.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.fiap.persistencia.domain.Pais;

@Repository
public interface PaisRepository extends JpaRepository<Pais, Integer> {

}
