<%-- 
    Document   : usuarios
    Created on : 16/04/2019, 17:35:15
    Author     : Manoel Rodriguez
--%>

<%@page import="br.com.fatecpg.project04.BD"%>
<%@page import="br.com.fatecpg.project04.Usuario"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<%
    if (request.getParameter("iniciar") != null) {
        String nome = request.getParameter("Nome");
        String sobrenome = request.getParameter("Sobrenome");
        String email = request.getParameter("email");
        Usuario novoUsuario = new Usuario();
        novoUsuario.setNome(nome);
        novoUsuario.setSobrenome(sobrenome);
        novoUsuario.setEmail(email);
        BD.getUsuariosList().add(novoUsuario);
        response.sendRedirect(request.getRequestURI());
    }
%>
<html lang="pt-br">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css"
              integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
        <title>Usuários Cadastrados</title>
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
                    <div id="usuario" style="position: absolute; right: 10px;">
                        <li class="nav-item dropdown">
                            <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button"
                               data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                Nome do Usuário
                            </a>
                            <div class="dropdown-menu" aria-labelledby="navbarDropdown">
                                <a class="dropdown-item" href="#">Minhas Informações</a>
                                <a class="dropdown-item" href="#">Meus Testes</a>
                            </div>
                        </li>
                    </div>
                </ul>
            </div>
        </nav>
    <center>
        <h4 style="margin-top: 100px">Usuários Identificados</h4>
        <table class="table" style="width: 500px; margin-top: 50px">
            <thead class="thead-dark">
                <tr>
                    <th scope="col">ID</th>
                    <th scope="col">Nome</th>
                    <th scope="col">Sobrenome</th>
                    <th scope="col">E-mail</th>
                    <th scope="col">Média</th>
                </tr>
            </thead>
            <%for (Usuario u : BD.getUsuariosList()) {%>
                <tr>
                    <%int id = BD.getUsuariosList().indexOf(u);%>
                    <th scope="row">1</th>
                    <td><%=u.getNome()%></td>
                    <td><%=u.getSobrenome()%></td>
                    <td><%=u.getEmail()%></td>
                    <td><%=u.getMedia()%></td>
                </tr>
            <%}%>
        </table>
        <h4><a href="teste.jsp">Ralizar prova</a></h4>
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

