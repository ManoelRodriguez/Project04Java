<%-- 
    Document   : identificacao
    Created on : 16/04/2019, 17:22:09
    Author     : Manoel Rodriguez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    String teste = (String) session.getAttribute("nome");
    
    if (teste  != null ) {
        response.sendRedirect("teste.jsp");
    }
%>

<html lang="pt-br">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
              integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Identificação</title>
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
                    <li class="nav-item">
                        <a class="nav-link" href="identificacao.jsp" style="position: absolute; right: 10px;">Realizar Teste</a>
                    </li>
                </ul>
            </div>
        </nav>
    <center>
        <div id="identificacao" style="width: 300px; height: 200px; margin-top: 100px;">
            <h4 style="margin-bottom: 40px">Identificação de Usuário</h4>
                <form action="identificacao.jsp">
                <input type="text" name="nome" placeholder="Nome" required class="form-control" style="margin: 15px">
                <input type="text" name="sobrenome" placeholder="Sobrenome" required class="form-control"
                       style="margin: 15px">
                <input type="email" name="email" placeholder="E-mail" required class="form-control"
                       style="margin: 15px">
                <button type="submit" name="iniciar" class="btn btn-primary">Iniciar</button>
                
            </form>
        </div>
        <%
            String nome = request.getParameter("nome");
            String sobrenome = request.getParameter("sobrenome");
            
            if (nome != null && sobrenome != null && !nome.isEmpty() && !sobrenome.isEmpty()) {
                session.setAttribute("nome", nome);
                response.sendRedirect("home.jsp");
            }
        %>
    </center>
    <footer style="position: absolute; bottom: 0px; width: 100%">
        <center>
            <hr>
            <p style="text-align: center"> <a href="https://github.com/ManoelRodriguez">Manoel Victor</a> || <a
                    href="https://github.com/matheussmorais">Matheus Morais</a></p>

        </center>

        <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
                integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous">
        </script>
        <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
                integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous">
        </script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js"
                integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous">
        </script>
    </footer>
</body>

</html>
