<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt' %>
<html>
  <head>
    <title>Inicio de sesi&oacute;n con spring security</title>
  </head>
  <body>
    <h1>Su autenticación a fallado, mensaje: <c:out value="${SPRING_SECURITY_LAST_EXCEPTION.message}"/></h1>
    <h1><a href="<c:url value='/public/iniciar.htm'/>">REINICIAR</a></h1>
  </body>
</html>
