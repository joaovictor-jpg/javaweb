<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/novaEmpresa" var="LinkServletNovaEmpresa" />
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="${ LinkServletNovaEmpresa }" method="post">
		<label>Nome:</label> <input type="text" name="nome" />
		<labe>Data De Inscrição:</labe> <input type="txt" name="date" />
		<input type="submit" />
	</form>
</body>
</html>