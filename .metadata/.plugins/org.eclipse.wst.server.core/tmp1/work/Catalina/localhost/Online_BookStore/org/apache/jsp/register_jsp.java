/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.84
 * Generated at: 2025-01-03 16:34:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class register_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(3);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar", Long.valueOf(1734970757686L));
    _jspx_dependants.put("jar:file:/D:/PRATEEK/Preparation/.metadata/.plugins/org.eclipse.wst.server.core/tmp1/wtpwebapps/Online%20BookStore/WEB-INF/lib/taglibs-standard-impl-1.2.5.jar!/META-INF/c.tld", Long.valueOf(1425958870000L));
    _jspx_dependants.put("/WEB-INF/tlds/Libindia.tld", Long.valueOf(1735657501150L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody.release();
    _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"");
      out.print(request.getContextPath());
      out.write("/css/Libindia.css\">\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	href=\"");
      out.print(request.getContextPath());
      out.write("/css/main.css\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<center>\r\n");
      out.write("		<form action=register.lib method=\"post\">\r\n");
      out.write("			<table class=\"textStyle\">\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td align=\"center\" colspan=\"3\"><font size=\"7\"><b>Register\r\n");
      out.write("								New User</b></font></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td align=\"center\" colspan=\"3\"><font size=\"4\" color=\"red\"><b>\r\n");
      out.write("								");
      if (_jspx_meth_Lib_005ferror_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("						</b></font></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td><br /></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				");
      if (_jspx_meth_core_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td align=\"center\" colspan=\"3\"><b> <font size=\"5\">Login</font>&nbsp;\r\n");
      out.write("							<a href=\"index.jsp\"> <font size=\"5\">Click Here</font>\r\n");
      out.write("						</a></b></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<td align=\"center\" colspan=\"3\"><b><font size=\"5\">Forget\r\n");
      out.write("								Password</font>&nbsp; <a href=\"forgetPasswordDef.jsp\"> <font\r\n");
      out.write("								size=\"5\">Click Here</font></a> </b></td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("		</form>\r\n");
      out.write("	</center>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_Lib_005ferror_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  Lib:error
    com.lib.book.shop.tags.ErrorTag _jspx_th_Lib_005ferror_005f0 = (com.lib.book.shop.tags.ErrorTag) _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody.get(com.lib.book.shop.tags.ErrorTag.class);
    boolean _jspx_th_Lib_005ferror_005f0_reused = false;
    try {
      _jspx_th_Lib_005ferror_005f0.setPageContext(_jspx_page_context);
      _jspx_th_Lib_005ferror_005f0.setParent(null);
      // /register.jsp(24,8) name = property type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_Lib_005ferror_005f0.setProperty("registrationError");
      int _jspx_eval_Lib_005ferror_005f0 = _jspx_th_Lib_005ferror_005f0.doStartTag();
      if (_jspx_th_Lib_005ferror_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody.reuse(_jspx_th_Lib_005ferror_005f0);
      _jspx_th_Lib_005ferror_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_Lib_005ferror_005f0, _jsp_getInstanceManager(), _jspx_th_Lib_005ferror_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_core_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  core:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_core_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_core_005fif_005f0_reused = false;
    try {
      _jspx_th_core_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_core_005fif_005f0.setParent(null);
      // /register.jsp(30,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_core_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${REGISTERED ne 'OK'}", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_core_005fif_005f0 = _jspx_th_core_005fif_005f0.doStartTag();
      if (_jspx_eval_core_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("					<tr>\r\n");
          out.write("						<td><font size=\"5\"><b>First Name</b></font></td>\r\n");
          out.write("						<td><input type=\"text\" id=\"fname\"\r\n");
          out.write("							style=\"color: black; background-color: #b4e0d2; font-size: 25\"\r\n");
          out.write("							name=\"fname\"></td>\r\n");
          out.write("						<td><font size=\"4\" color=\"red\"><b>");
          if (_jspx_meth_Lib_005ferror_005f1(_jspx_th_core_005fif_005f0, _jspx_page_context))
            return true;
          out.write("</b></font></td>\r\n");
          out.write("					</tr>\r\n");
          out.write("					<tr>\r\n");
          out.write("						<td><font size=\"5\"><b>Middle Name</b></font></td>\r\n");
          out.write("						<td><input type=\"text\" id=\"mname\"\r\n");
          out.write("							style=\"color: black; background-color: #b4e0d2; font-size: 25\"\r\n");
          out.write("							name=\"mname\"></td>\r\n");
          out.write("						<td><font size=\"4\" color=\"red\"><b>");
          if (_jspx_meth_Lib_005ferror_005f2(_jspx_th_core_005fif_005f0, _jspx_page_context))
            return true;
          out.write("</b></font></td>\r\n");
          out.write("					</tr>\r\n");
          out.write("					<tr>\r\n");
          out.write("						<td><font size=\"5\"><b>Last Name</b></font></td>\r\n");
          out.write("						<td><input type=\"text\" id=\"lname\"\r\n");
          out.write("							style=\"color: black; background-color: #b4e0d2; font-size: 25\"\r\n");
          out.write("							name=\"lname\"></td>\r\n");
          out.write("						<td><font size=\"4\" color=\"red\"><b>");
          if (_jspx_meth_Lib_005ferror_005f3(_jspx_th_core_005fif_005f0, _jspx_page_context))
            return true;
          out.write("</b></font></td>\r\n");
          out.write("					</tr>\r\n");
          out.write("					<tr>\r\n");
          out.write("						<td><font size=\"5\"><b>Email</b></font></td>\r\n");
          out.write("						<td><input type=\"text\" id=\"email\"\r\n");
          out.write("							style=\"color: black; background-color: #b4e0d2; font-size: 25\"\r\n");
          out.write("							name=\"email\"></td>\r\n");
          out.write("						<td><font size=\"4\" color=\"red\"><b>");
          if (_jspx_meth_Lib_005ferror_005f4(_jspx_th_core_005fif_005f0, _jspx_page_context))
            return true;
          out.write("</b></font></td>\r\n");
          out.write("					</tr>\r\n");
          out.write("					<tr>\r\n");
          out.write("						<td><font size=\"5\"><b>Phone</b></font></td>\r\n");
          out.write("						<td><input type=\"text\" id=\"phone\"\r\n");
          out.write("							style=\"color: black; background-color: #b4e0d2; font-size: 25\"\r\n");
          out.write("							name=\"phone\"></td>\r\n");
          out.write("						<td><font size=\"4\" color=\"red\"><b>");
          if (_jspx_meth_Lib_005ferror_005f5(_jspx_th_core_005fif_005f0, _jspx_page_context))
            return true;
          out.write("</b></font></td>\r\n");
          out.write("					</tr>\r\n");
          out.write("					<tr>\r\n");
          out.write("						<td><font size=\"5\"><b>Gender</b></font></td>\r\n");
          out.write("						<td><input type=\"radio\" value=\"Male\" name=\"gender\"> <font\r\n");
          out.write("							size=\"5\"><b>Male</b></font> <input type=\"radio\" value=\"Female\"\r\n");
          out.write("							name=\"gender\"> <font size=\"5\"><b>Female</b></font></td>\r\n");
          out.write("\r\n");
          out.write("						<td><font size=\"4\" color=\"red\"><b>");
          if (_jspx_meth_Lib_005ferror_005f6(_jspx_th_core_005fif_005f0, _jspx_page_context))
            return true;
          out.write("</b></font></td>\r\n");
          out.write("					</tr>\r\n");
          out.write("					<tr>\r\n");
          out.write("						<td><font size=\"5\"><b>Username</b></font></td>\r\n");
          out.write("						<td><input type=\"text\" id=\"uname\"\r\n");
          out.write("							style=\"color: black; background-color: #b4e0d2; font-size: 25\"\r\n");
          out.write("							name=\"uname\"></td>\r\n");
          out.write("						<td><font size=\"4\" color=\"red\"><b>");
          if (_jspx_meth_Lib_005ferror_005f7(_jspx_th_core_005fif_005f0, _jspx_page_context))
            return true;
          out.write("</b></font></td>\r\n");
          out.write("					</tr>\r\n");
          out.write("					<tr>\r\n");
          out.write("						<td><font size=\"5\"><b>Password</b></font></td>\r\n");
          out.write("						<td><input type=\"password\" id=\"pass\"\r\n");
          out.write("							style=\"color: black; background-color: #b4e0d2; font-size: 25\"\r\n");
          out.write("							name=\"pass\"></td>\r\n");
          out.write("						<td><font size=\"4\" color=\"red\"><b>");
          if (_jspx_meth_Lib_005ferror_005f8(_jspx_th_core_005fif_005f0, _jspx_page_context))
            return true;
          out.write("</b></font></td>\r\n");
          out.write("					</tr>\r\n");
          out.write("					<tr>\r\n");
          out.write("						<td colspan=\"3\" align=\"center\"><br> <input type=\"submit\"\r\n");
          out.write("							value=\"Register Me\" id=\"phone\"\r\n");
          out.write("							style=\"color: white; background-color: maroon; font-size: 17\"></td>\r\n");
          out.write("						<td>\r\n");
          out.write("					</tr>\r\n");
          out.write("				");
          int evalDoAfterBody = _jspx_th_core_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_core_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fcore_005fif_0026_005ftest.reuse(_jspx_th_core_005fif_005f0);
      _jspx_th_core_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_core_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_core_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_Lib_005ferror_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_core_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  Lib:error
    com.lib.book.shop.tags.ErrorTag _jspx_th_Lib_005ferror_005f1 = (com.lib.book.shop.tags.ErrorTag) _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody.get(com.lib.book.shop.tags.ErrorTag.class);
    boolean _jspx_th_Lib_005ferror_005f1_reused = false;
    try {
      _jspx_th_Lib_005ferror_005f1.setPageContext(_jspx_page_context);
      _jspx_th_Lib_005ferror_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_005fif_005f0);
      // /register.jsp(36,40) name = property type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_Lib_005ferror_005f1.setProperty("fname");
      int _jspx_eval_Lib_005ferror_005f1 = _jspx_th_Lib_005ferror_005f1.doStartTag();
      if (_jspx_th_Lib_005ferror_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody.reuse(_jspx_th_Lib_005ferror_005f1);
      _jspx_th_Lib_005ferror_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_Lib_005ferror_005f1, _jsp_getInstanceManager(), _jspx_th_Lib_005ferror_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_Lib_005ferror_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_core_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  Lib:error
    com.lib.book.shop.tags.ErrorTag _jspx_th_Lib_005ferror_005f2 = (com.lib.book.shop.tags.ErrorTag) _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody.get(com.lib.book.shop.tags.ErrorTag.class);
    boolean _jspx_th_Lib_005ferror_005f2_reused = false;
    try {
      _jspx_th_Lib_005ferror_005f2.setPageContext(_jspx_page_context);
      _jspx_th_Lib_005ferror_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_005fif_005f0);
      // /register.jsp(44,40) name = property type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_Lib_005ferror_005f2.setProperty("mname");
      int _jspx_eval_Lib_005ferror_005f2 = _jspx_th_Lib_005ferror_005f2.doStartTag();
      if (_jspx_th_Lib_005ferror_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody.reuse(_jspx_th_Lib_005ferror_005f2);
      _jspx_th_Lib_005ferror_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_Lib_005ferror_005f2, _jsp_getInstanceManager(), _jspx_th_Lib_005ferror_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_Lib_005ferror_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_core_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  Lib:error
    com.lib.book.shop.tags.ErrorTag _jspx_th_Lib_005ferror_005f3 = (com.lib.book.shop.tags.ErrorTag) _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody.get(com.lib.book.shop.tags.ErrorTag.class);
    boolean _jspx_th_Lib_005ferror_005f3_reused = false;
    try {
      _jspx_th_Lib_005ferror_005f3.setPageContext(_jspx_page_context);
      _jspx_th_Lib_005ferror_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_005fif_005f0);
      // /register.jsp(52,40) name = property type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_Lib_005ferror_005f3.setProperty("lname");
      int _jspx_eval_Lib_005ferror_005f3 = _jspx_th_Lib_005ferror_005f3.doStartTag();
      if (_jspx_th_Lib_005ferror_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody.reuse(_jspx_th_Lib_005ferror_005f3);
      _jspx_th_Lib_005ferror_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_Lib_005ferror_005f3, _jsp_getInstanceManager(), _jspx_th_Lib_005ferror_005f3_reused);
    }
    return false;
  }

  private boolean _jspx_meth_Lib_005ferror_005f4(javax.servlet.jsp.tagext.JspTag _jspx_th_core_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  Lib:error
    com.lib.book.shop.tags.ErrorTag _jspx_th_Lib_005ferror_005f4 = (com.lib.book.shop.tags.ErrorTag) _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody.get(com.lib.book.shop.tags.ErrorTag.class);
    boolean _jspx_th_Lib_005ferror_005f4_reused = false;
    try {
      _jspx_th_Lib_005ferror_005f4.setPageContext(_jspx_page_context);
      _jspx_th_Lib_005ferror_005f4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_005fif_005f0);
      // /register.jsp(60,40) name = property type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_Lib_005ferror_005f4.setProperty("email");
      int _jspx_eval_Lib_005ferror_005f4 = _jspx_th_Lib_005ferror_005f4.doStartTag();
      if (_jspx_th_Lib_005ferror_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody.reuse(_jspx_th_Lib_005ferror_005f4);
      _jspx_th_Lib_005ferror_005f4_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_Lib_005ferror_005f4, _jsp_getInstanceManager(), _jspx_th_Lib_005ferror_005f4_reused);
    }
    return false;
  }

  private boolean _jspx_meth_Lib_005ferror_005f5(javax.servlet.jsp.tagext.JspTag _jspx_th_core_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  Lib:error
    com.lib.book.shop.tags.ErrorTag _jspx_th_Lib_005ferror_005f5 = (com.lib.book.shop.tags.ErrorTag) _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody.get(com.lib.book.shop.tags.ErrorTag.class);
    boolean _jspx_th_Lib_005ferror_005f5_reused = false;
    try {
      _jspx_th_Lib_005ferror_005f5.setPageContext(_jspx_page_context);
      _jspx_th_Lib_005ferror_005f5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_005fif_005f0);
      // /register.jsp(68,40) name = property type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_Lib_005ferror_005f5.setProperty("phone");
      int _jspx_eval_Lib_005ferror_005f5 = _jspx_th_Lib_005ferror_005f5.doStartTag();
      if (_jspx_th_Lib_005ferror_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody.reuse(_jspx_th_Lib_005ferror_005f5);
      _jspx_th_Lib_005ferror_005f5_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_Lib_005ferror_005f5, _jsp_getInstanceManager(), _jspx_th_Lib_005ferror_005f5_reused);
    }
    return false;
  }

  private boolean _jspx_meth_Lib_005ferror_005f6(javax.servlet.jsp.tagext.JspTag _jspx_th_core_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  Lib:error
    com.lib.book.shop.tags.ErrorTag _jspx_th_Lib_005ferror_005f6 = (com.lib.book.shop.tags.ErrorTag) _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody.get(com.lib.book.shop.tags.ErrorTag.class);
    boolean _jspx_th_Lib_005ferror_005f6_reused = false;
    try {
      _jspx_th_Lib_005ferror_005f6.setPageContext(_jspx_page_context);
      _jspx_th_Lib_005ferror_005f6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_005fif_005f0);
      // /register.jsp(77,40) name = property type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_Lib_005ferror_005f6.setProperty("gender");
      int _jspx_eval_Lib_005ferror_005f6 = _jspx_th_Lib_005ferror_005f6.doStartTag();
      if (_jspx_th_Lib_005ferror_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody.reuse(_jspx_th_Lib_005ferror_005f6);
      _jspx_th_Lib_005ferror_005f6_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_Lib_005ferror_005f6, _jsp_getInstanceManager(), _jspx_th_Lib_005ferror_005f6_reused);
    }
    return false;
  }

  private boolean _jspx_meth_Lib_005ferror_005f7(javax.servlet.jsp.tagext.JspTag _jspx_th_core_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  Lib:error
    com.lib.book.shop.tags.ErrorTag _jspx_th_Lib_005ferror_005f7 = (com.lib.book.shop.tags.ErrorTag) _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody.get(com.lib.book.shop.tags.ErrorTag.class);
    boolean _jspx_th_Lib_005ferror_005f7_reused = false;
    try {
      _jspx_th_Lib_005ferror_005f7.setPageContext(_jspx_page_context);
      _jspx_th_Lib_005ferror_005f7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_005fif_005f0);
      // /register.jsp(85,40) name = property type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_Lib_005ferror_005f7.setProperty("uname");
      int _jspx_eval_Lib_005ferror_005f7 = _jspx_th_Lib_005ferror_005f7.doStartTag();
      if (_jspx_th_Lib_005ferror_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody.reuse(_jspx_th_Lib_005ferror_005f7);
      _jspx_th_Lib_005ferror_005f7_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_Lib_005ferror_005f7, _jsp_getInstanceManager(), _jspx_th_Lib_005ferror_005f7_reused);
    }
    return false;
  }

  private boolean _jspx_meth_Lib_005ferror_005f8(javax.servlet.jsp.tagext.JspTag _jspx_th_core_005fif_005f0, javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  Lib:error
    com.lib.book.shop.tags.ErrorTag _jspx_th_Lib_005ferror_005f8 = (com.lib.book.shop.tags.ErrorTag) _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody.get(com.lib.book.shop.tags.ErrorTag.class);
    boolean _jspx_th_Lib_005ferror_005f8_reused = false;
    try {
      _jspx_th_Lib_005ferror_005f8.setPageContext(_jspx_page_context);
      _jspx_th_Lib_005ferror_005f8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_core_005fif_005f0);
      // /register.jsp(93,40) name = property type = java.lang.String reqTime = false required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_Lib_005ferror_005f8.setProperty("pass");
      int _jspx_eval_Lib_005ferror_005f8 = _jspx_th_Lib_005ferror_005f8.doStartTag();
      if (_jspx_th_Lib_005ferror_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fLib_005ferror_0026_005fproperty_005fnobody.reuse(_jspx_th_Lib_005ferror_005f8);
      _jspx_th_Lib_005ferror_005f8_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_Lib_005ferror_005f8, _jsp_getInstanceManager(), _jspx_th_Lib_005ferror_005f8_reused);
    }
    return false;
  }
}