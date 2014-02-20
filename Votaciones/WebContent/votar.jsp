<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Votaciones</title>
</head>
<body>
	<h1>Votaciones</h1>
    <h2>Votar</h2>

	<form action="solitaire" method="post">
		<input type="hidden" name="action" value="register" />
		
		<p>Tu me quieres?</p>
       
        <p>Respuesta: <select name="opcion" size="1">
            <c:forEach var="xxx" items="${bean.opcion}"><option value="${xxx}">${xxx}</option></c:forEach>
        </select></p>
        
		<p><input type="reset" /><input type="submit" value="Register" /></p>
	</form>
	<p><a href="?action=home">Home</a></p>
</body>
</html>