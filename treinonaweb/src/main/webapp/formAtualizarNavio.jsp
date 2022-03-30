<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/atualizarRegistros" var="candastro"></c:url>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${ candastro }" method="POST">
		<label>Nome:</label><input type="text" name="nome" value="${ navio.nome }"> 
		<label>Data de inscrição:</label><input	type="text" name="date" value='<fmt:formatDate value="${ navio.dataCadastro }" pattern="dd/MM/yyyy"/>'>
		<input type="hidden" name="id" value="${ navio.id }">
		<input type="submit" />
	</form>
</body>
</html>