package com.lib.book.shop.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LogoutAction {
	public String logout(HttpServletRequest req, HttpServletResponse resp) {
		String page = "index.jsp";
		req.getSession().invalidate();
		req.setAttribute("loginError", "You have logged out successfully");
		return page;
	}
}
