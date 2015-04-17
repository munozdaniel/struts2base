package com.imps.struts2base.modelo;

import java.math.BigDecimal;

public class Calculadora {

	private String operacion;
	private BigDecimal operador1;
	private BigDecimal operador2;
	private BigDecimal resultado;
	
	public String getOperacion() {
		return operacion;
	}
	public void setOperacion(String operacion) {
		this.operacion = operacion;
	}
	public BigDecimal getOperador1() {
		return operador1;
	}
	public void setOperador1(BigDecimal operador1) {
		this.operador1 = operador1;
	}
	public BigDecimal getResultado() {
		return resultado;
	}
	public void setResultado(BigDecimal resultado) {
		this.resultado = resultado;
	}
	public BigDecimal getOperador2() {
		return operador2;
	}
	public void setOperador2(BigDecimal operador2) {
		this.operador2 = operador2;
	}

}
