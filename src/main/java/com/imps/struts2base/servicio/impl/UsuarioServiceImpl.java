/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imps.struts2base.servicio.impl;

import com.imps.struts2base.dao.UsuarioDAO;
import com.imps.struts2base.modelo.Usuario;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * implementación del gestor de usuarios
 *
 * @author dmunioz
 */
@Service("usuarioService")//Ver si se puede agregar en el xml para no tener mezclado xml con anotaciones.
public class UsuarioServiceImpl implements UserDetailsService {
    //Autowiring reduce o incluso elimina la necesidad de configurar 
    //<property> o <contructor-arg> en nuestras beans.
    @Autowired
    private UsuarioDAO usuarioDAO;

  @Override
	public UserDetails loadUserByUsername(String username)
			throws UsernameNotFoundException, DataAccessException {
		Usuario usuario = null;
		List<Usuario> usuarios = usuarioDAO.buscarUsuarioPorCodigo(username);
		if(usuarios.size()==0)throw new UsernameNotFoundException("Usuario no existe.");
		else{
			usuario = usuarios.get(0);
			usuario.setPerfiles(usuarioDAO.buscarSectoresDeUsuariosPorCodigo(username));
			return usuario;	
		}
	}

}
