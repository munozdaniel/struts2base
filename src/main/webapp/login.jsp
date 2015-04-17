<%@ taglib prefix='c' uri='http://java.sun.com/jstl/core_rt' %>

<html>
  <head>
    <title>Inicio de sesi&oacute;n con spring security</title>
  </head>
  <body onload="document.f.j_username.focus();">
    <h1>Inicio de sesi&oacute;n</h1>
    <form name="f" action="<c:url value='j_spring_security_check'/>" method="POST">
      <table>
        <tr><td>Usuario:</td><td><input type='text' name='j_username' value='<c:if test="${not empty param.login_error}"><c:out value="${SPRING_SECURITY_LAST_USERNAME}"/></c:if>'/></td></tr>
        <tr><td>Password:</td><td><input type='password' name='j_password'></td></tr>
        <tr><td><input type="checkbox" name="_spring_security_remember_me"></td><td>Recordar mi password por 2 semanas</td></tr>
        <tr><td colspan='2'><input name="submit" type="submit"></td></tr>
        <tr><td colspan='2'><input name="reset" type="reset"></td></tr>
      </table>
    </form>
  </body>
</html>
