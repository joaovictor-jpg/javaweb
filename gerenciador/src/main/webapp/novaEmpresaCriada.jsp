
<%
//Scriptlet
//Java Sever Page -> JSP
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa</title>
</head>
<body>
	<c:if test="${ not empty empresa }">Cadastrda ${ empresa } com sucesso!</c:if>
	<c:if test="${ empty empresa }"> Nenhuma empresa cadastrada!</c:if>
</body>
</html>