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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"container mt-5\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-sm-9 col-md-8 col-lg-8 mx-auto\">\n");
      out.write("                    <div class=\"card my-5 px-3\">\n");
      out.write("                        <div class=\"card-body my-3\">\n");
      out.write("                            <h3 class=\"card-title text-center mb-5 font-weight-bold text-uppercase\">Ingresar nueva salida de buses</h3>\n");
      out.write("                            <form action=\"viaje-create\" method=\"POST\">\n");
      out.write("                                <div class=\"form-group row font-weight-bold\">\n");
      out.write("                                    <label class=\"col-sm-3 col-form-label\">Origen</label>\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"origen\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group row font-weight-bold\">\n");
      out.write("                                    <label class=\"col-sm-3 col-form-label\">Destino</label>\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"destino\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group row font-weight-bold\">\n");
      out.write("                                    <label class=\"col-sm-3 col-form-label\">Hora salida</label>\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <select class=\"form-control\" name=\"hora\" required>\n");
      out.write("                                            <option value=\"08:00\">08:00 horas</option>\n");
      out.write("                                            <option value=\"09:00\">09:00 horas</option>\n");
      out.write("                                            <option value=\"10:00\">10:00 horas</option>\n");
      out.write("                                            <option value=\"11:00\">11:00 horas</option>\n");
      out.write("                                            <option value=\"12:00\">12:00 horas</option>\n");
      out.write("                                            <option value=\"13:00\">13:00 horas</option>\n");
      out.write("                                            <option value=\"14:00\">14:00 horas</option>\n");
      out.write("                                            <option value=\"15:00\">15:00 horas</option>\n");
      out.write("                                            <option value=\"16:00\">16:00 horas</option>\n");
      out.write("                                            <option value=\"17:00\">17:00 horas</option>\n");
      out.write("                                            <option value=\"18:00\">18:00 horas</option>\n");
      out.write("                                            <option value=\"19:00\">19:00 horas</option>\n");
      out.write("                                            <option value=\"20:00\">20:00 horas</option>\n");
      out.write("                                        </select>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group row font-weight-bold\">\n");
      out.write("                                    <label class=\"col-sm-3 col-form-label\">Auxiliar</label>\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control\" name=\"auxiliar\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"form-group row font-weight-bold\">\n");
      out.write("                                    <label class=\"col-sm-3 col-form-label\">Precio pasaje</label>\n");
      out.write("                                    <div class=\"col-sm-9\">\n");
      out.write("                                        <input type=\"number\" class=\"form-control\" name=\"precio\" required>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"align-middle my-1\">\n");
      out.write("                                    <div class=\"float-right\">\n");
      out.write("                                        <button class=\"btn btn-primary pl-5 pr-5 font-weight-bold\" type=\"submit\">Agregar</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>       \n");
      out.write("\n");
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
