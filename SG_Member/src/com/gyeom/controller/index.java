package com.gyeom.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.gyeom.dao.MemberDAO;
import com.gyeom.dao.MemberDAOImpl;
import com.gyeom.dto.MemberVO;
import com.gyeom.service.MemberServiceImpl;

@WebServlet("/index")
public class index extends HttpServlet {
	MemberServiceImpl memberService = null;
	MemberDAO memberDao = null;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/WEB-INF/views/index.jsp";
		
		memberService = new MemberServiceImpl();
		memberDao = new MemberDAOImpl();
		memberService.setMemberDAO(memberDao);
		
		List<MemberVO> memberList = null;
		try {
			memberList = memberService.getMemberList();
			request.setAttribute("memberList", memberList);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/WEB-INF/views/loginSuccess.jsp";
		
		
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");

		memberService = new MemberServiceImpl();
		memberDao = new MemberDAOImpl();
		memberService.setMemberDAO(memberDao);
		
		MemberVO member = null;
		
		try {
			member = memberService.getMember(id, pwd);
			if(member.getId() == null) {
				request.setAttribute("msg", "아이디나 비밀번호를 확인하세요");
				url = "/WEB-INF/views/index.jsp";
				request.getRequestDispatcher(url).forward(request, response);				
			}else {
				request.setAttribute("member", member);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		request.getRequestDispatcher(url).forward(request, response);				
	}

}
