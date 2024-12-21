package com.jdbc.proj;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookService {
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;

	public int verifyUser(String un, String pw) {
		int x = 0;
		try {
			con = JDBCUtil.getMysqlConnection();
			ps = con.prepareStatement("select * from users_table where username=? and password=?");
			ps.setString(1, un);
			ps.setString(2, pw);
			rs = ps.executeQuery();

			if (rs.next()) {
				x = 1;
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			JDBCUtil.CleanUp();
		}
		return x;
	}

	public int addBook(Book bo) {
		int x=0;
		try {
			con=JDBCUtil.getMysqlConnection();
			ps=con.prepareStatement("insert into jlcbooks values(?,?,?,?,?,?,?)");
			ps.setString(1, bo.getBid());
			ps.setString(2, bo.getBname());
			ps.setString(3, bo.getAuthor());
			ps.setString(4, bo.getPub());
			ps.setString(7, bo.getCost());
			ps.setString(5, bo.getEdi());
			ps.setString(6, bo.getIsbn());
			x=ps.executeUpdate();
		}catch (Exception e) {
			System.out.println(e);
		}finally {
			JDBCUtil.CleanUp();
		}
	}

}
