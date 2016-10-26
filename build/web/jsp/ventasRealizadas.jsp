<%-- 
    Document   : ventasRealizadas
    Created on : 25/10/2016, 11:33:36 PM
    Author     : Clair
--%>

<%@page import="co.edu.ufps.dto.totalventas"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="controlador" class="co.edu.ufps.controlador.Controlador" scope="session">

</jsp:useBean>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Import Google Icon Font-->
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="../materialize/css/materialize.min.css" rel="stylesheet"/>
        <title>Ventas realizadas</title>
    </head>
    <body>
        <nav class="nav-wrapper">
            <div class="container">
                <a href="../index.jsp" class="breadcrumb">Home</a>
                <a href="../jsp/ventasRealizadas.jsp" class="breadcrumb">Ventas realizadas</a>
            </div>
        </nav>

        <!-- contenido central -->
        <div class="container">
            <h2>Total de ventas realizadas</h2>
            <table class="striped">
                <thead>
                    <tr>
                        <th>id producto</th>
                        <th>Valor total de ventas realizadas</th>
                        <th>Nombre producto</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        List<totalventas> l = controlador.totalVentas();
                        for (totalventas p : l) {%>
                    <tr>
                        <td><%=p.getIdproducto()%></td>
                        <td><%=p.getPrecio()%></td>
                        <td><%=p.getNombreProducto()%></td>
                    </tr>
                    <% }%>
                </tbody>
            </table>
        </div>
        <!--  fin del contenido principal-->

        <footer class="page-footer teal">
            <div class="container">
                <div class="row">
                    <div class="col m4 s12 center">
                        <h5 class="white-text">Universidad</h5>
                        <p class="grey-text text-lighten-4">UFPS - Universidad Francisco de Paula Santander</p>
                        <img src="../img/ufps.png" width="150px" height="150px" alt="UFPS" />
                    </div>
                    <div class="col m4 s12 center">
                        <h5 class="white-text">Desarolladores</h5>
                        <ul>
                            <li><a href="mailto:acheron_1405@hotmail.com" class="white-text">acheron_1405@hotmail.com</a></li>
                            <li><a href="mailto:manuelflorezw@outlook.com" class="white-text">manuelflorezw@outlook.com</a></li>
                        </ul>
                    </div>

                    <div class="col m4 s12 center">
                        <h5 class="white-text">Carrera</h5>
                        <ul>
                            <p class="grey-text text-lighten-4">Facultad de ingeniería en Sistemas Computacionales</p>
                        </ul>
                        <img src="../img/sistemasufps.png" width="150px" height="150px" alt="UFPS" />
                    </div>

                </div>
            </div>
            <div class="footer-copyright">
                <div class="container">
                    Realizado por <a class="brown-text text-lighten-3">Manuel Florez y Erick Clair</a>
                </div>
            </div>
        </footer>

        <script src="/inventario/materialize/js/jquery-2.1.1.min.js"></script>
        <script src="/inventario/materialize/js/materialize.min.js"></script>
    </body>
</html>
