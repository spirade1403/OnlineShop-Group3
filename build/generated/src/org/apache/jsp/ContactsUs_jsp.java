package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ContactsUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <title>Contacts Us</title>    \n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">     \n");
      out.write("        <!--BOOTSTRAP5-->\n");
      out.write("        <link\n");
      out.write("            href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css\"\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            integrity=\"sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("            />\n");
      out.write("        <!--FONTAWESOME-->\n");
      out.write("        <link\n");
      out.write("            rel=\"stylesheet\"\n");
      out.write("            href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.3/css/all.min.css\"\n");
      out.write("            integrity=\"sha512-iBBXm8fW90+nuLcSKlbmrPcLa0OT92xO1BIsZ+ywDWZCvqsWgccV3gFoRBv0z+8dLJgyAHIhR35VZc2oM/gI1w==\"\n");
      out.write("            crossorigin=\"anonymous\"\n");
      out.write("            referrerpolicy=\"no-referrer\"\n");
      out.write("            />           \n");
      out.write("        <!-- CSS -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/style.css\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/queries.css\" />\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pageContext.request.contextPath}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("/css/ContactsUs.css\">\n");
      out.write("\n");
      out.write("        <!--===============================================================================================-->\n");
      out.write("    </head>\n");
      out.write("    <body class=\"animsition\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "model/header.jsp", out, false);
      out.write("\n");
      out.write("        <!-- ==================================HOME================================================ -->     \n");
      out.write("        <!-- ======================================= PRODUCT DETAIL ================================= -->\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div id=\"error_message\"></div>\n");
      out.write("    <form id=\"myform\" onsubmit=\"return validate();\">\n");
      out.write("        <div class=\"contact-box\">\n");
      out.write("            <div class=\"left\">                                            \n");
      out.write("            </div>\n");
      out.write("            <div class=\"right\">\n");
      out.write("                <h2>CONTACTS US</h2>\n");
      out.write("                <input type=\"text\" class=\"field\" placeholder=\"Your Name\" id=\"name\">\n");
      out.write("                        <input type=\"text\" class=\"field\" placeholder=\"Your Email\" id=\"email\">\n");
      out.write("                        <input type=\"text\" class=\"field\" placeholder=\"Phone\" id=\"phone\">\n");
      out.write("                        <textarea id=\"message\" placeholder=\"Message\" class=\"field\"></textarea>\n");
      out.write("                \n");
      out.write("<!--                <div class=\"input_field\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Name\" id=\"name\">\n");
      out.write("                </div>\n");
      out.write("                    <div class=\"input_field\">\n");
      out.write("                        <input type=\"text\" placeholder=\"Subject\" id=\"subject\">\n");
      out.write("                    </div>\n");
      out.write("                <div class=\"input_field\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Phone\" id=\"phone\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input_field\">\n");
      out.write("                    <input type=\"text\" placeholder=\"Email\" id=\"email\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"input_field\">\n");
      out.write("                    <textarea placeholder=\"Message\" id=\"message\"></textarea>\n");
      out.write("                </div>-->\n");
      out.write("                <div class=\"btn1\">\n");
      out.write("                    <input type=\"submit\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("        </div>                          \n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "model/footer.jsp", out, false);
      out.write("\n");
      out.write("    </body>\n");
      out.write("    <script>\n");
      out.write("        function validate(){\n");
      out.write("  var name = document.getElementById(\"name\").value;\n");
      out.write("  //var subject = document.getElementById(\"subject\").value;\n");
      out.write("  var phone = document.getElementById(\"phone\").value;\n");
      out.write("  var email = document.getElementById(\"email\").value;\n");
      out.write("  var message = document.getElementById(\"message\").value;\n");
      out.write("  var error_message = document.getElementById(\"error_message\");\n");
      out.write("  \n");
      out.write("  error_message.style.padding = \"10px\";\n");
      out.write("  \n");
      out.write("  var text;\n");
      out.write("  if(name.length < 5){\n");
      out.write("    text = \"Please Enter valid Name\";\n");
      out.write("    error_message.innerHTML = text;\n");
      out.write("    return false;\n");
      out.write("  }\n");
      out.write("//  if(subject.length < 10){\n");
      out.write("//    text = \"Please Enter Correct Subject\";\n");
      out.write("//    error_message.innerHTML = text;\n");
      out.write("//    return false;\n");
      out.write("//  }\n");
      out.write("  if(isNaN(phone) || phone.length != 10){\n");
      out.write("    text = \"Please Enter valid Phone Number\";\n");
      out.write("    error_message.innerHTML = text;\n");
      out.write("    return false;\n");
      out.write("  }\n");
      out.write("  if(email.indexOf(\"@\") == -1 || email.length < 6){\n");
      out.write("    text = \"Please Enter valid Email\";\n");
      out.write("    error_message.innerHTML = text;\n");
      out.write("    return false;\n");
      out.write("  }\n");
      out.write("  if(message.length <= 140){\n");
      out.write("    text = \"Please Enter More Than 140 Characters\";\n");
      out.write("    error_message.innerHTML = text;\n");
      out.write("    return false;\n");
      out.write("  }\n");
      out.write("  alert(\"Form Submitted Successfully!\");\n");
      out.write("  return true;\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("    </script>\n");
      out.write("</html>");
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
