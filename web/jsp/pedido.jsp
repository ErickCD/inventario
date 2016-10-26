<%-- 
    Document   : pedido
    Created on : 25-oct-2016, 21:22:29
    Author     : Manuel Florez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="controlador" class="co.edu.ufps.controlador.Controller" scope="session"></jsp:useBean>

    
    
<%
    int idProducto = Integer.parseInt( request.getParameter("producto"));
    int cantidad = Integer.parseInt( request.getParameter("cantidad") );
    
    controlador.validarPedido(idProducto,cantidad);
    
%>
<h1>Exito</h1>

