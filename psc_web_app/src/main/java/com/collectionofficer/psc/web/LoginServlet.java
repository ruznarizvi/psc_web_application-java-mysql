package com.collectionofficer.psc.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.collectionofficer.psc.bean.Login;
import com.collectionofficer.psc.dao.LoginDao;

/**
 * Servlet implementation class LoginServelet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();

		// request.getRequestDispatcher("userLogin.jsp").include(request, response);

		String collection_officer_Email = request.getParameter("collection_officer_Email");
		String collection_officer_Password = request.getParameter("collection_officer_Password");

		Login login = new Login();
		login.setCollection_officer_Email(collection_officer_Email);
		login.setCollection_officer_Password(collection_officer_Password);

		LoginDao loginDao = new LoginDao();

		HttpSession session = request.getSession();

		if (loginDao.validate(login).equals("0")) {
			session = request.getSession();
			session.setAttribute("collection_officer_Email", collection_officer_Email);
			response.sendRedirect("http://localhost:8081/psc_web_app/dashboardlist");
		}
		else {
			out.print("Sorry, username or password error!");
			// request.getRequestDispatcher("userLogin.jsp").include(request, response);
			// response.sendRedirect("userLogin.jsp");
		}
		out.close();
	}

}
