<%-- 
    Document   : logout
    Created on : 17/04/2019, 20:53:15
    Author     : Manoel Rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    session.invalidate();
    response.sendRedirect("identificacao.jsp");
%>
