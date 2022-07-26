package com.gyeom.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insertmember")
public class InsertMember extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			String url = "/WEB-INF/views/joinForm.jsp";
			request.getRequestDispatcher(url).forward(request, response);			
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/WEB-INF/views/joinActs.jsp";
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String pwdchk = request.getParameter("pwdchk");
		String phone = request.getParameter("phone");
		String name = request.getParameter("name");
		String address = request.getParameter("address");
		String email = request.getParameter("email");
		
		String msg ="";
		if(pwd.equals(pwdchk)) {
			msg += "비밀번호가 일치합니다.";
		}else {
			msg += "비밀번호가 다릅니다.";
		}
		request.setAttribute("msg", msg);
		
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html; charset=UTF-8");
		request.getRequestDispatcher(url).forward(request, response);
	}

}
