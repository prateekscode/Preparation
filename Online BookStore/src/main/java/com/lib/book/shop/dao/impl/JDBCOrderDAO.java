package com.lib.book.shop.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import org.apache.log4j.Logger;

import com.lib.book.shop.dao.OrderDAO;
import com.lib.book.shop.to.BookTO;
import com.lib.book.shop.to.OrderTO;
import com.lib.book.shop.to.UserTO;
import com.lib.book.shop.util.JDBCUtil;

public class JDBCOrderDAO implements OrderDAO {

	Logger log = Logger.getLogger(this.getClass());

	@Override
	public String placeOrder(OrderTO oto, String ip) {
		String orderId = null;
		Connection con = null;
		PreparedStatement st = null;

		try {
			con = JDBCUtil.getConnection();
			st = con.prepareStatement("insert into order_table values(?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			orderId = getOrderId(oto.getOrderDate(), ip);
			st.setString(1, orderId);
			st.setString(2, oto.getAddress());
			st.setString(3, oto.getStreet());
			st.setString(4, oto.getCity());
			st.setString(5, oto.getState());
			st.setString(6, oto.getCountry());
			st.setString(7, oto.getZip());
			st.setString(8, oto.getCardNo());
			st.setString(9, oto.getExpDate());
			st.setFloat(10, oto.getTotalAmount());
			st.setInt(11, oto.getTotalItem());
			st.setString(12, oto.getUserId());
			st.setString(13, oto.getOrderDate());
			st.setString(14, "New");
			int ab = st.executeUpdate();

			if (ab > 0) {
				PreparedStatement ps = con
						.prepareStatement("insert into orderItem_table(bookId,quantity,orderId) values(?,?,?)");
				Iterator it = oto.getOrderItemList().iterator();
				while (it.hasNext()) {
					BookTO bto = (BookTO) it.next();
					ps.setInt(1, bto.getBookId());
					ps.setInt(2, bto.getSelectedNumberOfBook());
					ps.setString(3, orderId);
					ps.addBatch();
				}
				int x[] = ps.executeBatch();
			}
			con.commit();
		} catch (Exception e) {
			orderId = null;
			try {
				con.rollback();
			} catch (Exception e1) {
				log.error("Error in rollback in placeOrder\t:", e1);
			}
			log.error("Error in placeOrder\t:", e);
		} finally {
			JDBCUtil.close(null, st, con);
		}
		return orderId;
	}

	@Override
	public List getOrderByUserId(String userId) {
		List orderList = null;
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			con = JDBCUtil.getConnection();
			st = con.prepareStatement("select * from order_table whwere userId=?");
			st.setString(1, userId);
			;
			if (rs.next()) {
				orderList = new ArrayList();
				do {
					OrderTO oto = new OrderTO();
					oto.setAddress(rs.getString("address"));
					oto.setCardNo(rs.getString("cardNo"));
					oto.setCity(rs.getString("city"));
					oto.setCountry(rs.getString("country"));
					oto.setExpDate(rs.getString("expDate"));
					oto.setOrderDate(rs.getString("orderDate"));
					oto.setTotalAmount(rs.getFloat("totalAmount"));
					oto.setTotalItem(rs.getInt("totalItem"));
					oto.setStatus(rs.getString("status"));
					oto.setOrderId(rs.getString("orderId"));
					oto.setState(rs.getString("state"));
					oto.setStreet(rs.getString("street"));
					oto.setUserId(rs.getString("userId"));
					oto.setZip(rs.getString("zip"));
					orderList.add(oto);
				} while (rs.next());
			}
		} catch (Exception e) {
			log.error("Error in getOrderByUserId()\t:", e);
		} finally {
			JDBCUtil.close(rs, st, con);
		}
		return orderList;
	}

	@Override
	public List getAllOrderInfo() {
		List orderList = null;
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			con = JDBCUtil.getConnection();
			st = con.prepareStatement("select * from order_table");
			rs = st.executeQuery();
			if (rs.next()) {
				orderList = new ArrayList();
				do {
					OrderTO oto = new OrderTO();
					oto.setAddress(rs.getString("address"));
					oto.setCardNo(rs.getString("cardNo"));
					oto.setCity(rs.getString("city"));
					oto.setCountry(rs.getString("country"));
					oto.setExpDate(rs.getString("expDate"));
					oto.setOrderDate(rs.getString("orderDate"));
					oto.setTotalAmount(rs.getFloat("totalAmount"));
					oto.setTotalItem(rs.getInt("totalItem"));
					oto.setStatus(rs.getString("status"));
					oto.setOrderId(rs.getString("orderId"));
					oto.setState(rs.getString("state"));
					oto.setStreet(rs.getString("street"));
					oto.setUserId(rs.getString("userId"));
					oto.setZip(rs.getString("zip"));
					orderList.add(oto);
				} while (rs.next());
			}
		} catch (Exception e) {
			log.error("Error in getAllOrderInfo()\t:", e);
		}
		return orderList;
	}

	@Override
	public void updateStatus(String orderId, String status) {
		Connection con = null;
		PreparedStatement st = null;

		try {
			con = JDBCUtil.getConnection();
			st = con.prepareStatement("update order_table set status=? where orderId-?");
			st.setString(1, status);
			st.setString(2, orderId);
			st.executeUpdate();
		} catch (Exception e) {
			log.error("Error in updateStatus()\t:", e);
		} finally {
			JDBCUtil.close(null, st, con);
		}
	}

	@Override
	public OrderTO getOrderByOrderId(String orderId) {
		OrderTO oto = null;
		Connection con = null;
		PreparedStatement st = null;
		ResultSet rs = null;

		try {
			con = JDBCUtil.getConnection();
			st = con.prepareStatement("select * from order_table where orderId=?");
			st.setString(1, orderId);
			rs = st.executeQuery();
			if (rs.next()) {
				oto = new OrderTO();
				oto.setAddress(rs.getString("address"));
				oto.setCardNo(rs.getString("cardNo"));
				oto.setCity(rs.getString("city"));
				oto.setCountry(rs.getString("country"));
				oto.setExpDate(rs.getString("expDate"));
				oto.setOrderDate(rs.getString("orderDate"));
				oto.setTotalAmount(rs.getFloat("totalAmount"));
				oto.setTotalItem(rs.getInt("totalItem"));
				oto.setStatus(rs.getString("status"));
				oto.setOrderId(rs.getString("orderId"));
				oto.setState(rs.getString("state"));
				oto.setStreet(rs.getString("street"));
				oto.setUserId(rs.getString("userId"));
				oto.setZip(rs.getString("zip"));

				PreparedStatement st2 = con.prepareStatement(
						"select * from book_table inner join orderItem_table using(bookId) where orderItem_table.orderId=?");
				st2.setString(1, orderId);
				ResultSet rs2 = st2.executeQuery();
				HashSet hs = new HashSet();
				while (rs2.next()) {
					BookTO bto = new BookTO();
					bto.setBookId(rs2.getInt("bookId"));
					bto.setAuthor(rs2.getString("author"));
					bto.setBookName(rs2.getString("bookName"));
					bto.setCost(rs2.getFloat("cost"));
					bto.setEdition(rs2.getString("edition"));
					bto.setPublication(rs2.getString("publication"));
					bto.setSelectedNumberOfBook(rs2.getInt("quantity"));
					hs.add(bto);
				}
				oto.setOrderItemList(hs);
			}
		} catch (Exception e) {
			log.error("Error in getOrderByOrderId()\t:", e);
		} finally {
			JDBCUtil.close(rs, st, con);
		}
		return oto;
	}

	private String getOrderId(String date, String ip) {
		String id = "";
		Calendar cal = Calendar.getInstance();
		String str[] = date.split("/");
		String hh = cal.get(Calendar.HOUR) + "";
		String mm = cal.get(Calendar.MINUTE) + "";
		String ss = cal.get(Calendar.SECOND) + "";
		String dt = str[0] + str[1] + str[2];
		String time = "hh+mm+ss";
		String ips[] = ip.split("\\.");
		ip = ips[0] + ips[1] + ips[2] + ips[3];
		String hexDate = Long.toHexString(Long.parseLong(dt));
		String hexTime = Long.toHexString(Long.parseLong(time));
		String hexIP = Long.toHexString(Long.parseLong(ip));
		id = hexDate + "J" + hexIP + "J" + hexTime;
		return id;
	}

}
