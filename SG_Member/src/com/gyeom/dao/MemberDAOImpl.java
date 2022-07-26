package com.gyeom.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.gyeom.datasource.JDBCDataSource;
import com.gyeom.dto.MemberVO;

public class MemberDAOImpl implements MemberDAO {

	private Connection conn;

	@Override
	public List<MemberVO> selectMemberList() throws SQLException {
		JDBCDataSource dataSource = JDBCDataSource.getInstance();
		try {
			conn = dataSource.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

		String sql = "select * from member";

		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery(sql);

		List<MemberVO> memberList = new ArrayList<MemberVO>();
		MemberVO member;

		while (rs.next()) {
			member = new MemberVO();

			member.setId(rs.getString("id"));
			member.setPwd(rs.getString("pwd"));
			member.setName(rs.getString("name"));
			member.setPhone(rs.getString("phone"));
			member.setAddress(rs.getString("address"));
			member.setEmail(rs.getString("email"));

			member.setRegDate(rs.getDate("regDate"));

			memberList.add(member);
		}

		return memberList;
	}

	@Override
	public MemberVO selectMemberById(String id, String pwd) throws SQLException {
		JDBCDataSource dataSource = JDBCDataSource.getInstance();
		try {
			conn = dataSource.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}

		String sql = "select *" + " from member" + " where id=? and pwd=? ";

		PreparedStatement pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, id);
		pstmt.setString(2, pwd);
		ResultSet rs = pstmt.executeQuery();

		MemberVO member = new MemberVO();
		if (rs.next()) {

			member.setId(rs.getString("id"));
			member.setPwd(rs.getString("pwd"));
			member.setName(rs.getString("name"));
			member.setPhone(rs.getString("phone"));
			member.setAddress(rs.getString("address"));
			member.setEmail(rs.getString("email"));

			member.setRegDate(rs.getDate("regDate"));
		}

		return member;
	}

}
