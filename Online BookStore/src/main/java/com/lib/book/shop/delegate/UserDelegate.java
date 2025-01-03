package com.lib.book.shop.delegate;

import com.lib.book.shop.dao.UserDAO;
import com.lib.book.shop.factory.DAOFactory;
import com.lib.book.shop.to.UserTO;

public class UserDelegate {
	private static UserDAO userDAO=null;
	
	static {
		userDAO =DAOFactory.getUserDao();
	}

	public static UserTO verifyUser(String username,String password) {
		return userDAO.verifyUser(username, password);
	}
	
	public static UserTO changePassword(UserTO usto,String password) {
		return userDAO.changePassword(usto, password);
	}
	
	public static String searchPassword(String username,String email) {
		return userDAO.searchPassword(username, email);
	}
	
	public static boolean registerUser(UserTO uto) {
		return userDAO.registerUser(uto);
	}
	
	public static boolean alreadyExist(String username) {
		return userDAO.alreadyExist(username);
	}
	
	public static boolean updateUserInfo(String userId, String email, long phone) {
		return userDAO.updateUserInfo(userId,email,phone);
	}
	
	public static UserTO getUserInfoById(String userId) {
		return userDAO.getUserInfoById(userId);
	}
}
