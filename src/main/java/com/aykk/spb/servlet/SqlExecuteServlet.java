package com.aykk.spb.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebServlet(name = "sqlExecuteServlet", urlPatterns = "/sqlExecute")
public class SqlExecuteServlet extends HttpServlet {
	private static final Logger LOGGER = Logger.getLogger(SqlExecuteServlet.class);
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LOGGER.info("Start my first servlet.");
		resp.getWriter().append("my first sql execute servlet.");
		LOGGER.info("End my first servlet.");
	}
}
