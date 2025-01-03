package com.lib.book.shop.delegate;

import java.util.List;

import com.lib.book.shop.dao.BookDAO;
import com.lib.book.shop.factory.DAOFactory;
import com.lib.book.shop.to.BookTO;

public class BookDelegate {
	private static BookDAO bookDAO = null;
	static {
		bookDAO = DAOFactory.getBookDao();
	}

	public static boolean addBook(BookTO bto) {
		return bookDAO.addBook(bto);
	}

	public static boolean alreadyExist(BookTO bto) {
		return bookDAO.alreadyExist(bto);
	}

	public static List searchBook(BookTO bto, int start, int numberOfBook) {
		return bookDAO.searchBook(bto, start, numberOfBook);
	}

	public static int getTotalNumberOfBook(BookTO bto) {
		return bookDAO.getTotalNumberOfBook(bto);
	}

	public static boolean deleteBook(int bookId) {
		return bookDAO.deleteBook(bookId);
	}

	public static BookTO getBookById(String bid) {
		return bookDAO.getBookById(bid);
	}
}
