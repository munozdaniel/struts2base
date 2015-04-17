package com.imps.struts2base.servicio.impl;

import com.imps.struts2base.modelo.Calculadora;
import com.imps.struts2base.servicio.CalculadoraService;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service("calculadoraService")
public class CalculadoraServiceImpl implements CalculadoraService {

    public BigDecimal dividir(List<BigDecimal> parametros) {
        BigDecimal operador1 = parametros.get(0);
        BigDecimal operador2 = parametros.get(1);
        return operador1.divide(operador2);
    }

    public BigDecimal multiplicar(List<BigDecimal> parametros) {
        BigDecimal resultado = BigDecimal.ONE;
        for (BigDecimal operando : parametros) {
            resultado = resultado.multiply(operando);
        }
        return resultado;
    }

    public BigDecimal restar(List<BigDecimal> parametros) {
        BigDecimal operador1 = parametros.get(0);
        BigDecimal operador2 = parametros.get(1);
        return operador1.subtract(operador2);
    }

    public BigDecimal sumar(List<BigDecimal> parametros) {
        BigDecimal resultado = BigDecimal.ZERO;
        for (BigDecimal operando : parametros) {
            resultado = resultado.add(operando);
        }
        return resultado;
    }

    @Override
    public BigDecimal calcular(Calculadora calculadora) {
        List<BigDecimal> parametros = new ArrayList<BigDecimal>();
        parametros.add(calculadora.getOperador1());
        parametros.add(calculadora.getOperador2());
        String operacion = calculadora.getOperacion();
        if (operacion.equals("sumar")) {
            return sumar(parametros);
        }
        if (operacion.equals("restar")) {
            return restar(parametros);
        }
        if (operacion.equals("multiplicar")) {
            return multiplicar(parametros);
        }
        if (operacion.equals("dividir")) {
            return dividir(parametros);
        }
        return null;
    }

    @Override
    public BigDecimal calcular(List<BigDecimal> parametros, String operador) {
        // TODO Auto-generated method stub
        return null;
    }

}
