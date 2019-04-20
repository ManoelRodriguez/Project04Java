package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.fatecpg.project04.BD;
import br.com.fatecpg.project04.Usuario;
import br.com.fatecpg.project04.Quiz;
import br.com.fatecpg.project04.Question;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

    double grade = 0.0;
    int nota = 0;
    int somanota = 0;
    int vezes = 0;
    int tvezes = 0;
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
        
        
        tvezes = vezes + tvezes; 
        grade = (double) nota / (double) Quiz.getMathTest().size();
        
        
    }
    
if (request.getParameter("RealizaTeste") != null) {   
        String nomeu = request.getParameter("nome");
        String sobrenome = request.getParameter("sobrenome");
        String email = request.getParameter("email");
        Usuario novoUsuario = new Usuario();
        novoUsuario.setNome(nomeu);
        novoUsuario.setSobrenome(sobrenome);
        novoUsuario.setEmail(email);
        BD.getUsuariosList().add(novoUsuario);
        
        
       
    }
    
    
    String nome = (String) session.getAttribute("nome");
    
  

      out.write("\n");
      out.write("<html lang=\"pt-br\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"ie=edge\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css\"\n");
      out.write("              integrity=\"sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO\" crossorigin=\"anonymous\">\n");
      out.write("        <title>Home</title>\n");
      out.write("    </head>\n");
      out.write("\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark\">\n");
      out.write("            <a class=\"navbar-brand\" href=\"home.jsp\">Teste Online</a>\n");
      out.write("            <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#conteudoNavbarSuportado\"\n");
      out.write("                    aria-controls=\"conteudoNavbarSuportado\" aria-expanded=\"false\" aria-label=\"Alterna navegação\">\n");
      out.write("                <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("            </button>\n");
      out.write("\n");
      out.write("             <div class=\"collapse navbar-collapse\" id=\"conteudoNavbarSuportado\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"home.jsp\">Home <span class=\"sr-only\">(página atual)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"identificacao.jsp\">Realizar Teste</a>\n");
      out.write("                    </li>\n");
      out.write("                    <div id=\"usuario\" style=\"position: absolute; right: 70px;\">\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\"\n");
      out.write("                               data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                ");
      out.print(nome);
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"informacoes.jsp\">Minhas Informações</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Meus Testes</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"logout.jsp\">Sair</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </div>\n");
      out.write("                </ul>\n");
      out.write("            </div>  \n");
      out.write("        </nav>\n");
      out.write("        <div class=\"jumbotron\" style=\"height: 350px; padding: 120px;\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <h1>Informações</h1>\n");
      out.write("                <p>Este projeto consiste em uma aplicação Java Web para testes de multiplica escolha, onde esses dados serão\n");
      out.write("                    armazenados no ArrayList e apresentados em tabelas.\n");
      out.write("                </p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-6\" style=\"text-align: justify;\">\n");
      out.write("                    ");
if (request.getParameter("RealizaTeste") == null) {
      out.write("\n");
      out.write("                    <h3></h3>\n");
      out.write("                    ");
} else {
      out.write("\n");
      out.write("                    <h2>Você acertou\n");
      out.write("                        <u> ");
      out.print((grade * 100));
      out.write("</u>\n");
      out.write("                        % das questões.\n");
      out.write("                        Nota: ");
      out.print( nota);
      out.write("\n");
      out.write("                    </h2>\n");
      out.write("                    <h3><a href=\"teste.jsp\" style=\"color: #000000\">Realizar novamente o Quiz.</a></h3>\n");
      out.write("                    ");
}
      out.write("\n");
      out.write("\n");
      out.write("                    <br>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6\" style=\"text-align: justify;\">\n");
      out.write("                    <center>\n");
      out.write("                        <h3>Ultimos Testes Realizados</h3>\n");
      out.write("                        <table class=\"table\"  style=\"margin-bottom: 50px;\">\n");
      out.write("                            <thead class=\"thead-dark\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"col\">N°</th>\n");
      out.write("                                    <th scope=\"col\">Nome</th>\n");
      out.write("                                    <th scope=\"col\">Sobrenome</th>\n");
      out.write("                                    <th scope=\"col\">Nota</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                \n");
      out.write("                                ");
for (Usuario u : BD.getUsuariosList()){
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    ");
 int id = BD.getUsuariosList().indexOf(u);
      out.write("\n");
      out.write("                                    <th scope=\"row\"> ");
      out.print(id+1);
      out.write(" </th>\n");
      out.write("                                    <td>");
      out.print( u.getNome() );
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( u.getSobrenome() );
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( nota );
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <div class=\"col-md-6\" style=\"text-align: justify;\">\n");
      out.write("                    <center>\n");
      out.write("                        <h3>Melhores Notas</h3>\n");
      out.write("                        <table class=\"table\" style=\"margin-bottom: 50px;\">\n");
      out.write("                            <thead class=\"thead-dark\">\n");
      out.write("                                <tr>\n");
      out.write("                                    <th scope=\"col\">N°</th>\n");
      out.write("                                    <th scope=\"col\">Nome</th>\n");
      out.write("                                    <th scope=\"col\">Sobrenome</th>\n");
      out.write("                                    <th scope=\"col\">Nota</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");
for (Usuario n : BD.getUsuariosList()){
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    ");
int id2 = BD.getUsuariosList().indexOf(n);
      out.write("\n");
      out.write("                                    <th scope=\"row\"> ");
      out.print(id2+1);
      out.write(" </th>\n");
      out.write("                                    <td>");
      out.print( n.getNome() );
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( n.getSobrenome() );
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print( nota);
      out.write("</td>\n");
      out.write("                                </tr\n");
      out.write("                                ");
}
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                                \n");
      out.write("                    </center>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <footer>\n");
      out.write("\n");
      out.write("                <hr>\n");
      out.write("                <p style=\"text-align: center\"> <a href=\"https://github.com/ManoelRodriguez\">Manoel Victor</a> || <a\n");
      out.write("                        href=\"https://github.com/matheussmorais\">Matheus Morais</a></p>\n");
      out.write("\n");
      out.write("                <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\n");
      out.write("                        integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\n");
      out.write("                        crossorigin=\"anonymous\">\n");
      out.write("                </script>\n");
      out.write("                <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"\n");
      out.write("                        integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\"\n");
      out.write("                        crossorigin=\"anonymous\">\n");
      out.write("                </script>\n");
      out.write("                <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"\n");
      out.write("                        integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\"\n");
      out.write("                        crossorigin=\"anonymous\">\n");
      out.write("                </script>\n");
      out.write("            </footer>\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
