/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.55
 * Generated at: 2021-11-28 04:28:16 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class paddyPricingList_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("jar:file:/C:/Users/Ruzna/Desktop/PSC/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/psc_web_app/WEB-INF/lib/jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-1.2.jar", Long.valueOf(1638025626435L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
    _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write(" \r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\" />\r\n");
      out.write("\r\n");
      out.write("<title>Paddy Storage Cooperation</title>\r\n");
      out.write("<meta content=\"\" name=\"description\" />\r\n");
      out.write("<meta content=\"\" name=\"keywords\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Google Fonts -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\"\r\n");
      out.write("	rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Vendor CSS Files -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"CollectionOfficerAssets/vendor/bootstrap/css/bootstrap.min.css\"\r\n");
      out.write("	rel=\"stylesheet\" />\r\n");
      out.write("<link\r\n");
      out.write("	href=\"CollectionOfficerAssets/vendor/bootstrap-icons/bootstrap-icons.css\"\r\n");
      out.write("	rel=\"stylesheet\" />\r\n");
      out.write("<link\r\n");
      out.write("	href=\"CollectionOfficerAssets/vendor/aos/aos.css\"\r\n");
      out.write("	rel=\"stylesheet\" />\r\n");
      out.write("<link\r\n");
      out.write("	href=\"CollectionOfficerAssets/vendor/remixicon/remixicon.css\"\r\n");
      out.write("	rel=\"stylesheet\" />\r\n");
      out.write("<link\r\n");
      out.write("	href=\"CollectionOfficerAssets/vendor/swiper/swiper-bundle.min.css\"\r\n");
      out.write("	rel=\"stylesheet\" />\r\n");
      out.write("<link\r\n");
      out.write("	href=\"CollectionOfficerAssets/vendor/glightbox/css/glightbox.min.css\"\r\n");
      out.write("	rel=\"stylesheet\" />\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://pro.fontawesome.com/releases/v5.10.0/css/all.css\"\r\n");
      out.write("	integrity=\"sha384-AYmEC3Yw5cVb3ZcuHtOA93w35dYTsvhLPVnYs9eStHfGJvOvKxVfELGroGkvsg+p\"\r\n");
      out.write("	crossorigin=\"anonymous\" />\r\n");
      out.write("\r\n");
      out.write("<!-- Bootstrap Icons -->\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap-icons@1.5.0/font/bootstrap-icons.css\">\r\n");
      out.write("\r\n");
      out.write("<!-- Template Main CSS File -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"CollectionOfficerAssets/css/style.css\"\r\n");
      out.write("	rel=\"stylesheet\" />\r\n");
      out.write("\r\n");
      out.write("<!-- =======================================================\r\n");
      out.write("  * Template Name: FlexStart - v1.7.0\r\n");
      out.write("  * Template URL: https://bootstrapmade.com/flexstart-bootstrap-startup-template/\r\n");
      out.write("  * Author: BootstrapMade.com\r\n");
      out.write("  * License: https://bootstrapmade.com/license/\r\n");
      out.write("  ======================================================== -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");

	response.setHeader("Cache-Control", "no-cache, no-store, must-revalidate");

	if (session.getAttribute("collection_officer_Email") == null) {
		response.sendRedirect("userLogin.jsp");
	}
	
      out.write("\r\n");
      out.write("	<!-- ======= Header ======= -->\r\n");
      out.write("	<header id=\"header\" class=\"header fixed-top\">\r\n");
      out.write("		<div\r\n");
      out.write("			class=\"\r\n");
      out.write("          container-fluid container-xl\r\n");
      out.write("          d-flex\r\n");
      out.write("          align-items-center\r\n");
      out.write("          justify-content-between\r\n");
      out.write("        \">\r\n");
      out.write("			<a href=\"dashboard.html\" class=\"logo d-flex align-items-center\">\r\n");
      out.write("				<!-- <img src=\"assets/img/logo.png\" alt=\"\" /> --> <img\r\n");
      out.write("				style=\"width: 30px;\" src=\"CollectionOfficerAssets/img/logo_final.png\" alt=\"\"> <span\r\n");
      out.write("				style=\"font-size: 1.2rem\">PADDY STORAGE COOPERATION</span>\r\n");
      out.write("			</a>\r\n");
      out.write("\r\n");
      out.write("			<nav id=\"navbar\" class=\"navbar\">\r\n");
      out.write("				<ul>\r\n");
      out.write("					<li><a class=\"nav-link\"\r\n");
      out.write("						href=\"");
      out.print(request.getContextPath());
      out.write("/dashboardlist\">Dashboard</a></li>\r\n");
      out.write("					<li><a class=\"nav-link\"\r\n");
      out.write("						href=\"");
      out.print(request.getContextPath());
      out.write("/list\">Collect Paddy</a></li>				\r\n");
      out.write("					<li><a class=\"active\"\r\n");
      out.write("						href=\"");
      out.print(request.getContextPath());
      out.write("/pricelist\">Paddy\r\n");
      out.write("							Pricing</a></li>\r\n");
      out.write("					<li><a class=\"nav-link \"\r\n");
      out.write("						href=\"");
      out.print(request.getContextPath());
      out.write("/farmerslist\">Farmers</a>\r\n");
      out.write("					</li>\r\n");
      out.write("					\r\n");
      out.write("					<li class=\"dropdown\"><a class=\"getstarted scrollto\"\r\n");
      out.write("						href=\"#about\"><span>Collection Officer</span> <i\r\n");
      out.write("							class=\"bi bi-chevron-down\"></i></a>\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><a href=\"profile.html\"><i\r\n");
      out.write("									style=\"font-size: 1.1rem; margin-left: 38px\"\r\n");
      out.write("									class=\"bi bi-person-lines-fill\"><span> Profile</span></i></a></li>\r\n");
      out.write("							<li>\r\n");
      out.write("								<form action=\"logout\">\r\n");
      out.write("									<div align=\"center\">\r\n");
      out.write("										<button type=\"submit\" style=\"margin-left:3rem;\" class=\"btn bg-transparent logout\">\r\n");
      out.write("											<i style=\"font-size: 1.1rem;\" class=\"bi bi-box-arrow-right\"><span>\r\n");
      out.write("													Logout</span></i>\r\n");
      out.write("										</button>\r\n");
      out.write("									</div>\r\n");
      out.write("								</form>\r\n");
      out.write("							</li>\r\n");
      out.write("						</ul></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("				<i class=\"bi bi-list mobile-nav-toggle\"></i>\r\n");
      out.write("			</nav>\r\n");
      out.write("			<!-- .navbar -->\r\n");
      out.write("		</div>\r\n");
      out.write("	</header>\r\n");
      out.write("	\r\n");
      out.write("		<section data-aos=\"fade-up\" data-aos-delay=\"200\"\r\n");
      out.write("		style=\"margin-top: 5rem\">\r\n");
      out.write("		<div class=\"container-xl\">\r\n");
      out.write("		\r\n");
      out.write("			<div class=\"table-responsive\" style=\"margin-top: 1px\">\r\n");
      out.write("				<div class=\"table-wrapper\">\r\n");
      out.write("					<div class=\"table-title\">\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<div class=\"col-sm-4\">\r\n");
      out.write("								<h2>Current Paddy Pricing Details</h2>\r\n");
      out.write("							</div>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"scrollmenu\">\r\n");
      out.write("						<table class=\"table table-striped table-hover\">\r\n");
      out.write("							<thead>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<!-- <th scope=\"col\" style=\"width: 10%\">Id</th>\r\n");
      out.write("							 		<th scope=\"col\">Farmer Name</th>\r\n");
      out.write("									<th scope=\"col\">Paddy Type</th> -->\r\n");
      out.write("									<th scope=\"col\">Paddy Id</th>\r\n");
      out.write("									<th scope=\"col\">Paddy Type</th>\r\n");
      out.write("									<th scope=\"col\">Buying Price (Rs/1kg)</th>\r\n");
      out.write("									<th scope=\"col\">Selling Price (Rs/1kg)</th>													\r\n");
      out.write("								</tr>\r\n");
      out.write("							</thead>\r\n");
      out.write("							<tbody>							\r\n");
      out.write("								");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</section>\r\n");
      out.write("	\r\n");
      out.write("	<a href=\"#\"\r\n");
      out.write("		class=\"back-to-top d-flex align-items-center justify-content-center\"><i\r\n");
      out.write("		class=\"bi bi-arrow-up-short\"></i> </a>\r\n");
      out.write("\r\n");
      out.write("	<!-- Vendor JS Files -->\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"CollectionOfficerAssets/vendor/bootstrap/js/bootstrap.bundle.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"CollectionOfficerAssets/vendor/aos/aos.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"CollectionOfficerAssets/vendor/php-email-form/validate.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"CollectionOfficerAssets/vendor/swiper/swiper-bundle.min.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"CollectionOfficerAssets/vendor/purecounter/purecounter.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"CollectionOfficerAssets/vendor/isotope-layout/isotope.pkgd.min.js\"></script>\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"CollectionOfficerAssets/vendor/glightbox/js/glightbox.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("	<!-- Template Main JS File -->\r\n");
      out.write("	<script\r\n");
      out.write("		src=\"CollectionOfficerAssets/js/main.js\"></script>\r\n");
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

  private boolean _jspx_meth_c_005fforEach_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /paddyPricingList.jsp(149,8) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("collectPaddyPriceList");
      // /paddyPricingList.jsp(149,8) name = items type = javax.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/paddyPricingList.jsp(149,8) '${listPaddyPricing}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${listPaddyPricing}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\r\n");
            out.write("									<tr>\r\n");
            out.write("										<td>");
            if (_jspx_meth_c_005fout_005f0(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("</td>\r\n");
            out.write("										<td>");
            if (_jspx_meth_c_005fout_005f1(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("</td>\r\n");
            out.write("										<td>");
            if (_jspx_meth_c_005fout_005f2(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("</td> \r\n");
            out.write("										<td>");
            if (_jspx_meth_c_005fout_005f3(_jspx_th_c_005fforEach_005f0, _jspx_page_context, _jspx_push_body_count_c_005fforEach_005f0))
              return true;
            out.write("</td>																												\r\n");
            out.write("									</tr>\r\n");
            out.write("								");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f0_reused = false;
    try {
      _jspx_th_c_005fout_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /paddyPricingList.jsp(152,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${collectPaddyPriceList.paddy_Id}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f0 = _jspx_th_c_005fout_005f0.doStartTag();
      if (_jspx_th_c_005fout_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f0);
      _jspx_th_c_005fout_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f1_reused = false;
    try {
      _jspx_th_c_005fout_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /paddyPricingList.jsp(153,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${collectPaddyPriceList.paddy_Type}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f1 = _jspx_th_c_005fout_005f1.doStartTag();
      if (_jspx_th_c_005fout_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f1);
      _jspx_th_c_005fout_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f2_reused = false;
    try {
      _jspx_th_c_005fout_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /paddyPricingList.jsp(154,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("Rs.${collectPaddyPriceList.buying_price_per_Kg}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f2 = _jspx_th_c_005fout_005f2.doStartTag();
      if (_jspx_th_c_005fout_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f2);
      _jspx_th_c_005fout_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fout_005f3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_005fforEach_005f0, javax.servlet.jsp.PageContext _jspx_page_context, int[] _jspx_push_body_count_c_005fforEach_005f0)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_005fout_005f3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    boolean _jspx_th_c_005fout_005f3_reused = false;
    try {
      _jspx_th_c_005fout_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fout_005f3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_005fforEach_005f0);
      // /paddyPricingList.jsp(155,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fout_005f3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("Rs.${collectPaddyPriceList.selling_price_per_Kg}", java.lang.Object.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      int _jspx_eval_c_005fout_005f3 = _jspx_th_c_005fout_005f3.doStartTag();
      if (_jspx_th_c_005fout_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fout_0026_005fvalue_005fnobody.reuse(_jspx_th_c_005fout_005f3);
      _jspx_th_c_005fout_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fout_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fout_005f3_reused);
    }
    return false;
  }
}
