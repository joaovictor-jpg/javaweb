<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Consulta</title>
</head>
<body>
	<p>
	<c:if test="${ not empty navio }">
		Cadastro de Navio:
		${ navio }
	</c:if>
	<c:if test="${ empty navio }"> Nenhum navio cadastrado</c:if>
	</p>
</body>
</html>