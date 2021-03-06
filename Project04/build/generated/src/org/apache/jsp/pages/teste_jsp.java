package org.apache.jsp.pages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import br.com.fatecpg.project04.Quiz;
import br.com.fatecpg.project04.Question;

public final class teste_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");

    String nome = (String) session.getAttribute("nome");
    if (nome == null) {
        response.sendRedirect("identificacao.jsp");
    }

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Projeto 04 -- Quiz</title>\n");
      out.write("    </head>\n");
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
      out.write("                    <li class=\"nav-item\">\n");
      out.write("                        <a class=\"nav-link\" href=\"identificacao.jsp\">Realizar Teste</a>\n");
      out.write("                    </li>\n");
      out.write("                    <div id=\"usuario\" style=\"position: absolute; right: 10px;\">\n");
      out.write("                        <li class=\"nav-item dropdown\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\"\n");
      out.write("                               data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                ");
      out.print(nome);
      out.write("\n");
      out.write("                            </a>\n");
      out.write("                            <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Minhas Informações</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">Meus Testes</a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"logout.jsp\">Sair</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("                    </div>\n");
      out.write("                </ul>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("        <h1>Quiz</h1>\n");
      out.write("        <div class=\"custom-control custom-radio\">\n");
      out.write("            <form action=\"home.jsp\">\n");
      out.write("                ");
 for (Question q : Quiz.getMathTest()) {
      out.write("\n");
      out.write("                <h3>");
      out.print( q.getPergunta());
      out.write("?</h3>\n");
      out.write("                ");
for (String alternativas : q.getAlternativas()) {
      out.write("\n");
      out.write("                <input type=\"radio\"\n");
      out.write("                       name=\"");
      out.print( q.getPergunta());
      out.write("\"\n");
      out.write("                       value =\"");
      out.print(alternativas);
      out.write("\"\n");
      out.write("                       /> ");
      out.print(alternativas);
      out.write(" <br>\n");
      out.write("                <hr/>\n");
      out.write("                ");
}
      out.write("\n");
      out.write("                ");
}
      out.write("\n");
      out.write("\n");
      out.write("                <br> <input class=\"btn btn-dark\" type=\"submit\" name=\"RealizaTeste\" value=\"Enviar\"/>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <footer>\n");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("            <p style=\"text-align: center\"> <a href=\"https://github.com/ManoelRodriguez\">Manoel Victor</a> || <a\n");
      out.write("                    href=\"https://github.com/matheussmorais\">Matheus Morais</a></p>\n");
      out.write("\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.3.1.slim.min.js\"\n");
      out.write("                    integrity=\"sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo\"\n");
      out.write("                    crossorigin=\"anonymous\">\n");
      out.write("            </script>\n");
      out.write("            <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js\"\n");
      out.write("                    integrity=\"sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49\"\n");
      out.write("                    crossorigin=\"anonymous\">\n");
      out.write("            </script>\n");
      out.write("            <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js\"\n");
      out.write("                    integrity=\"sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy\"\n");
      out.write("                    crossorigin=\"anonymous\">\n");
      out.write("            </script>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("    </body>\n");
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
