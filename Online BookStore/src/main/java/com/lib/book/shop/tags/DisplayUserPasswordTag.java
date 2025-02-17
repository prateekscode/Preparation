package com.lib.book.shop.tags;

import java.io.Writer;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.lib.book.shop.to.UserTO;

public class DisplayUserPasswordTag extends TagSupport {
	Logger log = LogManager.getLogger(this.getClass());

	public int doendTag() throws JspException {
		try {
			HttpSession sess = (HttpSession) pageContext.getSession();
			Object obj = sess.getAttribute("USER_TO");
			if (obj != null) {
				UserTO uto = (UserTO) obj;
				int l = uto.getPassword().length();
				Writer out = pageContext.getOut();
				for (int i = 0; i < l; i++) {
					out.write("*");
				}
			}
		} catch (Exception e) {
			log.error("Exception in ValidateSessionTag\n", e);
		}
		return EVAL_PAGE;
	}

}
