package com.imps.struts2base.modelo;

import org.springframework.security.core.GrantedAuthority;

public class Perfil implements GrantedAuthority{

	private static final long serialVersionUID = 1L;
	private String nombrePerfil;
	
	public Perfil(){
	}
	
	public String getNombrePerfil() {
		return nombrePerfil;
	}

	public void setNombrePerfil(String nombrePerfil) {
		this.nombrePerfil = nombrePerfil;
	}

	@Override
	public String getAuthority() {
		return this.nombrePerfil;
	}

}
