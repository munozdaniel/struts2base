package com.imps.struts2base.servicio;

import com.imps.struts2base.modelo.Calculadora;
import java.math.BigDecimal;
import java.util.List;


public abstract interface CalculadoraService{
  public abstract BigDecimal sumar(List<BigDecimal> parametros);
  public abstract BigDecimal restar(List<BigDecimal> parametros);
  public abstract BigDecimal multiplicar(List<BigDecimal> parametros);
  public abstract BigDecimal dividir(List<BigDecimal> parametros);
  public abstract BigDecimal calcular(List<BigDecimal> parametros, String operador);
  public abstract BigDecimal calcular(Calculadora calculadora);
}
