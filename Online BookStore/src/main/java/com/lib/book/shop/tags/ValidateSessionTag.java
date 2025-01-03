package com.lib.book.shop.tags;

import java.io.Writer;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;

import org.apache.log4j.Logger;
import javax.servlet.jsp.tagext.TagSupport;

public class ValidateSessionTag extends TagSupport {
	Logger log = Logger.getLogger(this.getClass());

	public int doendTag() throws JspException {
		try {
			HttpServletRequest req = (HttpServletRequest) pageContext.getRequest();
			HttpServletResponse res = (HttpServletResponse) pageContext.getResponse();
			if (req.getSession().getAttribute("USER_TO") == null) {
				req.setAttribute("loginError", "Session timeout. Please login again");
				req.getRequestDispatcher("index.jsp").forward(req, res);
			}
		} catch (Exception e) {
			log.error("Exception in ValidateSessionTag\n", e);
		}
		return EVAL_PAGE;
	}
}