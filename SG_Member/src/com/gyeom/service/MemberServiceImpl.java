package com.gyeom.service;

import java.sql.SQLException;
import java.util.List;

import com.gyeom.dao.MemberDAO;
import com.gyeom.dto.MemberVO;

public class MemberServiceImpl implements MemberService {
	
	private MemberDAO memberDAO;
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	@Override
	public List<MemberVO> getMemberList() throws SQLException {
		List<MemberVO> memberList = memberDAO.selectMemberList();
		return memberList;
	}

	@Override
	public MemberVO getMember(String id, String pwd) throws SQLException {
		MemberVO member = memberDAO.selectMemberById(id, pwd);
		return member;
	}

}
