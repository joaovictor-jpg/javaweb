<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<c:url value="/alteraEmpresa" var="LinkServletNovaEmpresa" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${ LinkServletNovaEmpresa }" method="post">
		<label>Nome:</label>
		<input type="text" name="nome" value="${ empresa.nome }" />
		<labe>Data De Inscrição:</labe>
		<input type="text" name="date" value='<fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy"/>' />
		<input type="hidden" name="id" value=${ empresa.id }>
		<input type="submit" />
	</form>
</body>
</html>