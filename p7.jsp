<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%int a=Integer.parseInt(request.getParameter("a")); %>
	<%int b=Integer.parseInt(request.getParameter("b")); %>
	<h2>ARITHMETIC CALCULATION</h2><br>
	<p> VALUE OF THE 1ST NUMBER IS: <%=a%><br>
	VALUE OF THE 2ND NUMBER IS: <%=b%><br>
	ADDITION: <%=(a+b)%><br>
	SUBTRACTION: <%=(a-b)%><br>
	MULTIPLICATION: <%=(a*b)%><br>
	DIVISION: <%=(a/b)%><br>
</p>

</body>
</html>
