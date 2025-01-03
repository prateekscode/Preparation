package com.lib.book.shop.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lib.book.shop.delegate.UserDelegate;
import com.lib.book.shop.to.UserTO;
import com.lib.book.shop.validator.LibDataValidtor;

public class ChangePasswordAction {
	public String changePassword(HttpServletRequest req, HttpServletResponse res) {
		String page = "changePasswordDef.jsp";
		String newpass = req.getParameter("newpass");
		String currpass = req.getParameter("currpass");
		String confpass = req.getParameter("confpass");

		boolean compareEquals = true;
		boolean intractWithDB = true;

		// Validated new password
		if (!LibDataValidtor.validateRequired(newpass)) {
			req.setAttribute("newpass", "New Password is required");
			intractWithDB = false;
			compareEquals = false;
		} else if (!LibDataValidtor.minLength(newpass, 3)) {
			req.setAttribute("newpass", "New Password must be minimum 3 character");
			intractWithDB = false;
			compareEquals = false;
		} else if (!LibDataValidtor.maxLength(newpass, 15)) {
			req.setAttribute("newpass", "New Password must be maximum 15 character");
			intractWithDB = false;
			compareEquals = false;
		}

		// Validated current password
		if (!LibDataValidtor.validateRequired(currpass)) {
			req.setAttribute("currpass", "Current Password is required");
			intractWithDB = false;
			compareEquals = false;
		}

		// Validated confirm password
		if (!LibDataValidtor.validateRequired(confpass)) {
			req.setAttribute("confpass", "Confirm Password is required");
			intractWithDB = false;
			compareEquals = false;
		} else if (!LibDataValidtor.minLength(confpass, 3)) {
			req.setAttribute("confpass", "Confirm Password must be minimum 3 character");
			intractWithDB = false;
			compareEquals = false;
		} else if (!LibDataValidtor.maxLength(confpass, 15)) {
			req.setAttribute("confpass", "Confirm Password must be maximum 15 character");
			intractWithDB = false;
			compareEquals = false;
		}

		if (compareEquals) {
			if (!newpass.equals(confpass)) {
				intractWithDB = false;
				req.setAttribute("changePasswordError", "New and Confirm Password does not matched");
			}
		}

		if (intractWithDB) {
			Object obj = req.getSession().getAttribute("USER_TO");
			UserTO usto = (UserTO) obj;
			if (currpass.equals(usto.getPassword())) {
				UserTO uto = UserDelegate.changePassword(usto, newpass);
				if (uto != null) {
					req.getSession().setAttribute("USER_TO", uto);
					req.setAttribute("changePasswordError", "Password Updated Successfully");
					req.setAttribute("CHANGED_PASSWORD", "OK");
				} else {
					req.setAttribute("changePasswordError", "Error in changing password");
				}
			} else {
				req.setAttribute("changePasswordError", "Current Pasword is invalid");
			}
		}
		return page;
	}
}
