package com.lib.book.shop.action;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lib.book.shop.delegate.BookDelegate;
import com.lib.book.shop.to.BookTO;

public class AddBookToCartAction {
	public String addBookToCart(HttpServletRequest req, HttpServletResponse res) {
		String page = "searchBookDef.jsp";
		String bid = req.getParameter("bookId");
		int bookId = Integer.parseInt(bid);
		HttpSession sess = req.getSession();
		Object obj = sess.getAttribute("SELECTED_BOOK_LIST");
		Set selectedBookList = null;
		BookTO bto = null;
		if (obj != null) {
			selectedBookList = (Set) obj;
			Iterator it = selectedBookList.iterator();
			boolean avail = false;
			while (it.hasNext()) {
				BookTO bookTO = (BookTO) it.next();
				if (bookTO.getBookId() == bookId) {
					bto = bookTO;
					avail = false;
					break;
				}
			}
			if (!avail) {
				bto = BookDelegate.getBookById(bid);
			}
		} else {
			selectedBookList = new HashSet();
			bto = BookDelegate.getBookById(bid);
		}
		bto.setSelectedNumberOfBook(bto.getSelectedNumberOfBook() + 1);
		req.setAttribute("ADDED_TO_CART_MESSAGE", "ADDED");
		req.setAttribute("ADDED_BOOK", bto);
		selectedBookList.add(bto);
		sess.setAttribute("SELECTED_BOOK_LIST", selectedBookList);
		return page;
	}
}
