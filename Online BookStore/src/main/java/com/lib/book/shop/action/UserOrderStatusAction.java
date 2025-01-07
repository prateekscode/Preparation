package com.lib.book.shop.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lib.book.shop.delegate.OrderDelegate;
import com.lib.book.shop.to.UserTO;

public class UserOrderStatusAction {
	public String getUserOrderStatus(HttpServletRequest req, HttpServletResponse res) {
		String page = "userOrderStatusDef.jsp";
		Object obj = req.getSession().getAttribute("USER_TO");
		UserTO uto = (UserTO) obj;

		List orderList = OrderDelegate.getOrderByUserId(uto.getUserId());
		if (orderList != null) {
			req.setAttribute("ORDER_FOUND", orderList);
		}
		return page;
	}
}
