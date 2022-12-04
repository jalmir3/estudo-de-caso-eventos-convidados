package com.ifsc.evento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifsc.evento.models.Evento;

public interface EventoRepository extends JpaRepository<Evento,String>{

	Evento findByCodigo(long codigo);

}
