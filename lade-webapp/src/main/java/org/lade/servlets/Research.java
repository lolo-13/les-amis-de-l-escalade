package org.lade.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.compain.lade.lade.service.SpotService;

/**
 * Servlet implementation class Research
 */
@WebServlet("/Research")
public class Research extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private SpotService spotService = SpotService.getInstance();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
				
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/research.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String region = null;
		String difficult = null;
		String country = null;
		String postcode = null;
		String name = null;
		
		region = request.getParameter("region");		
		difficult = request.getParameter("difficult");	
		country = request.getParameter("country");
		postcode = request.getParameter("postcode");
		name = request.getParameter("name");
		request.setAttribute("spotsfind", spotService.findSpots(region, difficult, country, postcode, name));
 			
        this.getServletContext().getRequestDispatcher("/WEB-INF/views/research.jsp").forward(request, response);    
	}

}