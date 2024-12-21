package com.lib.book.shop.factory;

import com.lib.book.shop.dao.UserDao;
import com.lib.book.shop.dao.impl.JDBCUserDAO;

public class DAOFactory {
	private static UserDao userDao = null;
	static {
		userDao = new JDBCUserDAO();
	}

	public static UserDao getUserDao() {
		return userDao;
	}

}
