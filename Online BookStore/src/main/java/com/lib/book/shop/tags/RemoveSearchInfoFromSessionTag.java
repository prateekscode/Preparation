package com.lib.book.shop.tags;

import javax.servlet.http.HttpSession;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class RemoveSearchInfoFromSessionTag extends TagSupport {
	Logger log = LogManager.getLogger(this.getClass());

	public int doendTag() throws JspException {
		try {
			HttpSession sess = pageContext.getSession();
			if (sess != null) {
				sess.removeAttribute("BOOK_LIST");
				sess.removeAttribute("BOOK_NAME");
				sess.removeAttribute("AUTHOR");
				sess.removeAttribute("PUBLICATION");
				sess.removeAttribute("COST");
				sess.removeAttribute("EDITION");
				sess.removeAttribute("START");
				sess.removeAttribute("END");
				sess.removeAttribute("TOTAL");
				sess.removeAttribute("SELECTED_BOOK_LIST");
				sess.removeAttribute("TOTAL_BOOK_AMOUNT");
				sess.removeAttribute("TOTAL_BOOK_QUANTITY");
			}
		} catch (Exception e) {
			log.error("Exception in RemoveSearchInfoFromSessionTag\n", e);
		}
		return EVAL_PAGE;
	}
}
