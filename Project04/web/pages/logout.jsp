<%-- 
    Document   : logout
    Created on : 17/04/2019, 23:41:43
    Author     : Manoel Rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    session.invalidate();
    response.sendRedirect("identificacao.jsp");
%>
