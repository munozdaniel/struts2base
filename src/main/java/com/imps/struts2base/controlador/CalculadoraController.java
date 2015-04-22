/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.imps.struts2base.controlador;

import com.imps.struts2base.modelo.Calculadora;
import com.imps.struts2base.servicio.CalculadoraService;
import java.math.BigDecimal;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 *
 * @author dmunioz
 */
@Controller
public class CalculadoraController {

    @Autowired
    private CalculadoraService calculadoraService;

    protected final Log logger = LogFactory.getLog(getClass());

    @RequestMapping(value = "/public/iniciar.htm", method = RequestMethod.GET)
    public String iniciar(Model model) throws Exception {
        logger.info("Iniciando aplicación de ejemplo de spring security.");
        model.addAttribute(new Calculadora());
        return "/index";
    }

    @RequestMapping(value = "/public/calcular.htm", method = RequestMethod.POST)
    public String calcular(@ModelAttribute Calculadora calculadora)
            throws Exception {
        logger.info("Inicio del calculo.");
        BigDecimal resultado = calculadoraService.calcular(calculadora);
        calculadora.setResultado(resultado);
        logger.info("Resultado del calculo:" + resultado);
        logger.info("Fin del calculo.");
        return "/WEB-INF/jsp/calculadoraForm";
    }

    @RequestMapping(value = "/public/mostrarFormulario.htm", method = RequestMethod.GET)
    public String mostrarFormularioAnon(Model model) throws Exception {
        logger.info("Mostrar Formulario Anonimo.");
        model.addAttribute("seguridad", "Anonima");
        model.addAttribute(new Calculadora());
        return "/WEB-INF/jsp/calculadoraForm";
    }

    @RequestMapping(value = {"/private/super/mostrarFormulario1.htm",
        "/private/super/mostrarFormulario2.htm"}, method = RequestMethod.GET)
    public String mostrarFormularioSuper(Model model) throws Exception {
        logger.info("Mostrar Formulario Supervisor.");
        model.addAttribute("seguridad", "Supervisor");
        model.addAttribute(new Calculadora());
        return "/WEB-INF/jsp/calculadoraForm";
    }

    @RequestMapping(value = {"/private/admin/mostrarFormulario1.htm",
        "/private/admin/mostrarFormulario2.htm"}, method = RequestMethod.GET)
    public String mostrarFormularioAdmin(Model model) throws Exception {
        logger.info("Mostrar Formulario Administrador.");
        logger.info("Calcular Administrador.");
        model.addAttribute("seguridad", "Administrador");
        model.addAttribute(new Calculadora());
        return "/WEB-INF/jsp/calculadoraForm";
    }

}
