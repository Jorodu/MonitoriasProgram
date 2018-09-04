<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri= "http://java.sun.com/jsp/jstl/core" %> <!-- carpetas public-->
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title> Ejemplo de vista Spring </title>
        <link rel="stylesheet" href="<c:url value="/public/css/estilos.css"/>"/> <!--importar carpeta css-->
        <script scr="<c:url value="/public/js/funciones.js" />"> </script>
    </head>
    <body>
        <h1 class="clase1"> Hola desde Home con nanño</h1>
        <hr  />
        <a href="javascript:void(0);" onclick="saludo();"> haz click </a>
    </body>
</html>
