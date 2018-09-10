package com.jamespaschall.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Check
 */
@WebServlet("/Check")
public class Check extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Check() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
        view.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		int check = Integer.parseInt(request.getParameter("guess"));
		int n = (int) session.getAttribute("num");
		int outcome = 0;
		if(check < n) {
			outcome = 1;
		}
		else if(check > n) {
			outcome = 2;
		}
		else if(check == n) {
			outcome = 3;
		}
		session.setAttribute("outcome", outcome);
		response.sendRedirect("Home");
	}

}
