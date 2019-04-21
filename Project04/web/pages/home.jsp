<%-- 
    Document   : home.jsp
    Created on : 16/04/2019, 15:19:02
    Author     : Manoel Rodriguez
--%>

<%@page import="java.util.Collections"%>
<%@page import="br.com.fatecpg.project04.BD"%>
<%@page import="br.com.fatecpg.project04.Usuario"%>
<%@page import="br.com.fatecpg.project04.Quiz"%>
<%@page import="br.com.fatecpg.project04.Question"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    double grade = 0.0;
    int nota = 0;
    int somanota = 0;

    if (request.getParameter("RealizaTeste") != null) {
        for (Question q : Quiz.getMathTest()) {
            if (request.getParameter(q.getPergunta()) != null) {
                String userPergunta = request.getParameter(q.getPergunta());
                if (q.getResposta().equals(userPergunta)) {
                    nota++;
                    somanota += nota;
                    
                }
            }
        }
        
        Usuario mostranota = new Usuario();
        mostranota.setNota(nota);
        
        grade = (double) nota / (double) Quiz.getMathTest().size();
        
        
        
    }
    
    

    if (request.getParameter("RealizaTeste") != null) {
        String nomeu = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String peganota = request.getParameter("nota");
        String email = request.getParameter("email");
        Usuario novoUsuario = new Usuario();
        novoUsuario.setNome(nomeu);
        novoUsuario.setSobrenome(sobrenome);
        novoUsuario.setNota(nota);
        novoUsuario.setEmail(email);
        BD.getUsuariosList().add(novoUsuario);
        BD.getUsuariosLogadosList().add(novoUsuario);
        
        

    }

    String nome = (String) session.getAttribute("nome");

    
 

    
%>
<html lang="pt-br">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
              integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Home</title>
    </head>

    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="home.jsp">Teste Online</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#conteudoNavbarSuportado"
                    aria-controls="conteudoNavbarSuportado" aria-expanded="false" aria-label="Alterna navegação">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="conteudoNavbarSuportado">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="home.jsp">Home <span class="sr-only">(página atual)</span></a>
                    </li>
                    <% if (nome == null) {%>
                    <li class="nav-item">
                        <a class="nav-link" href="identificacao.jsp">Login</a>
                    </li>
                    <%}%>
                    <% if (nome != null) {%>
                    <div id="usuario" style="position: absolute; right: 70px;">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <%=nome%>
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                
                                <a class="dropdown-item" href="logout.jsp">Sair</a>
                            </div>
                            
                    </div>
                        </li>
                    </div>

                </ul>
            </div>  
            <a class="navbar-brand" href="teste.jsp" style="position: absolute; right: 150px;" >Realizar Teste</a>
            <%}%>
        </nav>
        <div class="jumbotron" style="height: 350px; padding: 120px;">
            <div class="container">
                <h1>Informações</h1>
                <p>Este projeto consiste em uma aplicação Java Web para testes de multiplica escolha, onde esses dados serão
                    armazenados no ArrayList e apresentados em tabelas.
                </p>
            </div>
        </div>

        <div class="container">
            <div class="row">
                <div class="col-md-6" style="text-align: justify;">
                    <%if (request.getParameter("RealizaTeste") == null) {%>
                    <h3></h3>
                    <%} else {%>
                    <h2>Você acertou
                        <u> <%=(grade * 100)%></u>
                        % das questões.
                        Nota: <%= nota %>
                        
                    </h2>
                    <h3><a href="teste.jsp" style="color: #000000">Realizar novamente o Quiz.</a></h3>
                    <%}%>

                    <br>
                </div>
            </div>
        </div

    <% if (nome == null) {%>
        <div class="container">
            <div class="row">

                <div class="col-md-6" style="text-align: justify;">
                    <center>
                        <h3>Ultimos Testes Realizados</h3>
                        <table class="table"  style="margin-bottom: 50px;">
                            <thead class="thead-dark">
                                <tr>
                                    <th scope="col">N°</th>
                                    <th scope="col">Nome</th>
                                    <th scope="col">Sobrenome</th>
                                    <th scope="col">Nota</th>
                                </tr>
                            </thead>
                            <tbody> 
                               <% int id = 0;  %>
                                <% Collections.reverse(BD.getUsuariosList());%>
                                <%for (Usuario u : BD.getUsuariosList()) {%>
                                
                                <tr>
                                    <% if ( id > 8 ) break; %>
                                    <%  id = BD.getUsuariosList().indexOf(u);%>
                                    <th scope="row"> <%=id+1%> </th>
                                    <td><%= u.getNome()%></td>
                                    <td><%= u.getSobrenome()%></td>
                                    <td><%= u.getNota() %></td>
                                    
                                </tr>
                                
                                <%}%>
                                

                            </tbody>
                        </table>
                                <% Collections.reverse(BD.getUsuariosList());%>
                    </center>
                </div>  

                
                <div class="col-md-6" style="text-align: justify;">
                    <center>
                        <h3>Melhores Notas</h3>
                        <table class="table" style="margin-bottom: 50px;">
                            <thead class="thead-dark">
                                <tr>
                                    <th scope="col">N°</th>
                                    <th scope="col">Nome</th>
                                    <th scope="col">Sobrenome</th>
                                    <th scope="col">Nota</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%for (Usuario n : BD.ordenaUsuariosList()) {%>
                                <tr>
                                    <%int id2 = BD.ordenaUsuariosList().indexOf(n) ;%>
                                    
                                    <th scope="row" > <%=id2 + 1%> </th>
                                    <td><%= n.getNome()%></td>
                                    <td><%= n.getSobrenome()%></td>
                                    <td><%= n.getNota() %></td>
                                </tr>
                                <%}%>
                            </tbody>
                            
                        </table>

                    </center>
                </div>
                            
                <%} else if (nome != null) {%>
                
                < <div class="container">
            <div class="row">

                <div class="col-md-6" style="text-align: justify;">
                    <center>
                        <h3>Ultimos Testes Realizados</h3>
                        <table class="table"  style="margin-bottom: 50px;">
                            <thead class="thead-dark">
                                <tr>
                                    <th scope="col">N°</th>
                                    <th scope="col">Nome</th>
                                    <th scope="col">Sobrenome</th>
                                    <th scope="col">Nota</th>
                                </tr>
                            </thead>
                            <tbody> 
                               <% int id = 0;  %>
                                <% Collections.reverse(BD.getUsuariosList());%>
                                <%for (Usuario u : BD.getUsuariosList()) {%>
                                
                                <tr>
                                    <% if ( id > 8 ) break; %>
                                    <%  id = BD.getUsuariosList().indexOf(u);%>
                                    <th scope="row"> <%=id+1%> </th>
                                    <td><%= u.getNome()%></td>
                                    <td><%= u.getSobrenome()%></td>
                                    <td><%= u.getNota() %></td>
                                </tr>
                                
                                <%}%>
                                

                            </tbody>
                        </table>
                                <% Collections.reverse(BD.getUsuariosList());%>
                    </center>
                </div>
                </div>
                    
                    
                    

                <div class="col-md-6" style="text-align: justify;">
                    <center>
                        <h3>Ultimos Testes Realizados do Usuário </h3>
                        <table class="table"  style="margin-bottom: 50px;">
                            <thead class="thead-dark">
                                <tr>
                                    <th scope="col">N°</th>
                                    <th scope="col">Nome</th>
                                    <th scope="col">Sobrenome</th>
                                    <th scope="col">Nota</th>
                                </tr>
                            </thead>
                            <tbody> 
                               <% int id3 = 0;  %>
                                
                                <%for (Usuario l : BD.getUsuariosLogadosList()) {%>
                                
                                <tr>
                                    <% if ( id3 > 8 ) break; %>
                                    <%  id3 = BD.getUsuariosLogadosList().indexOf(l);%>
                                    <th scope="row"> <%=id3+1%> </th>
                                    <td><%= l.getNome()%></td>
                                    <td><%= l.getSobrenome()%></td>
                                    <td><%= l.getNota() %></td>
                                </tr>
                                
                                <%}%>
                                

                            </tbody>
                        </table>
                                
                    </center>
                </div>
                </div>
                    
                    
                    <div class="col-md-6" style="text-align: justify;">
                    <center>
                        <h3>Melhores Notas</h3>
                        <table class="table" style="margin-bottom: 50px;">
                            <thead class="thead-dark">
                                <tr>
                                    <th scope="col">N°</th>
                                    <th scope="col">Nome</th>
                                    <th scope="col">Sobrenome</th>
                                    <th scope="col">Nota</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%for (Usuario n : BD.ordenaUsuariosList()) {%>
                                <tr>
                                    <%int id2 = BD.ordenaUsuariosList().indexOf(n); %>
                                    <th scope="row" > <%=id2 + 1%> </th>
                                    <td><%= n.getNome()%></td>
                                    <td><%= n.getSobrenome()%></td>
                                    <td><%= n.getNota() %></td>
                                </tr
                                <%}%>
                            </tbody>
                        </table>

                    </center>
                </div>
                </div>
                
                <div class="col-md-6" style="text-align: justify;">
                    <center>
                        <h3>Sua média</h3>
                        <table class="table" style="margin-bottom: 50px;">
                            <thead class="thead-dark">
                                <tr>
                                    <th scope="col">Nome</th>
                                    <th scope="col">Sobrenome</th>
                                    <th scope="col">Nota</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr>


                                    <td> </td>
                                    <td> </td>
                                    <td> </td>
                                </tr>

                            </tbody>
                        </table>

                    </center>
                </div>
                <%}%>
        </div> 
          
               
        </div>
               
            <footer>

                <hr>
                <p style="text-align: center"> <a href="https://github.com/ManoelRodriguez">Manoel Victor</a> || <a
                        href="https://github.com/matheussmorais">Matheus Morais</a></p>

                <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
                        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
                        crossorigin="anonymous">
                </script>
                <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
                        integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
                        crossorigin="anonymous">
                </script>
                <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
                        integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy"
                        crossorigin="anonymous">
                </script>
            </footer>
    </body>

</html>
