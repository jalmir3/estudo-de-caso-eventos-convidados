package com.ifsc.evento.models;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import org.springframework.security.core.GrantedAuthority;
@Entity
public class Role  implements GrantedAuthority{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String nomeRole;
	
	@ManyToMany(fetch =FetchType.EAGER)
	private List<Usuario> usuarios;

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public String getNomeRole() {
		return nomeRole;
	}

	public void setNomeRole(String nomeRole) {
		this.nomeRole = nomeRole;
	}
	@Override
	public String getAuthority() {
		return this.nomeRole;
	}

}
