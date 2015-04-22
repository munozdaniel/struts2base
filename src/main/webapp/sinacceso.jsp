<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt' %>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
  <head>
    <title>Acceso denegado</title>
  </head>
  <body>
    <h1>Usted no tiene acceso al recurso que trataba de acceder.</h1>
    <h1><a href="<c:url value='/public/iniciar.htm'/>">REINICIAR</a></h1>
  </body>
</html>
