<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Formulario de registro</title>
</head>
<body>

	<form:form action="procesarFormulario" modelAttribute="alumno">
	
	Nombre: <form:input path="nombre"/><br>
	<form:errors path="nombre" style="color:red"/>
	<br><br><br>
	
	Apellido: <form:input path="apellido"/><br>
	<form:errors path="apellido" style="color:red"/>
	<br><br><br>
	
	Edad: <form:input path="edad"/><br>
	<form:errors path="edad" style="color:red"/>
	<br><br><br>	
	
	eMail: <form:input path="email"/><br>
	<form:errors path="email" style="color:red"/>
	<br><br><br>
	
	Asignatura: <br/>
	<form:select path="optativa" multiple="true">
	<form:option value="Dise�o" label="Dise�o"/>
	<form:option value="Gimnasia" label="Gimnasia"/>
	<form:option value="Comercio" label="Comercio"/>
	<form:option value="Arte" label="Arte"/>
	</form:select>
	
	<br><br><br>
	
	C�rdoba<form:radiobutton path="ciudadEstudios" value="C�rdoba"/>
	Buenos Aires<form:radiobutton path="ciudadEstudios" value="Buenos Aires"/>
	Salta<form:radiobutton path="ciudadEstudios" value="Salta"/>
	Canals<form:radiobutton path="ciudadEstudios" value="Canals"/>
	
	<br><br><br>
	
	Espa�ol<form:checkbox path="idiomaEstudio" value="Espa�ol"/>
	Chino<form:checkbox path="idiomaEstudio" value="Chino"/>
	Ingl�s<form:checkbox path="idiomaEstudio" value="Ingl�s"/>
	Portugu�s<form:checkbox path="idiomaEstudio" value="Portugu�s"/>
	
	<br><br><br>
	
	<input type="submit" value="Enviar">
	</form:form>

</body>
</html>