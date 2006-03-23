package com.opensymphony.webwork.components;

import com.opensymphony.xwork.util.OgnlValueStack;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * <!-- START SNIPPET: javadoc -->
 * Renders an HTML LABEL that will allow you to output label:name combination that has the same format treatment as
 * the rest of your UI controls.</p>
 * <!-- END SNIPPET: javadoc -->
 *
 * <p/> <b>Examples</b>
 * <p/>
 * <!-- START SNIPPET: exdescription -->
 * In this example, a label is rendered. The label is retrieved from a ResourceBundle by calling ActionSupport's
 * getText() method giving you an output of 'User Name:tm_jee'. Assuming that i18n message user_name corresponds
 * to 'User Name' and the action's getUserName() method returns 'tm_jee'<p/>
 * <!-- END SNIPPET: exdescription -->
 * <pre>
 * <!-- START SNIPPET: example -->
 * &lt;ww:label label="%{text('user_name')}" name="userName" /&gt;
 * <!-- END SNIPPET: example -->
 * </pre>
 *
 * @author Patrick Lightbody
 * @author Rene Gielen
 * @version $Revision: 1.11 $
 * @since 2.2
 *
 * @ww.tag name="label" tld-body-content="JSP" tld-tag-class="com.opensymphony.webwork.views.jsp.ui.LabelTag"
 * description="Render a label that displays read-only information"
  */
public class Label extends UIBean {
    final public static String TEMPLATE = "label";

    protected String forAttr;

    public Label(OgnlValueStack stack, HttpServletRequest request, HttpServletResponse response) {
        super(stack, request, response);
    }

    protected String getDefaultTemplate() {
        return TEMPLATE;
    }

    protected void evaluateExtraParams() {
        super.evaluateExtraParams();

        if (forAttr != null) {
            addParameter("for", findString(forAttr));
        }

        // try value first, then name (this overrides the default behavior in the superclass)
        if (value != null) {
            addParameter("nameValue", findString(value));
        } else if (name != null) {
            String expr = name;
            if (altSyntax()) {
                expr = "%{" + expr + "}";
            }

            addParameter("nameValue", findString(expr));
        }
    }

    /**
     * HTML for attribute
     * @ww.tagattribute required="false"
     */
    public void setFor(String forAttr) {
        this.forAttr = forAttr;
    }
}
