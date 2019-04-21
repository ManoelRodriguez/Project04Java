<%-- 
    Document   : logout
    Created on : 17/04/2019, 23:41:43
    Author     : Manoel Rodriguez
--%>

<%@page import="br.com.fatecpg.project04.BD"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%  
    BD.removeUsuarioList();
    session.invalidate();
    response.sendRedirect("identificacao.jsp");
%>
