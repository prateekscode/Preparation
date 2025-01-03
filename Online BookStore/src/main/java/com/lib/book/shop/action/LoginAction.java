package com.lib.book.shop.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lib.book.shop.delegate.UserDelegate;
import com.lib.book.shop.to.UserTO;
import com.lib.book.shop.validator.LibDataValidtor;

public class LoginAction {
	public String verifyUser(HttpServletRequest req, HttpServletResponse resp) {
		String page="index.jsp";
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
	boolean intractWithDB=true;
	if(!LibDataValidtor.validateRequired(uname)) {
		req.setAttribute("uname", "Username is required");
		intractWithDB=false;
	}
	if(intractWithDB) {
		UserTO uto=UserDelegate.verifyUser(uname, pass);
		if(uto!=null) {
			req.getSession().setAttribute("USER_TO", uto);
			page="userHomeDef.jsp";
		}else {
			req.setAttribute("loginerror", "Username or Password is invalid");
		}
	}
		return page;
	}
}
