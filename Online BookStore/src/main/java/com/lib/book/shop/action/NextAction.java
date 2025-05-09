package com.lib.book.shop.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lib.book.shop.delegate.BookDelegate;
import com.lib.book.shop.to.BookTO;
import com.lib.book.shop.util.BookUtil;

public class NextAction {
	public String searchBookInfo(HttpServletRequest req, HttpServletResponse res) {
		String page = "searchBookDef.jsp";
		HttpSession sess = req.getSession();
		String bnm = sess.getAttribute("BOOK_NAME").toString();
		String author = sess.getAttribute("AUTHOR").toString();
		String pub = sess.getAttribute("PUBLICATION").toString();
		String edi = sess.getAttribute("EDITION").toString();
		int start = Integer.parseInt(sess.getAttribute("START").toString());
		String str = sess.getAttribute("COST").toString();
		float bcost = 0.0f;

		if (str.length() > 0)
			bcost = Float.parseFloat(str);
		BookTO bto = new BookTO(bnm, author, pub, edi, bcost);
		int total = BookDelegate.getTotalNumberOfBook(bto);
		int noBook = BookUtil.NUMBER_OF_BOOK;
		start = start + noBook;
		int end = start + noBook;
		if (total <= end) {
			end = total;
		}
		sess.setAttribute("START", new Integer(start));
		sess.setAttribute("TOTAL", new Integer(total));
		sess.setAttribute("END", new Integer(end));
		List bookList = BookDelegate.searchBook(bto, start, noBook);
		sess.setAttribute("BOOK_LIST", bookList);
		return page;
	}
}
