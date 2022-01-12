package com.example.demo;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://ip:port/checkUser
// /checkUser
@WebServlet("/checkUser")
public class CheckUser extends HttpServlet {

	public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
		ArrayList<String> registeredUsers=new ArrayList<String> ();
		registeredUsers.add("john");
		registeredUsers.add("jane");
		registeredUsers.add("mike");
		
		String uid=req.getParameter("userid");
		if(registeredUsers.contains(uid))
			res.getWriter().write("unavailable");
		else
			res.getWriter().write("available");
		
		res.getWriter().flush();
		res.getWriter().close();
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
		doGet(req,res);
	}

}
