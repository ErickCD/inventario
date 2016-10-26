<%-- 
    Document   : validarPedido
    Created on : 26-oct-2016, 11:46:56
    Author     : Manuel Florez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="controlador" class="co.edu.ufps.controlador.Controller" scope="session"></jsp:useBean>

<%
    int idProducto = Integer.parseInt(request.getParameter("producto"));
    int cantidad = Integer.parseInt(request.getParameter("cantidad"));

    String s = controlador.validarPedido(idProducto, cantidad);
%>
<html>

    <tbody>
        <tr>
            <td><%=idProducto%></td>
            <td>nombre</td>
            <td><%=cantidad%></td>
            <td>precio</td>
            <td>iva</td>
            <td>desc</td>
            <td>sub</td>
        </tr>
    </tbody>

</html>