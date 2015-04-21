/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imps.struts2base.dao;

import com.imps.struts2base.modelo.Sectores;
import com.imps.struts2base.modelo.Usuario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.security.core.GrantedAuthority;

/**
 * El proveedor de usuarios hace uso de un objeto de acceso a datos, que lo he
 * implementado con spring jdbc:
 *
 * @author dmunioz
 */
public class UsuarioDAOImpl implements UsuarioDAO {

    /*primero obtenemos el equivalente Spring a una conexión con base de datos.
     Aunque hay muchas formas de hacerlo, incluyendo ficheros de configuración, 
     vamos a hacer aquí una forma más inmediata, directamente en código. 
     El equivalente Spring a la clase Connection es JdbcTemplate.*/
    private JdbcTemplate jdbcTemplate;

    //Sin Get.
    public void setDataSource(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    /*Accedemos a la base de datos y recuperamos un usuario segun el codigo
     ingresado*/

    @Override
    public List<Usuario> buscarUsuarioPorCodigo(String codigo) {
        return this.jdbcTemplate.query("SELECT * FROM usuario WHERE cod_usuario= ?",
                new RowMapper() {

                    @Override
                    public Object mapRow(ResultSet rs, int i) throws SQLException {
                        Usuario unUsuario = new Usuario();
                        unUsuario.setUsername(rs.getString("cod_usuario"));
                        unUsuario.setPassword(rs.getString("des_password"));
                        unUsuario.setAccountNonExpired(rs.getString("in_cuenta_expirada").equals("N") ? true : false);
                        unUsuario.setAccountNonLocked(rs.getString("in_cuenta_bloqueada").equals("N") ? true : false);
                        unUsuario.setCredentialsNonExpired(rs.getString("in_credencial_expirada").equals("N") ? true : false);
                        unUsuario.setEnabled(rs.getString("in_habilitado").equals("S") ? true : false);
                        return unUsuario;

                    }

                }, codigo);
    }

    @Override
    public List<? extends GrantedAuthority> buscarSectoresDeUsuariosPorCodigo(String codigo) {
        return this.jdbcTemplate.query("select sector_perfil from sectores s, usuario u where u.usuario_sector=s.sector_id and cod_usuario = ?",
                new RowMapper() {

                    @Override
                    public Object mapRow(ResultSet rs, int i) throws SQLException {
                        Sectores sectores = new Sectores();
                        sectores.setNombrePerfil(rs.getString("sector_perfil"));
                        return sectores;
                    }
                }, codigo);
    }

}
