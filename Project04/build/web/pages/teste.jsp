<%-- 
    Document   : teste
    Created on : 16/04/2019, 22:04:47
    Author     : Casa
--%>

<%@page import="br.com.fatecpg.project04.Quiz"%>
<%@page import="br.com.fatecpg.project04.Question"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    String nome = (String) session.getAttribute("nome");
    
    if (nome == null) {
        response.sendRedirect("identificacao.jsp");
    }
%>

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
              integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <style>
            #featured-content {
                background-color: #add8e6;
                padding: 20px 0px;
            }

            .container {
                max-width: 960px;
                margin:0 auto;
            }

            .col-sm-9{
                width:100%;   
                float:left;
                background: #ffffff;
            }

            #border-radius {
                border: 2px solid white;
                border-radius: 25px;

            }

            #radio {
                display: inline;
                margin-left: 1em;

            }

        </style>
        <title>Projeto 04 -- Quiz</title>
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-dark bg-dark">
            <a class="navbar-brand" href="#">Teste Online</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#conteudoNavbarSuportado"
                    aria-controls="conteudoNavbarSuportado" aria-expanded="false" aria-label="Alterna navegação">
                <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="conteudoNavbarSuportado">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Home <span class="sr-only">(página atual)</span></a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Realizar Teste</a>
                    </li>
                    <div id="usuario" style="position: absolute; right: 70px;">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                <%=nome%>
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="#">Sair</a>
                            </div>
                        </li>
                    </div>
                </ul>
            </div>
        </nav>
        <h1>Quiz</h1>
        <div id="featured-content">

            <div class="container">
                <div class="row">
                    <div class="col-sm-9" id="border-radius"> 

                        <div class="custom-control custom-radio" id="radio">

                            <form action="home.jsp">

                                <hr/>

                                <% for (Question q : Quiz.getMathTest()) {%>

                                <h3 style="background-color:#e5e5e5 "><%= q.getPergunta()%> ?</h3>
                                <%for (String alternativas : q.getAlternativas()) {%>


                                <input
                                    type="radio"
                                    id="radio"
                                    name="<%= q.getPergunta()%>"
                                    value ="<%=alternativas%>" /> <%=alternativas%> <br>
                                <%}%>
                                <%}%>

                                <hr/>
                                <input type="text" name="nome" placeholder="Nome" required class="form-control"><br>
                                <input type="text" name="sobrenome" placeholder="Sobrenome" required class="form-control"
                                       <br>
                                <br> <input class="btn btn-primary" type="submit" name="RealizaTeste" value="Enviar"/>
                                    <%
                                        String confirma = request.getParameter("confirma");
            
                                        
                                      
            
                                    %>
                                <br>
                                <br>
                            </form>

                        </div>
                    </div>
                </div>
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
