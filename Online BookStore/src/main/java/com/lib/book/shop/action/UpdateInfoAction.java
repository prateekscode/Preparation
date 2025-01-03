package com.lib.book.shop.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lib.book.shop.delegate.UserDelegate;
import com.lib.book.shop.to.UserTO;
import com.lib.book.shop.validator.LibDataValidtor;

public class UpdateInfoAction {
	public String updateUserInfo(HttpServletRequest req, HttpServletResponse res) {
		boolean isError = false;
		String page = "detailsDef.jsp";
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		req.setAttribute("EMAIL", email);
		req.setAttribute("Phone", phone);

		/* Validating Email */
		if (!LibDataValidtor.validateRequired(email)) {
			req.setAttribute("email", "Email is required");
			isError = true;
		} else if (!LibDataValidtor.maxLength(email, 32)) {
			req.setAttribute("email", "Email must be maximum 32 character");
			isError = true;
		} else if (!LibDataValidtor.validateEmail(email)) {
			req.setAttribute("email", "Please enter valid email id");
			isError = true;
		}

		// Validated phone
		if (!LibDataValidtor.validateRequired(phone)) {
			req.setAttribute("phone", "Phone is required");
			isError = true;
		} else if (!LibDataValidtor.validateLong(phone)) {
			req.setAttribute("phone", "Phone must be digits only");
			isError = true;
		} else if (!LibDataValidtor.minLength(phone, 10) && LibDataValidtor.minLength(phone, 10)) {
			req.setAttribute("phone", "Phone must be 10 digits only");
			isError = true;
		}

		if (!isError) {
			boolean updated = false;
			Object obj = req.getSession().getAttribute("USER_TO");
			UserTO uto = (UserTO) obj;
			updated = UserDelegate.updateUserInfo(uto.getUserId(), email, Long.parseLong(phone));
			if (updated) {
				req.setAttribute("updateError", "Information updated successfully");
				req.getSession().removeAttribute("EDIT_INFO");
				uto.setEmail(email);
				uto.setPhone(Long.parseLong(phone));
				req.getSession().setAttribute("USER_TO", uto);
			} else {
				req.setAttribute("updateError", "Error occures while updating the information.Please try later");
			}
		}
		return page;
	}
}