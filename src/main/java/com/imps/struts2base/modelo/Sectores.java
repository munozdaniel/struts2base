/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imps.struts2base.modelo;

import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author dmunioz
 */
public class Sectores implements GrantedAuthority {

    private static final long serialVersionUID = 1L;
    private String nombrePerfil;

    public Sectores() {

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
