package com.lib.book.shop.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lib.book.shop.delegate.BookDelegate;
import com.lib.book.shop.to.BookTO;
import com.lib.book.shop.util.BookUtil;

public class DeleteBookAction {
	public String deleteBook(HttpServletRequest req, HttpServletResponse res) {
		String page = "searchBookDef.jsp";
		String bid = req.getParameter("bookId");
		HttpSession sess = req.getSession();
		String bnm = sess.getAttribute("BOOK_NAME").toString();
		String author = sess.getAttribute("AUTHOR").toString();
		String pub = sess.getAttribute("PUBLICATION").toString();
		String edi = sess.getAttribute("EDITION").toString();
		int start = Integer.parseInt(sess.getAttribute("START").toString());
		int end = Integer.parseInt(sess.getAttribute("END").toString());
		String str = sess.getAttribute("COST").toString();
		float bcost = 0.0f;

		if (str.length() > 0)
			bcost = Float.parseFloat(str);
		boolean deleted = BookDelegate.deleteBook(Integer.parseInt(bid));
		if (deleted) {
			BookTO bto = new BookTO(bnm, author, pub, edi, bcost);
			int total = BookDelegate.getTotalNumberOfBook(bto);
			if (total > 0) {
				if (total <= end) {
					end = total;
				}
				if (start + 1 > total)
					start = start - BookUtil.NUMBER_OF_BOOK;
				sess.setAttribute("START", new Integer(start));
				sess.setAttribute("TOTAL", new Integer(total));
				sess.setAttribute("END", new Integer(end));

				List bookList = BookDelegate.searchBook(bto, start, BookUtil.NUMBER_OF_BOOK);
				sess.setAttribute("BOOK_LIST", bookList);
				req.setAttribute("DELETE_MESSAGE", "Book information deleted succesfully");
			} else {
				req.setAttribute("searchingBookError", "No book found with specified information");
				sess.removeAttribute("BOOK_LIST");
			}
		} else {
			req.setAttribute("DELELTE_MESSAGE", "Error in deleting book information.");
		}
		return page;
	}
}
