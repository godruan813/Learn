package com.learn.it;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionSev1 extends HttpServlet {

	/**
	 * The doGet method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to get.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {



	}

	/**
	 * The doPost method of the servlet. <br>
	 *
	 * This method is called when a form has its tag value method equals to post.
	 * 
	 * @param request the request send by the client to the server
	 * @param response the response send by the server to the client
	 * @throws ServletException if an error occurred
	 * @throws IOException if an error occurred
	 */
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		String user=request.getParameter("user");
		String pwd=request.getParameter("pwd");
		String code=request.getParameter("code");

		if(code.equalsIgnoreCase(request.getSession().getAttribute("veryCode").toString())){
			if(user.equals("dd")){
				HttpSession hs = request.getSession();
				hs.setAttribute("user", user);
				response.sendRedirect("/Learn/jsp1/b.jsp");
			}
			else {
				request.setAttribute("msg", "´íÎó!");
				request.getRequestDispatcher("jsp1/c.jsp").forward(request, response);

			}
		}
		else {
			request.setAttribute("msg", "ÑéÖ¤Âë´íÎó");
			request.getRequestDispatcher("jsp1/c.jsp").forward(request, response);
		}

	}

}
