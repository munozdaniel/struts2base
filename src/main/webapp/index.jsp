<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title>Pagina de inicio</title>
    </head>
    <body>
        <h1>Bienvenido a la pagina de inicio.</h1>
        <h2>Para loguearse: <a  href="<s:url action='login'/>">AQUI</a></h2>
        <br><a href="<c:url value="/private/admin/mostrarFormulario2.htm"/>">Novedades (Acceso SuperAdministrador)</a>
        <br><a href="<c:url value="/public/mostrarFormulario.htm"/>">Acceso Publico</a>
        <br><a href="<c:url value="/private/super/mostrarFormulario1.htm"/>">Servicios (Acceso Empleados)</a>
    </body>
</html>
