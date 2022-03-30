<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.treino.treinonaweb.servlet.Navio" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<c:url value="/removeNavio" var="remove"></c:url>
<c:url value="/atualizarNavio" var="atualizar"></c:url>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista De Nacios</title>
</head>
<body>
	<p>
		<c:if test="${ not empty navio }">
			Cadastro de Navio: ${ navio }
		</c:if>
	</p>
	<h1>Lista de Navios:</h1>
	<ol>
		<c:forEach items="${ navios }" var="navio">
			<li>
				${ navio.nome } - <fmt:formatDate value="${ navio.dataCadastro }" pattern="dd/MM/yyyy"/>
				<a href="${ atualizar }?id=${ navio.id }">Editar</a>
				<a href="${ remove }?id=${ navio.id }">Remover</a>
			</li>
		</c:forEach>
	</ol>
</body>
</html>