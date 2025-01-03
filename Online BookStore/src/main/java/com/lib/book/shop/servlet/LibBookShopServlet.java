package com.lib.book.shop.servlet;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lib.book.shop.action.AddBookAction;
import com.lib.book.shop.action.AllOrdersAction;
import com.lib.book.shop.action.CancelEditInfoAction;
import com.lib.book.shop.action.ChangePasswordAction;
import com.lib.book.shop.action.EditInfoAction;
import com.lib.book.shop.action.ForgetPasswordAction;
import com.lib.book.shop.action.LoginAction;
import com.lib.book.shop.action.LogoutAction;
import com.lib.book.shop.action.RegisterAction;
import com.lib.book.shop.action.ShowOrderInfoAction;
import com.lib.book.shop.action.ShowUserInfoAction;
import com.lib.book.shop.action.UpdateInfoAction;
import com.lib.book.shop.action.UpdateOrderStatusAction;

public class LibBookShopServlet extends HttpServlet {
	RegisterAction registerAction = null;
	LoginAction loginAction = null;
	LogoutAction logoutAction = null;
	ChangePasswordAction changePasswordAction = null;
	AddBookAction addBookAction = null;
	ForgetPasswordAction forgetPasswordAction = null;
	EditInfoAction editInfoAction = null;
	CancelEditInfoAction cancelEditInfoAction = null;
	UpdateInfoAction updateInfoAction = null;
	AllOrdersAction allOrdersAction = null;
	ShowOrderInfoAction showOrderInfoAction = null;
	ShowUserInfoAction showUserInfoAction = null;
	UpdateOrderStatusAction updateOrderStatusAction = null;

	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		registerAction = new RegisterAction();
		loginAction = new LoginAction();
		logoutAction = new LogoutAction();
		changePasswordAction = new ChangePasswordAction();
		addBookAction = new AddBookAction();
		forgetPasswordAction = new ForgetPasswordAction();
		editInfoAction = new EditInfoAction();
		cancelEditInfoAction = new CancelEditInfoAction();
		updateInfoAction = new UpdateInfoAction();
		allOrdersAction = new AllOrdersAction();
		updateOrderStatusAction = new UpdateOrderStatusAction();
		showOrderInfoAction = new ShowOrderInfoAction();
		showUserInfoAction = new ShowUserInfoAction();
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String uri = req.getRequestURI();
		String page = "";
		if (uri.endsWith("register.lib")) {
			page = registerAction.registerStudent(req, resp);
		} else if (uri.endsWith("login.lib")) {
			page = loginAction.verifyUser(req, resp);
		} else if (uri.endsWith("logout.lib")) {
			page = logoutAction.logout(req, resp);
		} else if (uri.endsWith("changePassword.lib")) {
			page = changePasswordAction.changePassword(req, resp);
		} else if (uri.endsWith("addBook.lib")) {
			page = addBookAction.addBookInfo(req, resp);
		} else if (uri.endsWith("forgetPassword.lib")) {
			page = forgetPasswordAction.searchPassword(req, resp);
		} else if (uri.endsWith("editinfo.lib")) {
			page = editInfoAction.makeEditable(req, resp);
		} else if (uri.endsWith("cancleedit.lib")) {
			page = cancelEditInfoAction.cancelEditInfo(req, resp);
		} else if (uri.endsWith("updateinfo.lib")) {
			page = updateInfoAction.updateUserInfo(req, resp);
		} else if (uri.endsWith("allorders.lib")) {
			page = allOrdersAction.getAllOrders(req, resp);
		} else if (uri.endsWith("updatestatus.lib")) {
			page = updateOrderStatusAction.updateOrderStatus(req, resp);
		} else if (uri.endsWith("showorderinfo.lib")) {
			page = showOrderInfoAction.getOrderInfo(req, resp);
		}
		req.getRequestDispatcher(page).forward(req, resp);
	}
}
