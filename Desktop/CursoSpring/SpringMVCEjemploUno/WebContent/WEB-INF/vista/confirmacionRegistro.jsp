<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Confirmación de registro</title>
</head>
<body>

El alumno ${alumno.nombre} ${alumno.apellido} se ha registrado con éxito <br>
Su edad es: ${alumno.edad}<br>
eMail registrado: ${alumno.email}<br>
La asignatura elegida: ${alumno.optativa}. <br>
La ciudad donde iniciara los estudios es: ${alumno.ciudadEstudios}<br>
El/Los idioma/s que quiere estudiar es/son: ${alumno.idiomaEstudio}


</body>
</html>