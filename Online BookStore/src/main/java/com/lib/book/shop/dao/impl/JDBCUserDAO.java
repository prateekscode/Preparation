package com.lib.book.shop.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import org.apache.log4j.Logger;

import com.lib.book.shop.dao.UserDao;
import com.lib.book.shop.to.UserTO;
import com.lib.book.shop.util.JDBCUtil;

public class JDBCUserDAO implements UserDao {
	Logger log = Logger.getLogger(this.getClass());

	public UserTO verifyUser(String username, String password) {
		UserTO uto = null;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;

		try {
			con = JDBCUtil.getConnection();
			ps = con.prepareStatement(
					"select * from user_table inner join login_table using (userId) where login_table.username=? and login_table.password=?");
			ps.setString(1, username);
			ps.setString(2, password);
			rs = ps.executeQuery();
			if (rs.next()) {
				if (password.equals(rs.getString("password"))) {
					String uid = rs.getString("userId");
					String fName = rs.getString("firstName");
					String mName = rs.getString("middleName");
					String lName = rs.getString("lastName");
					String eml = rs.getString("email");
					long phn = rs.getLong("phone");
					String logId = rs.getString("loginId");
					String unm = rs.getString("username");
					String pwd = rs.getString("password");
					String role = rs.getString("role");
					uto = new UserTO(uid, fName, mName, lName, eml, phn, logId, unm, pwd, role);
					uto.setUserId(uid);
					uto.setLoginId(logId);
				}
			}
		} catch (Exception e) {
			uto = null;
			log.error("Exception in verifyUser :\n", e);
		} finally {
			JDBCUtil.close(rs, ps, con);
		}
		return uto;
	}

	@Override
	public UserTO changePassword(UserTO usto, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String searchPassword(String username, String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean registerUser(UserTO uto) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean alreadyExist(String username) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUserInfo(String userId, String email, long phone) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public UserTO getUserInfoById(String userId) {
		// TODO Auto-generated method stub
		return null;
	}
}
