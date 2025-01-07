package com.lib.book.shop.action;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lib.book.shop.delegate.BookDelegate;
import com.lib.book.shop.to.BookTO;
import com.lib.book.shop.validator.LibDataValidtor;

public class RemoveFromCartAction {
	public String removeFromCart(HttpServletRequest req, HttpServletResponse res) {
		String page = "showCartDef.jsp";
		String bid = req.getParameter("bookId");

		if (!LibDataValidtor.validateRequired(bid)) {
			req.setAttribute("bookId", "Please select book to remove");
		} else {
			int bookId = Integer.parseInt(bid);
			HttpSession sess = req.getSession();
			Object obj = sess.getAttribute("SELECTED_BOOK_LIST");
			Set selectedBookList = null;
			BookTO bto = null;
			if (obj != null) {
				selectedBookList = (Set) obj;
				Iterator it = selectedBookList.iterator();
				while (it.hasNext()) {
					BookTO bookTO = (BookTO) it.next();
					if (bookTO.getBookId() == bookId) {
						bto = bookTO;
						it.remove();
						break;
					}
				}
				if (selectedBookList.size() > 0) {
					sess.setAttribute("SELECTED_BOOK_LIST", selectedBookList);
				} else {
					sess.removeAttribute("SELECTED_BOOK_LIST");
					req.setAttribute("REMOVED_TOTAL", "Book Removed from cart. No book available in cart");
				}
				req.setAttribute("REMOVED_BOOK", bto);
			}
		}
		return page;
	}
}
