package com.lib.book.shop.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lib.book.shop.delegate.UserDelegate;
import com.lib.book.shop.to.UserTO;
import com.lib.book.shop.validator.LibDataValidtor;

public class RegisterAction {
	public String registerStudent(HttpServletRequest req, HttpServletResponse res) {
		boolean isError = false;
		String page = "registerDef.jsp";
		String fname = req.getParameter("fname");
		String mname = req.getParameter("mname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String phone = req.getParameter("phone");
		String gender = req.getParameter("gender");
		String username = req.getParameter("uname");
		String password = req.getParameter("pass");

		// Validated first name
		if (!LibDataValidtor.validateRequired(fname)) {
			req.setAttribute("fname", "First name is required");
			isError = true;
		} else if (!LibDataValidtor.validateFirstCharacterAsUpper(fname)) {
			req.setAttribute("fname", "First name must starts with capital letter");
			isError = true;
		} else if (!LibDataValidtor.minLength(fname, 3)) {
			req.setAttribute("fname", "First name must be minimum 3 character");
			isError = true;
		} else if (!LibDataValidtor.maxLength(fname, 10)) {
			req.setAttribute("fname", "First name must be maximum 10 character");
			isError = true;
		} else if (!LibDataValidtor.validateName(fname)) {
			req.setAttribute("fname", "First name must be only character");
			isError = true;
		}

		// Validated middle name
		if (mname != null && mname.length() > 0) {
			if (!LibDataValidtor.validateFirstCharacterAsUpper(mname)) {
				req.setAttribute("mname", "Middle name must starts with capital letter");
				isError = true;
			} else if (!LibDataValidtor.minLength(mname, 1)) {
				req.setAttribute("mname", "Middle name must be minimum 1 character");
				isError = true;
			} else if (!LibDataValidtor.maxLength(mname, 10)) {
				req.setAttribute("mname", "Middle name must be maximum 10 character");
				isError = true;
			} else if (!LibDataValidtor.validateName(mname)) {
				req.setAttribute("mname", "Middle name must be only character");
				isError = true;
			}
		}
		// Validated Last Name
		if (mname != null && mname.length() > 0) {

			if (!LibDataValidtor.validateFirstCharacterAsUpper(lname)) {
				req.setAttribute("lname", "Last name must starts with capital letter");
				isError = true;
			} else if (!LibDataValidtor.minLength(lname, 3)) {
				req.setAttribute("lname", "Last name must be minimum 1 character");
				isError = true;
			} else if (!LibDataValidtor.maxLength(lname, 10)) {
				req.setAttribute("lname", "Last name must be maximum 10 character");
				isError = true;
			} else if (!LibDataValidtor.validateName(lname)) {
				req.setAttribute("lname", "Last name must be only character");
				isError = true;
			}
		}

		// Validated Email
		if (!LibDataValidtor.validateRequired(email)) {
			req.setAttribute("email", "Email is required");
			isError = true;
		} else if (!LibDataValidtor.maxLength(email, 32)) {
			req.setAttribute("mname", "Middle name must be maximum 32 character");
			isError = true;
		} else if (!LibDataValidtor.validateEmail(email)) {
			req.setAttribute("email", "Please enter valid email id");
			isError = true;
		}

		// Validated Phone
		if (!LibDataValidtor.validateRequired(phone)) {
			req.setAttribute("phone", "Phone is required");
			isError = true;
		} else if (!LibDataValidtor.validateLong(phone)) {
			req.setAttribute("phone", "Middle name must be maximum 32 character");
			isError = true;
		} else if (!(LibDataValidtor.minLength(phone, 10) && LibDataValidtor.minLength(phone, 10))) {
			req.setAttribute("phone", "Phone must be 10 digits");
			isError = true;
		}

		// Validated Gender
		if (!LibDataValidtor.validateRequired(gender)) {
			req.setAttribute("gender", "Please select the gender");
			isError = true;
		}

		// Validated Username
		if (!LibDataValidtor.validateRequired(username)) {
			req.setAttribute("uname", "Username is required");
			isError = true;
		} else if (!LibDataValidtor.minLength(username, 6)) {
			req.setAttribute("phone", "Username must be minimum 6 character long");
			isError = true;
		} else if (!LibDataValidtor.maxLength(username, 8)) {
			req.setAttribute("phone", "Username must be maximum 8 character long");
			isError = true;
		} else if (UserDelegate.alreadyExist(username)) {
			req.setAttribute("unane", "Username is already used.Please use different username");
			isError = true;
		}

		// validated password
		if (!LibDataValidtor.validateRequired(password)) {
			req.setAttribute("pass", "Password is required");
			isError = true;
		} else if (!LibDataValidtor.minLength(password, 3)) {
			req.setAttribute("pass", "Password must be minimum 3 character long");
			isError = true;
		} else if (!LibDataValidtor.maxLength(password, 15)) {
			req.setAttribute("pass", "Password must be maximum 15 character long");
			isError = true;
		}
		if (!isError) {
			boolean registered = false;
			UserTO uto = new UserTO(fname, mname, lname, email, Long.parseLong(phone), username, password, "User");
			registered = UserDelegate.registerUser(uto);
			if (registered) {
				req.setAttribute("registrationError", "Registration Completes Successfully");
			} else {
				req.setAttribute("REGISTERED", "OK");
				req.setAttribute("registrationError", "Error happened in registration.Please try later");
			}
		}
		return page;
	}
}