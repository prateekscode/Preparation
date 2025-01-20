package com.lib.book.shop.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class JDBCUtil {
	static Logger log = LogManager.getLogger(JDBCUtil.class);
	private static Connection con = null;
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			log.error("Error in loading driver class\n", e);
		}
	}

	public static Connection getConnection() {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost/bookshopdb", "root", "prateek");
		} catch (Exception e) {
			log.error("Error in establishing Connection\n", e);
		}
		return con;
	}

	public static void close(ResultSet rs, Statement st, Connection con) {
		try {
			if (rs != null)
				rs.close();
			if (st != null)
				st.close();
			if (con != null)
				con.close();
		} catch (Exception e) {
			log.error("Error in closing the resource\n", e);
		}
	}
}
