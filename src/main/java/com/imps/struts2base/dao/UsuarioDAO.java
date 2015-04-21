/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imps.struts2base.dao;

import com.imps.struts2base.modelo.Usuario;
import java.util.List;
import org.springframework.security.core.GrantedAuthority;

/**
 *
 * @author dmunioz
 */
public interface UsuarioDAO {
    List<Usuario> buscarUsuarioPorCodigo(String codigo);
    List<? extends GrantedAuthority> buscarSectoresDeUsuariosPorCodigo(String codigo);
}
