package com.lib.book.shop.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lib.book.shop.delegate.BookDelegate;
import com.lib.book.shop.to.BookTO;
import com.lib.book.shop.validator.LibDataValidtor;

public class AddBookAction {
	public String addBookInfo(HttpServletRequest req, HttpServletResponse resp) {
		String page = "addBookDef.jsp";
		String bnm = req.getParameter("bname");
		String author = req.getParameter("author");
		String cost = req.getParameter("cost");
		String pub = req.getParameter("publication");
		String edi = req.getParameter("edition");
		float bcost = 0.0f;
		boolean convertCost = true;
		boolean intractWithDB = true;

		// Validated book name
		if (!LibDataValidtor.validateRequired(bnm)) {
			req.setAttribute("bname", "Book name is required");
			intractWithDB = false;
		} else if (!LibDataValidtor.minLength(bnm, 3)) {
			req.setAttribute("bname", "Book name must be minimum 3 character");
			intractWithDB = false;
		} else if (!LibDataValidtor.maxLength(bnm, 60)) {
			req.setAttribute("bname", "Book name must be maximum 60 character");
			intractWithDB = false;
		}

		// Validated author name
		if (!LibDataValidtor.validateRequired(author)) {
			req.setAttribute("author", "Author name is required");
			intractWithDB = false;
		} else if (!LibDataValidtor.minLength(author, 1)) {
			req.setAttribute("author", "Author name must be minimum 1 character");
			intractWithDB = false;
		} else if (!LibDataValidtor.maxLength(author, 50)) {
			req.setAttribute("author", "Author name must be maximum 50 character");
			intractWithDB = false;
		}
		if (!LibDataValidtor.validateRequired(cost)) {
			req.setAttribute("cost", "Cost is required.");
			intractWithDB = false;
			convertCost = false;
		}
		if (!LibDataValidtor.validateRequired(edi)) {
			req.setAttribute("edition", "Edition is required.");
			intractWithDB = false;
		}
		if (!LibDataValidtor.validateRequired(pub)) {
			req.setAttribute("publication", "Publication is required.");
			intractWithDB = false;
		}
		if (!LibDataValidtor.minLength(pub, 1)) {
			req.setAttribute("publication", "Publication name must be minimum 1 character");
			intractWithDB = false;
		}
		if (!LibDataValidtor.maxLength(pub, 50)) {
			req.setAttribute("publication", "Publication name must be maximum 50 character");
			intractWithDB = false;
		}
		if (convertCost) {
			try {
				bcost = Float.parseFloat(cost);
			} catch (NumberFormatException e) {
				req.setAttribute("cost", "Cost is not valid");
				intractWithDB = false;
			}
		}
		if (intractWithDB) {
			BookTO bto = new BookTO(bnm, author, pub, edi, bcost);
			if (BookDelegate.alreadyExist(bto)) {
				req.setAttribute("addingBookError", "Book information already available.");
			} else {
				boolean added=BookDelegate.addBook(bto);
				if(added) {
					req.setAttribute("addingBookError", "Book Information added successfully");
					req.setAttribute("SHOW_ADD_BOOK", "OK");	
				} else {
					req.setAttribute("addingBookError", "error in adding Book Information");
				}
			}
		}
		return page;
	}
}
