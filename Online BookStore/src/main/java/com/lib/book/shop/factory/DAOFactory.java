package com.lib.book.shop.factory;

import com.lib.book.shop.dao.BookDAO;
import com.lib.book.shop.dao.OrderDAO;
import com.lib.book.shop.dao.UserDAO;
import com.lib.book.shop.dao.impl.JDBCBookDAO;
import com.lib.book.shop.dao.impl.JDBCOrderDAO;
import com.lib.book.shop.dao.impl.JDBCUserDAO;

public class DAOFactory {
	private static UserDAO userDao = null;
	private static BookDAO bookDao = null;
	private static OrderDAO orderDao = null;

	static {
		userDao = new JDBCUserDAO();
		bookDao = new JDBCBookDAO();
		orderDao = new JDBCOrderDAO();
	}

	public static UserDAO getUserDao() {
		return userDao;
	}

	public static BookDAO getBookDao() {
		return bookDao;
	}

	public static OrderDAO getOrderDAO() {
		return orderDao;
	}
}
