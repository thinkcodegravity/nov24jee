package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://ip:port/checkUser
// /checkUser
@WebServlet("/login")
public class LoginServlet extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		String uid=req.getParameter("uid");
		String pwd=req.getParameter("pwd");
		if(uid.equals("john") && pwd.equals("john1!"))
			res.sendRedirect("welcome.html");
		else
			res.sendRedirect("error.html");
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		doGet(req,res);
	}

}
