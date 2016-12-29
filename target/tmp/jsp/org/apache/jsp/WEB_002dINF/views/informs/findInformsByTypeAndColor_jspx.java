package org.apache.jsp.WEB_002dINF.views.informs;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class findInformsByTypeAndColor_jspx extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/WEB-INF/tags/form/find.tagx");
    _jspx_dependants.add("/WEB-INF/tags/util/panel.tagx");
    _jspx_dependants.add("/WEB-INF/tags/form/fields/select.tagx");
    _jspx_dependants.add("/WEB-INF/tags/form/fields/reference.tagx");
  }

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

      out.write("<div version=\"2.0\">");
      if (_jspx_meth_form_find_0(_jspx_page_context))
        return;
      out.write("</div>");
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

  private boolean _jspx_meth_form_find_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  form:find
    org.apache.jsp.tag.web.form.find_tagx _jspx_th_form_find_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.form.find_tagx.class) : new org.apache.jsp.tag.web.form.find_tagx();
    _jspx_th_form_find_0.setJspContext(_jspx_page_context);
    _jspx_th_form_find_0.setZ("IjDVKG7NR22T71Lzil/+ABcmIds=");
    _jspx_th_form_find_0.setPath("/informs");
    _jspx_th_form_find_0.setId("ff_com_spring_domain_Inform");
    _jspx_th_form_find_0.setFinderName("ByTypeAndColor");
    _jspx_th_form_find_0.setJspBody(new findInformsByTypeAndColor_jspxHelper( 0, _jspx_page_context, _jspx_th_form_find_0, null));
    _jspx_th_form_find_0.doTag();
    return false;
  }

  private boolean _jspx_meth_field_select_0(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  field:select
    org.apache.jsp.tag.web.form.fields.select_tagx _jspx_th_field_select_0 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.form.fields.select_tagx.class) : new org.apache.jsp.tag.web.form.fields.select_tagx();
    _jspx_th_field_select_0.setJspContext(_jspx_page_context);
    _jspx_th_field_select_0.setParent(_jspx_parent);
    _jspx_th_field_select_0.setZ("o/TnuftArBovoq+vMoaGIWMFudM=");
    _jspx_th_field_select_0.setRequired(new Boolean(true));
    _jspx_th_field_select_0.setPath("/types");
    _jspx_th_field_select_0.setItems((java.util.Collection) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${types}", java.util.Collection.class, (PageContext)_jspx_page_context, null));
    _jspx_th_field_select_0.setItemValue("id");
    _jspx_th_field_select_0.setId("f_com_spring_domain_Inform_type");
    _jspx_th_field_select_0.setField("type");
    _jspx_th_field_select_0.setDisableFormBinding(new Boolean(true));
    _jspx_th_field_select_0.doTag();
    return false;
  }

  private boolean _jspx_meth_field_select_1(javax.servlet.jsp.tagext.JspTag _jspx_parent, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  field:select
    org.apache.jsp.tag.web.form.fields.select_tagx _jspx_th_field_select_1 = (_jspx_resourceInjector != null) ? _jspx_resourceInjector.createTagHandlerInstance(org.apache.jsp.tag.web.form.fields.select_tagx.class) : new org.apache.jsp.tag.web.form.fields.select_tagx();
    _jspx_th_field_select_1.setJspContext(_jspx_page_context);
    _jspx_th_field_select_1.setParent(_jspx_parent);
    _jspx_th_field_select_1.setZ("kX7sqEAE1a92MkgqfkQIy7PLJuc=");
    _jspx_th_field_select_1.setRequired(new Boolean(true));
    _jspx_th_field_select_1.setPath("/colors");
    _jspx_th_field_select_1.setItems((java.util.Collection) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${colors}", java.util.Collection.class, (PageContext)_jspx_page_context, null));
    _jspx_th_field_select_1.setItemValue("id");
    _jspx_th_field_select_1.setId("f_com_spring_domain_Inform_color");
    _jspx_th_field_select_1.setField("color");
    _jspx_th_field_select_1.setDisableFormBinding(new Boolean(true));
    _jspx_th_field_select_1.doTag();
    return false;
  }

  private class findInformsByTypeAndColor_jspxHelper
      extends org.apache.jasper.runtime.JspFragmentHelper
  {
    private javax.servlet.jsp.tagext.JspTag _jspx_parent;
    private int[] _jspx_push_body_count;

    public findInformsByTypeAndColor_jspxHelper( int discriminator, JspContext jspContext, javax.servlet.jsp.tagext.JspTag _jspx_parent, int[] _jspx_push_body_count ) {
      super( discriminator, jspContext, _jspx_parent );
      this._jspx_parent = _jspx_parent;
      this._jspx_push_body_count = _jspx_push_body_count;
    }
    public boolean invoke0( JspWriter out ) 
      throws Throwable
    {
      if (_jspx_meth_field_select_0((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      if (_jspx_meth_field_select_1((javax.servlet.jsp.tagext.JspTag) _jspx_parent, _jspx_page_context))
        return true;
      return false;
    }
    public void invoke( java.io.Writer writer )
      throws JspException
    {
      JspWriter out = null;
      if( writer != null ) {
        out = this.jspContext.pushBody(writer);
      } else {
        out = this.jspContext.getOut();
      }
      try {
        switch( this.discriminator ) {
          case 0:
            invoke0( out );
            break;
        }
      }
      catch( Throwable e ) {
        if (e instanceof SkipPageException)
            throw (SkipPageException) e;
        throw new JspException( e );
      }
      finally {
        if( writer != null ) {
          this.jspContext.popBody();
        }
      }
    }
  }
}
