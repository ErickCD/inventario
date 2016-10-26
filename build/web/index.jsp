<%-- 
    Document   : index
    Created on : 25-oct-2016, 16:24:34
    Author     : Manuel Florez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
        <title>Home</title>

        <!--Import Google Icon Font-->
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="materialize/css/materialize.min.css" type="text/css" rel="stylesheet"/>
        <link href="/web/css/style.css" type="text/css" rel="stylesheet" media="screen,projection"/>

    </head>
    <body>
        <!-- navegación -->
        <nav class="nav-wrapper">
            <div class="container">
                <a href="/inventario/index.jsp" class="breadcrumb">Home</a>
            </div>
        </nav>

        <!-- contenedor central -->
        <div class="container">
            <h1 class="center">Previo 2</h1><hr>
            <div class="row">
                <div class="col m4 s12 center">
                    <a href="jsp/registrarVenta.jsp" class="btn">Registrar Venta</a>
                </div>
                <div class="col m4 s12 center">
                    <a href="jsp/inventarioProductos.jsp" class="btn">Inventario Productos</a>
                </div>
                <div class="col m4 s12 center">
                    <a href="jsp/ventasRealizadas.jsp" class="btn">Total de ventas</a>
                </div>
            </div><hr>
        </div>

        <div class="parallax-container valign-wrapper">
            <div class="parallax"><img src="../web/img/background4.jpg" alt="Unsplashed background img 3"></div>
        </div>

        <footer class="page-footer teal">
            <div class="container">
                <div class="row">
                    <div class="col m4 s12 center">
                        <h5 class="white-text">Universidad</h5>
                        <p class="grey-text text-lighten-4">UFPS - Universidad Francisco de Paula Santander</p>
                        <img src="../web/img/ufps.png" width="150px" height="150px" alt="UFPS" />
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
                        <img src="../web/img/sistemasufps.png" width="150px" height="150px" alt="UFPS" />
                    </div>

                </div>
            </div>
            <div class="footer-copyright">
                <div class="container">
                    Realizado por <a class="brown-text text-lighten-3">Manuel Florez y Erick Clair</a>
                </div>
            </div>
        </footer>

        <!-- Script -->
        <script src="/inventario/materialize/js/jquery-2.1.1.min.js"></script>
        <script src="/inventario//materialize/js/materialize.min.js"></script>
        <script src="/inventario//materialize/js/init.js"></script>
    </body>
</html>
