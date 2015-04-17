<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Aplicaci&oacute;n de Ejemplo de Spring Security</title>
</head>
<body>
<form:form modelAttribute="calculadora" action="${pageContext.request.contextPath}/public/calcular.htm">
	<table align='center'>
		<tbody>
			<tr> 
				<th align="right">Seleccione Operaci&oacute;n:</th>
				<td>
					<form:select path="operacion">
						<form:option value="sumar">Sumar</form:option>
						<form:option value="restar">Restar</form:option>
						<form:option value="multiplicar">Multiplicar</form:option>
						<form:option value="dividir">Dividir</form:option>
					</form:select>
				</td>
			</tr>
			<tr>
				<th align="right">Operador1:</th>
				<td>
					<form:input path="operador1"/>
					<span style='color:red'><form:errors path="operador1"/></span>
				</td>
			</tr>
			<tr>
				<th align="right">Operador2:</th>
				<td>
					<form:input path="operador2"/>
					<span style='color:red'><form:errors path="operador2"/></span>
				</td>
			</tr>
			<tr>
				<td align='center' colspan="2"><input type="submit" value="Calcular"/></td>
			</tr>
			
			<tr><td align="center" colspan="2">
				<a href="<c:url value="/public/terminarSesion.htm"/>">TERMINAR SESI&Oacute;N</a>
			</td></tr>
		</tbody>
	</table>
	<br>
	<table align='center'>
		<tbody>
			<tr><td><b>Resultado:<c:out value="${calculadora.resultado}"/></b></td></tr>
		</tbody>
	</table>
</form:form>
</body>
</html>