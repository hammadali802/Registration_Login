package com.example.usermanagement;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet(name = "RegisterServlet", value = "/RegisterServlet")

public class RegisterServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	private static UserDao userDao = new UserDaoImpl();

	public RegisterServlet(){
		super();
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = request.getParameter("username");
		String email = request.getParameter("email");
		String password = request.getParameter("password");

		User user = new User();
		user.setUsername(username);
		user.setEmail(email);
		user.setPassword(password);

		if (userDao.addUser(user)) {
			response.sendRedirect("login.jsp?registration=success");
		} else {
			response.sendRedirect("register.jsp?error=1");
		}
	}
}
