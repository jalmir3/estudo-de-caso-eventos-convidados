package com.ifsc.evento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifsc.evento.models.Convidado;
import com.ifsc.evento.models.Evento;



public interface ConvidadoRepository extends JpaRepository<Convidado,String>{
	
	
	Iterable<Convidado>findByEvento(Evento evento);
    
	Convidado findByRg(String rg);



}
