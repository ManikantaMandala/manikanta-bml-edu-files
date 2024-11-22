package com.initParamServeletProject.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class feedbckServlet
 */
public class feedbckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private String cmpyEmailInitParam = null;
	private String cmpyPhoneInitParam = null;
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public feedbckServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		cmpyEmailInitParam = config.getInitParameter("companyEmail");
		cmpyPhoneInitParam = config.getInitParameter("companyPhoneNumber");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw = response.getWriter();
		pw.print("<h2>We have received your feedback. Please reachout to us at " + cmpyEmailInitParam+" or call us at "+cmpyPhoneInitParam+" for any assiatance.</h2><br>");
	}

}
