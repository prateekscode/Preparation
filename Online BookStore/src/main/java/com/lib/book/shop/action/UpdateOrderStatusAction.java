package com.lib.book.shop.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lib.book.shop.delegate.OrderDelegate;

public class UpdateOrderStatusAction {
	public String updateOrderStatus(HttpServletRequest req, HttpServletResponse res) {
		String page = "allOrdersDef.jsp";
		String orderId = req.getParameter("orderID");
		String status = req.getParameter("status");
		OrderDelegate.updateStatus(orderId, status);
		List orderList = OrderDelegate.getAllOrderInfo();
		if (orderList != null) {
			req.setAttribute("ORDER_FOUND", orderList);
		}
		return page;
	}
}
