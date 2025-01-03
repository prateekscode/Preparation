package com.lib.book.shop.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lib.book.shop.delegate.UserDelegate;
import com.lib.book.shop.validator.LibDataValidtor;

public class ForgetPasswordAction {
	public String searchPassword(HttpServletRequest req, HttpServletResponse res) {
		String page = "forgetPasswordDef.jsp";
		String uname = req.getParameter("uname");
		String email = req.getParameter("email");
		boolean intractWithDB=true;

		if (!LibDataValidtor.validateRequired(uname)) {
			req.setAttribute("uname", "Username is required");
			intractWithDB = false;
		}
		
		if (!LibDataValidtor.validateRequired(email)) {
			req.setAttribute("email", "Email is required");
			intractWithDB = false;
		}
		
		else if (!LibDataValidtor.validateEmail(email)) {
			req.setAttribute("email", "Please enter a valid email id");
			intractWithDB = false;
		}
		
		if(intractWithDB) {
			String password=UserDelegate.searchPassword(uname, email);
			if(password!=null) {
				req.setAttribute("PASSWORD", password);
			}else {
				req.setAttribute("forgetPasswordError", "Provided information is invalid");
			}
		}
		return page;
	}
}
