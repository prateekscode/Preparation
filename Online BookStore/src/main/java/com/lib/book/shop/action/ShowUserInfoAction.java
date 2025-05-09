package com.lib.book.shop.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lib.book.shop.delegate.OrderDelegate;
import com.lib.book.shop.delegate.UserDelegate;
import com.lib.book.shop.to.UserTO;

public class ShowUserInfoAction {
	public String getUserInfo(HttpServletRequest req, HttpServletResponse res) {
		String page = "allOrdersDef.jsp";
		String userId = req.getParameter("userID");
		UserTO uto = UserDelegate.getUserInfoById(userId);
		req.setAttribute("USER_INFO", uto);
		List orderList = null;
			orderList = OrderDelegate.getAllOrderInfo();
			if(orderList!=null) {
			req.setAttribute("ORDER_FOUND", orderList);
		}
		return page;
	}
}
