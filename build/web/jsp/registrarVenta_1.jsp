<%-- 
    Document   : registrarVenta
    Created on : 25-oct-2016, 18:47:46
    Author     : Manuel Florez
--%>

<%@page import="co.edu.ufps.dto.Producto"%>
<%@page import="co.edu.ufps.dto.Cliente"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="controlador" class="co.edu.ufps.controlador.Controller" scope="session">

</jsp:useBean>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
        <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--Import Google Icon Font-->
        <link href="http://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
        <link href="/inventario/materialize/css/materialize.min.css" rel="stylesheet"/>
        <title>Registrar Venta</title>
    </head>
    <body>
        <!-- navegación -->
        <nav class="nav-wrapper">
            <div class="container">
                <a href="/inventario/index.jsp" class="breadcrumb">Home</a>
                <a href="/inventario/jsp/inventarioProductos.jsp" class="breadcrumb">Inventario De Productos</a>
            </div>
        </nav>

        <!-- contenido central -->
        <div class="container">
            <h2>Registrar venta</h2>
            <div class="row">
                <div class="col m4 s12">
                    <div class="input-field">
                        <select id="producto">
                            <option value="" selected>Seleccionar Producto</option>
                            <%  List<Producto> l = controlador.listarProductos();
                                for (Producto p : l) {
                            %>
                            <option value="<%=p.getId()%>"> <%=p.getNombre()%></option>
                            <%  }%>

                        </select>
                        <label>Producto</label>
                    </div>
                </div>

                <div class="col m4 s12">
                    <div class="input-field">
                        <input id="cantidad" placeholder="Cantidad" type="number" class="validate">
                    </div>
                </div>
                <div class="col m4 s12">
                    <div class="input-field">
                        <input id="btn" value="Agregar" type="submit" class="btn">
                    </div>
                </div>
            </div>

            <!-- tabla -->
            <table>
                <thead>
                    <tr>
                        <th>id</th>
                        <th>Nombre</th>
                        <th>Cantidad</th>
                        <th>Precio Unitario</th>
                        <th>Iva</th>
                        <th>Descuento</th>
                        <th>Subtotal</th>
                    </tr>
                </thead>
                <tbody id="cont">

                </tbody>
            </table>
        </div>

        <!-- Script -->
        <script src="/inventario/materialize/js/jquery-2.1.1.min.js"></script>
        <script src="/inventario/materialize/js/materialize.min.js"></script>
        <script>
            $(document).ready(function () {
                $('select').material_select();
            });
        </script>
        <script>
            $(document).ready(function () {
                $("#btn").click(function () {
                    $.post("validarPedido.jsp",
                            {
                                producto: $("#producto").val(),
                                cantidad: $("#cantidad").val()
                            },
                            function (data, status) {
                                alert("Data: " + data + "\nStatus: " + status);
                                $("#cont").html(data);
                            });
                });
            });
        </script>
    </body>
</html>
