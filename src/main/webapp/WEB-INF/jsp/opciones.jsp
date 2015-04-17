<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Listado de opciones</title>
</head>
<body>
	<table align='center'>
		<tbody>
			<tr><td align="left">Seleccione opci&oacute;n;</td></tr>
			<tr><td align="left"><a href="<c:url value="/public/mostrarFormulario.htm"/>">Opci&oacute;n An&oacute;nima</a></td></tr>
			<tr><td align="left"><a href="<c:url value="/private/super/mostrarFormulario1.htm"/>">Opci&oacute;n Supervisor 1</a></td></tr>
			<tr><td align="left"><a href="<c:url value="/private/super/mostrarFormulario2.htm"/>">Opci&oacute;n Supervisor 2</a></td></tr>
			<tr><td align="left"><a href="<c:url value="/private/admin/mostrarFormulario1.htm"/>">Opci&oacute;n Administrador 1</a></td></tr>
			<tr><td align="left"><a href="<c:url value="/private/admin/mostrarFormulario2.htm"/>">Opci&oacute;n Administrador 2</a></td></tr>
		</tbody>
	</table>
</body>
</html>