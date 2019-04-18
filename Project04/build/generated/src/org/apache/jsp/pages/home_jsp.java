package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

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
      out.write("<!DOCTYPE html>\n");
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
      out.write("            <div class=\"collapse navbar-collapse\" id=\"conteudoNavbarSuportado\">\n");
      out.write("                <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                    <li class=\"nav-item active\">\n");
      out.write("                        <a class=\"nav-link\" href=\"home.jsp\">Home <span class=\"sr-only\">(página atual)</span></a>\n");
      out.write("                    </li>\n");
      out.write("                    <li class=\"nav-item\" style=\"position: absolute; right: 20px;\">\n");
      out.write("                        <a class=\"nav-link\" href=\"identificacao.jsp\">Realizar Teste</a>\n");
      out.write("                    </li>\n");
      out.write("            </div>\n");
      out.write("        </ul>\n");
      out.write("    </div>\n");
      out.write("</nav>\n");
      out.write("<div class=\"jumbotron\" style=\"height: 350px; padding: 120px;\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>Informações</h1>\n");
      out.write("        <p>Este projeto consiste em uma aplicação Java Web para testes de multiplica escolha, onde esses dados serão\n");
      out.write("            armazenados no ArrayList e apresentados em tabelas.\n");
      out.write("        </p>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("<div class=\"container\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("\n");
      out.write("        <div class=\"col-md-6\" style=\"text-align: justify;\">\n");
      out.write("            <center>\n");
      out.write("                <h3>Ultimos Testes Realizados</h3>\n");
      out.write("                <table class=\"table\"  style=\"margin-bottom: 50px;\">\n");
      out.write("                    <thead class=\"thead-dark\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"col\">N°</th>\n");
      out.write("                            <th scope=\"col\">Nome</th>\n");
      out.write("                            <th scope=\"col\">Sobrenome</th>\n");
      out.write("                            <th scope=\"col\">Nota</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">1</th>\n");
      out.write("                            <td>Mark</td>\n");
      out.write("                            <td>Otto</td>\n");
      out.write("                            <td>3</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">2</th>\n");
      out.write("                            <td>Jacob</td>\n");
      out.write("                            <td>Thornton</td>\n");
      out.write("                            <td>8</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">3</th>\n");
      out.write("                            <td>Larry</td>\n");
      out.write("                            <td>the Bird</td>\n");
      out.write("                            <td>6,8</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"col-md-6\" style=\"text-align: justify;\">\n");
      out.write("            <center>\n");
      out.write("                <h3>Melhores Notas</h3>\n");
      out.write("                <table class=\"table\" style=\"margin-bottom: 50px;\">\n");
      out.write("                    <thead class=\"thead-dark\">\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"col\">N°</th>\n");
      out.write("                            <th scope=\"col\">Nome</th>\n");
      out.write("                            <th scope=\"col\">Sobrenome</th>\n");
      out.write("                            <th scope=\"col\">Nota</th>\n");
      out.write("                        </tr>\n");
      out.write("                    </thead>\n");
      out.write("                    <tbody>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">1</th>\n");
      out.write("                            <td>Mark</td>\n");
      out.write("                            <td>Otto</td>\n");
      out.write("                            <td>10</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">2</th>\n");
      out.write("                            <td>Jacob</td>\n");
      out.write("                            <td>Thornton</td>\n");
      out.write("                            <td>9,5</td>\n");
      out.write("                        </tr>\n");
      out.write("                        <tr>\n");
      out.write("                            <th scope=\"row\">3</th>\n");
      out.write("                            <td>Larry</td>\n");
      out.write("                            <td>the Bird</td>\n");
      out.write("                            <td>9,4</td>\n");
      out.write("                        </tr>\n");
      out.write("                    </tbody>\n");
      out.write("                </table>\n");
      out.write("\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <footer>\n");
      out.write("\n");
      out.write("        <hr>\n");
      out.write("        <p style=\"text-align: center\"> <a href=\"https://github.com/ManoelRodriguez\">Manoel Victor</a> || <a\n");
      out.write("                href=\"https://github.com/matheussmorais\">Matheus Morais</a></p>\n");
      out.write("\n");
      out.write("        <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\n");
      out.write("                integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\n");
      out.write("                crossorigin=\"anonymous\">\n");
      out.write("        </script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"\n");
      out.write("                integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\"\n");
      out.write("                crossorigin=\"anonymous\">\n");
      out.write("        </script>\n");
      out.write("        <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"\n");
      out.write("                integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\"\n");
      out.write("                crossorigin=\"anonymous\">\n");
      out.write("        </script>\n");
      out.write("    </footer>\n");
      out.write("</body>\n");
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
