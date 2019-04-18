<%-- 
    Document   : home.jsp
    Created on : 16/04/2019, 15:19:02
    Author     : Manoel Rodriguez
--%>

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
        grade = (double) nota / (double) Quiz.getMathTest().size();
    }
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
                    <li class="nav-item" style="position: absolute; right: 10px;">
                        <a class="nav-link" href="identificacao.jsp">Realizar Teste</a>
                    </li>
                </ul>
            </div>
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
                        Nota: <%= nota%>
                    </h2>
                    <h3><a href="teste.jsp" style="color: #000000">Realizar novamente o Quiz.</a></h3>
                    <%}%>

                    <br>
                </div>
            </div>
        </div


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
                                <tr>
                                    <th scope="row">1</th>
                                    <td>Mark</td>
                                    <td>Otto</td>
                                    <td>3</td>
                                </tr>
                                <tr>
                                    <th scope="row">2</th>
                                    <td>Jacob</td>
                                    <td>Thornton</td>
                                    <td>8</td>
                                </tr>
                                <tr>
                                    <th scope="row">3</th>
                                    <td>Larry</td>
                                    <td>the Bird</td>
                                    <td>6,8</td>
                                </tr>
                            </tbody>
                        </table>
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
                                <tr>
                                    <th scope="row">1</th>
                                    <td>Mark</td>
                                    <td>Otto</td>
                                    <td>10</td>
                                </tr>
                                <tr>
                                    <th scope="row">2</th>
                                    <td>Jacob</td>
                                    <td>Thornton</td>
                                    <td>9,5</td>
                                </tr>
                                <tr>
                                    <th scope="row">3</th>
                                    <td>Larry</td>
                                    <td>the Bird</td>
                                    <td>9,4</td>
                                </tr>
                            </tbody>
                        </table>

                    </center>
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
