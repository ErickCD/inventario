package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"es\">\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"/>\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, maximum-scale=1.0, user-scalable=no\"/>\n");
      out.write("        <title>Home</title>\n");
      out.write("\n");
      out.write("        <!--Import Google Icon Font-->\n");
      out.write("        <link href=\"http://fonts.googleapis.com/icon?family=Material+Icons\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"materialize/css/materialize.min.css\" type=\"text/css\" rel=\"stylesheet\"/>\n");
      out.write("        <link href=\"/web/css/style.css\" type=\"text/css\" rel=\"stylesheet\" media=\"screen,projection\"/>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <!-- navegación -->\n");
      out.write("        <nav class=\"nav-wrapper\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <a href=\"/inventario/index.jsp\" class=\"breadcrumb\">Home</a>\n");
      out.write("            </div>\n");
      out.write("        </nav>\n");
      out.write("\n");
      out.write("        <!-- contenedor central -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <h1 class=\"center\">Previo 2</h1><hr>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col m4 s12 center\">\n");
      out.write("                    <a href=\"jsp/registrarVenta.jsp\" class=\"btn\">Registrar Venta</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col m4 s12 center\">\n");
      out.write("                    <a href=\"jsp/inventarioProductos.jsp\" class=\"btn\">Inventario Productos</a>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col m4 s12 center\">\n");
      out.write("                    <a href=\"jsp/ventasRealizadas.jsp\" class=\"btn\">Total de ventas</a>\n");
      out.write("                </div>\n");
      out.write("            </div><hr>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"parallax-container valign-wrapper\">\n");
      out.write("            <div class=\"parallax\"><img src=\"../web/img/background4.jpg\" alt=\"Unsplashed background img 3\"></div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <footer class=\"page-footer teal\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col m4 s12 center\">\n");
      out.write("                        <h5 class=\"white-text\">Universidad</h5>\n");
      out.write("                        <p class=\"grey-text text-lighten-4\">UFPS - Universidad Francisco de Paula Santander</p>\n");
      out.write("                        <img src=\"../web/img/ufps.png\" width=\"150px\" height=\"150px\" alt=\"UFPS\" />\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"col m4 s12 center\">\n");
      out.write("                        <h5 class=\"white-text\">Desarolladores</h5>\n");
      out.write("                        <ul>\n");
      out.write("                            <li><a href=\"mailto:acheron_1405@hotmail.com\" class=\"white-text\">acheron_1405@hotmail.com</a></li>\n");
      out.write("                            <li><a href=\"mailto:manuelflorezw@outlook.com\" class=\"white-text\">manuelflorezw@outlook.com</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col m4 s12 center\">\n");
      out.write("                        <h5 class=\"white-text\">Carrera</h5>\n");
      out.write("                        <ul>\n");
      out.write("                            <p class=\"grey-text text-lighten-4\">Facultad de ingeniería en Sistemas Computacionales</p>\n");
      out.write("                        </ul>\n");
      out.write("                        <img src=\"../web/img/sistemasufps.png\" width=\"150px\" height=\"150px\" alt=\"UFPS\" />\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"footer-copyright\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    Realizado por <a class=\"brown-text text-lighten-3\">Manuel Florez y Erick Clair</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("\n");
      out.write("        <!-- Script -->\n");
      out.write("        <script src=\"/inventario/materialize/js/jquery-2.1.1.min.js\"></script>\n");
      out.write("        <script src=\"/inventario//materialize/js/materialize.min.js\"></script>\n");
      out.write("        <script src=\"/inventario//materialize/js/init.js\"></script>\n");
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
