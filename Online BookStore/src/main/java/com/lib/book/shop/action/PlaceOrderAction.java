package com.lib.book.shop.action;

import java.util.Calendar;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.lib.book.shop.delegate.BookDelegate;
import com.lib.book.shop.delegate.OrderDelegate;
import com.lib.book.shop.to.BookTO;
import com.lib.book.shop.to.OrderTO;
import com.lib.book.shop.to.UserTO;
import com.lib.book.shop.util.GetTotalAmount;
import com.lib.book.shop.validator.LibDataValidtor;

public class PlaceOrderAction {
	public String placeOrder(HttpServletRequest req, HttpServletResponse resp) {
		String page = "placeOrderDef.jsp";
		boolean isError = false;
		String address = req.getParameter("address");
		String street = req.getParameter("street");
		String city = req.getParameter("city");
		String state = req.getParameter("state");
		String country = req.getParameter("country");
		String zip = req.getParameter("zip");
		String cardNo = req.getParameter("cardNo");
		String pin = req.getParameter("pin");
		String cardExp = req.getParameter("cardExp");

		// Validated address
		if (!LibDataValidtor.validateRequired(address)) {
			req.setAttribute("address", "Address is required");
			isError = true;
		} else if (!LibDataValidtor.minLength(address, 3)) {
			req.setAttribute("address", "Address must be minimum 3 character");
			isError = true;
		} else if (!LibDataValidtor.maxLength(address, 40)) {
			req.setAttribute("address", "Address must be maximum 40 character");
			isError = true;
		}

		// Validated street
		if (!LibDataValidtor.validateRequired(street)) {
			req.setAttribute("street", "Street name is required");
			isError = true;
		} else if (!LibDataValidtor.minLength(street, 1)) {
			req.setAttribute("street", "Street name must be minimum 1 character");
			isError = true;
		} else if (!LibDataValidtor.maxLength(street, 30)) {
			req.setAttribute("street", "Street name must be maximum 30 character");
			isError = true;
		}

		// validated city
		if (!LibDataValidtor.validateRequired(city)) {
			req.setAttribute("city", "City is required.");
			isError = true;
		} else if (!LibDataValidtor.minLength(city, 1)) {
			req.setAttribute("city", "City name must be minimum 1 character");
			isError = true;
		} else if (!LibDataValidtor.maxLength(city, 30)) {
			req.setAttribute("city", "City name must be maximum 30 character");
			isError = true;
		}

		// validated state
		if (!LibDataValidtor.validateRequired(state)) {
			req.setAttribute("state", "State is required.");
			isError = true;
		} else if (!LibDataValidtor.minLength(state, 1)) {
			req.setAttribute("state", "State name must be minimum 1 character");
			isError = true;
		} else if (!LibDataValidtor.maxLength(state, 20)) {
			req.setAttribute("state", "State name must be maximum 30 character");
			isError = true;
		}

		// validated country
		if (!LibDataValidtor.validateRequired(country)) {
			req.setAttribute("country", "Country is required.");
			isError = true;
		} else if (!LibDataValidtor.minLength(country, 1)) {
			req.setAttribute("country", "Country name must be minimum 1 character");
			isError = true;
		} else if (!LibDataValidtor.maxLength(country, 20)) {
			req.setAttribute("country", "Country name must be maximum 20 character");
			isError = true;
		}

		// validated zip
		if (!LibDataValidtor.validateRequired(zip)) {
			req.setAttribute("zip", "Zip is required.");
			isError = true;
		} else if (!LibDataValidtor.validateLong(zip)) {
			req.setAttribute("zip", "Zip must be digits only");
			isError = true;
		} else if (!LibDataValidtor.minLength(zip, 6)) {
			req.setAttribute("zip", "Zip  must be 6 digits only");
			isError = true;
		} else if (!LibDataValidtor.maxLength(zip, 6)) {
			req.setAttribute("zip", "Zip must be 6 digits only");
			isError = true;
		}

		// validated card number
		if (!LibDataValidtor.validateRequired(cardNo)) {
			req.setAttribute("cardNo", "Card No. is required.");
			isError = true;
		} else if (!LibDataValidtor.validateLong(cardNo)) {
			req.setAttribute("cardNo", "Card No must be digits only");
			isError = true;
		} else if (!LibDataValidtor.minLength(cardNo, 16)) {
			req.setAttribute("cardNo", "Card No must be 16 digits only");
			isError = true;
		} else if (!LibDataValidtor.maxLength(cardNo, 16)) {
			req.setAttribute("cardNo", "Card No must be 16 digits only");
			isError = true;
		}

		// validated secret pin
		if (!LibDataValidtor.validateRequired(pin)) {
			req.setAttribute("pin", "Secret pin is required.");
			isError = true;
		} else if (!LibDataValidtor.validateLong(pin)) {
			req.setAttribute("pin", "Secret pin must be digits only");
			isError = true;
		} else if (!LibDataValidtor.minLength(pin, 4)) {
			req.setAttribute("pin", "Secret pin must be 4 digits only");
			isError = true;
		} else if (!LibDataValidtor.maxLength(pin, 16)) {
			req.setAttribute("pin", "Secret pin must be 4 digits only");
			isError = true;
		}

		// validated expiry date
		if (!LibDataValidtor.validateRequired(cardExp)) {
			req.setAttribute("cardExp", "Expiry date is required.");
			isError = true;
		} else if (!LibDataValidtor.minLength(cardExp, 6)) {
			req.setAttribute("cardExp", "Not a valid expiry date");
			isError = true;
		} else if (!LibDataValidtor.maxLength(cardExp, 7)) {
			req.setAttribute("cardExp", "Not a valid expiry date");
			isError = true;
		} else if (!LibDataValidtor.validateExpDate(cardExp)) {
			req.setAttribute("cardExp", "Not a valid expiry date");
			isError = true;
		}

		if (!isError) {
			String orderDate = Calendar.getInstance().get(Calendar.DATE) + "/"
					+ (Calendar.getInstance().get(Calendar.MONTH) + 1) + "/"
					+ Calendar.getInstance().get(Calendar.YEAR);

			Set orderItemList = (Set) req.getSession().getAttribute("SELECTED_BOOK_LIST");

			float totalAmount = 0.0f;
			int totalItem = 0;
			Object obj = req.getSession().getAttribute("TOTAL_BOOK_QUANTITY");
			if (obj != null) {
				Integer i = (Integer) obj;
				totalItem = i.intValue();
			}
			obj = req.getSession().getAttribute("TOTAL_BOOK_AMOUNT");
			if (obj != null) {
				Double d = (Double) obj;
				totalAmount = Float.parseFloat(GetTotalAmount.getTotalAmount(d.toString()));
			}
			UserTO userTo = (UserTO) req.getSession().getAttribute("USER_TO");
			OrderTO oto = new OrderTO();
			oto.setAddress(address);
			oto.setCardNo(cardNo);
			oto.setCity(city);
			oto.setCountry(country);
			oto.setUserId(userTo.getUserId());
			oto.setExpDate(cardExp);
			oto.setOrderDate(orderDate);
			oto.setOrderItemList(orderItemList);
			oto.setState(state);
			oto.setStreet(street);
			oto.setTotalAmount(totalAmount);
			oto.setTotalItem(totalItem);
			oto.setZip(zip);

			String orderId = OrderDelegate.placeOrder(oto, req.getRemoteAddr());
			if (orderId != null) {
				req.setAttribute("ORDER_PLACED", orderId);
				HttpSession sess = req.getSession();
				sess.removeAttribute("TOTAL_BOOK_AMOUNT");
				sess.removeAttribute("TOTAL_BOOK_QUANTITY");
			} else {
				req.setAttribute("errorInOrder", "Error occured while placing order. Please try later");
			}
		}
		return page;
	}
}
