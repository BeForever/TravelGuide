/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2016-12-22 11:55:10 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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

      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    ");

        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
    
      out.write("\n");
      out.write("    <base href=\"");
      out.print(basePath);
      out.write("\">\n");
      out.write("\n");
      out.write("    <link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\"/>\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Roboto' rel='stylesheet' type='text/css'>\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=PT+Sans+Narrow' rel='stylesheet' type='text/css'>\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/responsiveslides.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/colorbox.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/logincolorbox.css\">\n");
      out.write("    <style>\n");
      out.write("        .form {\n");
      out.write("            position: absolute;\n");
      out.write("            top: 56%;\n");
      out.write("            left: 80%;\n");
      out.write("            margin-left: -185px;\n");
      out.write("            margin-top: -210px;\n");
      out.write("            height: 420px;\n");
      out.write("            width: 340px;\n");
      out.write("            font-size: 18px;\n");
      out.write("            -webkit-box-shadow: 0px 0px 10px #A6A6A6;\n");
      out.write("            z-index: 3;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        body {\n");
      out.write("           \n");
      out.write("        }\n");
      out.write("        .image-slider {\n");
      out.write("            height: auto;\n");
      out.write("        }\n");
      out.write("        .rslides img{\n");
      out.write("        height: 750px;\n");
      out.write("        }\n");
      out.write("        .footer:after{\n");
      out.write("        z-index:5;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      if (_jspx_meth_c_005fimport_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("<div class=\"image-slider\">\n");
      out.write("    <ul class=\"rslides\" id=\"slider1\">\n");
      out.write("        <li>\n");
      out.write("            <img src=\"images/bigbac.jpg\">\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <img src=\"images/photo.jpg\">\n");
      out.write("        </li>\n");
      out.write("        <li>\n");
      out.write("            <img src=\"images/bac.jpg\">\n");
      out.write("        </li>\n");
      out.write("    </ul>\n");
      out.write("</div>\n");
      out.write("<div class=\"form\">\n");
      out.write("    <div id=\"landing\">登录</div>\n");
      out.write("    <div id=\"registered\">注册</div>\n");
      out.write("    <div class=\"fix\"></div>\n");
      out.write("    <div id=\"landing-content\">\n");
      out.write("        <form id=\"login\">\n");
      out.write("            <div id=\"photo\"><img src=\"images/photo.jpg\"/></div>\n");
      out.write("            <div class=\"inp\"><input type=\"text\" name=\"username\" placeholder=\"账号\"/></div>\n");
      out.write("            <div class=\"inp\"><input type=\"password\" name=\"password\" placeholder=\"密码\"/></div>\n");
      out.write("            <div class=\"login_button\" type=\"button\" onclick=\"Login()\">登录</div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("    <div id=\"registered-content\">\n");
      out.write("        <form id=\"register\">\n");
      out.write("            <div class=\"inp\"><input type=\"text\" id=\"rusername\" name=\"rusername\" placeholder=\"请输入账号\"/></div>\n");
      out.write("            <div class=\"inp\"><input type=\"text\" id=\"rnickName\" name=\"rnickName\" placeholder=\"请输入昵称\"/></div>\n");
      out.write("            <div class=\"inp\"><input type=\"password\" id=\"rpassword\" name=\"rpassword\" placeholder=\"请输入密码\"/></div>\n");
      out.write("            <div class=\"inp\"><input type=\"password\" id=\"rrpassword\" name=\"rrpassword\" placeholder=\"请重复密码\"/></div>\n");
      out.write("            <div class=\"login_button\" type=\"button\" onclick=\"Register()\">注册</div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      if (_jspx_meth_c_005fimport_005f1(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("<script src=\"js/jquery.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/jquery.form.js\" type=\"text/javascript\"></script>\n");
      out.write("<script src=\"js/responsiveslides.min.js\" type=\"text/javascript\"></script>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("    $(function () {\n");
      out.write("        $(\"#landing\").addClass(\"border-btn\").click(function () {\n");
      out.write("            $(\"#registered\").removeClass(\"border-btn\");\n");
      out.write("            $(this).addClass(\"border-btn\");\n");
      out.write("            $(\"#landing-content\").show(500);\n");
      out.write("            $(\"#registered-content\").hide(500);\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        $(\"#registered\").click(function () {\n");
      out.write("            $(\"#landing\").removeClass(\"border-btn\");\n");
      out.write("            $(\"#landing-content\").hide(500);\n");
      out.write("            $(this).addClass(\"border-btn\");\n");
      out.write("            $(\"#registered-content\").show(500);\n");
      out.write("        });\n");
      out.write("        $('#slider1').responsiveSlides({\n");
      out.write("            maxwidth: 2500,\n");
      out.write("            speed: 600\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        if ('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("' != '') {\n");
      out.write("            alert('");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${requestScope.msg}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("');\n");
      out.write("        }\n");
      out.write("\n");
      out.write("    });\n");
      out.write("    function Login() {\n");
      out.write("        $('#login').ajaxSubmit({\n");
      out.write("            url: 'login',\n");
      out.write("            type: 'post',\n");
      out.write("            dataType: 'json',\n");
      out.write("            success: function (data) {\n");
      out.write("                if (data.success) {\n");
      out.write("                    if (data.msg == '') {\n");
      out.write("                        location.href = 'index.jsp';\n");
      out.write("                    } else {\n");
      out.write("                        location.href = data.msg;\n");
      out.write("                    }\n");
      out.write("                } else {\n");
      out.write("                    alert(data.msg);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        })\n");
      out.write("    }\n");
      out.write("    function Register() {\n");
      out.write("        //TODO 验证插件验证\n");
      out.write("        if ($('#rusername').val() == '') {\n");
      out.write("            alert(\"账号不能为空\");\n");
      out.write("            return;\n");
      out.write("        }\n");
      out.write("        if ($('#rnickName').val() == '') {\n");
      out.write("            alert(\"昵称不能为空\");\n");
      out.write("            return;\n");
      out.write("        }\n");
      out.write("        if ($('#rpassword').val() != $('#rrpassword').val()) {\n");
      out.write("            alert(\"前后密码不一致\");\n");
      out.write("            return;\n");
      out.write("        }\n");
      out.write("        $('#register').ajaxSubmit({\n");
      out.write("            url: 'userInsertResult.do',\n");
      out.write("            type: 'post',\n");
      out.write("            dataType: 'json',\n");
      out.write("            success: function (data) {\n");
      out.write("                if (data.success) {\n");
      out.write("                    location.href = 'userDetail.do';\n");
      out.write("                } else {\n");
      out.write("                    alert(data.msg);\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("        })\n");
      out.write("    }\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fimport_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f0 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f0.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f0.setParent(null);
    // /login.jsp(46,0) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f0.setUrl("WEB-INF/jsp/header.jsp");
    int[] _jspx_push_body_count_c_005fimport_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f0 = _jspx_th_c_005fimport_005f0.doStartTag();
      if (_jspx_th_c_005fimport_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f0.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fimport_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:import
    org.apache.taglibs.standard.tag.rt.core.ImportTag _jspx_th_c_005fimport_005f1 = (org.apache.taglibs.standard.tag.rt.core.ImportTag) _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.ImportTag.class);
    _jspx_th_c_005fimport_005f1.setPageContext(_jspx_page_context);
    _jspx_th_c_005fimport_005f1.setParent(null);
    // /login.jsp(82,0) name = url type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_c_005fimport_005f1.setUrl("WEB-INF/jsp/footer.jsp");
    int[] _jspx_push_body_count_c_005fimport_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_c_005fimport_005f1 = _jspx_th_c_005fimport_005f1.doStartTag();
      if (_jspx_th_c_005fimport_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (java.lang.Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_005fimport_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_005fimport_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_005fimport_005f1.doFinally();
      _005fjspx_005ftagPool_005fc_005fimport_0026_005furl_005fnobody.reuse(_jspx_th_c_005fimport_005f1);
    }
    return false;
  }
}
