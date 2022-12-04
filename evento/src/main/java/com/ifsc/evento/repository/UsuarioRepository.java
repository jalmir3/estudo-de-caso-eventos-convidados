package com.ifsc.evento.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ifsc.evento.models.Usuario;

public interface UsuarioRepository  extends JpaRepository<Usuario,String>{
	
	Usuario findByLogin(String login);

}
