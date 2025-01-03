package com.lib.book.shop.tags;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionValidatorFilter {
	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest hReq = (HttpServletRequest) req;
		String uri = hReq.getRequestURI();
		if (uri.endsWith("login.lib") || uri.endsWith("register.lib") || uri.endsWith("forgetPassword.lib")) {
			chain.doFilter(req, res);
		} else {
			HttpSession sess = hReq.getSession(false);
			if (sess == null) {
				req.setAttribute("loginError", "Session timeout.Please login again");
				req.getRequestDispatcher("index.jsp").forward(req, res);
			} else {
				chain.doFilter(req, res);
			}
		}
	}
	public void init(FilterConfig arg0) throws ServletException {

	}
}
