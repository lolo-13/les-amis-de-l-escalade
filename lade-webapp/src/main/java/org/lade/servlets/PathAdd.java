package org.lade.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.compain.lade.lade.entities.Path;
import org.compain.lade.lade.entities.Sector;
import org.compain.lade.lade.service.PathService;
import org.compain.lade.lade.service.SectorService;




@WebServlet("/PathAdd")
public class PathAdd extends HttpServlet {
	
	private static final long serialVersionUID = 1L;

	private PathService lenghtService = PathService.getInstance();	
	private SectorService sectorService = SectorService.getInstance();	


	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/pathadd.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
		Path path = new Path();	
		
		Sector sector = sectorService.getSector(Long.valueOf(request.getParameter("id")));
		
		
		path.setCotation(request.getParameter("cotation"));
		path.setHeight(Float.valueOf(request.getParameter("height")));
		path.setName(request.getParameter("name"));	
		path.setNumberOfLengh(Integer.valueOf(request.getParameter("numberoflenght")));
		path.setPointNumber(Integer.valueOf(request.getParameter("numberofpoint")));
		path.setSector(sector);
        
        lenghtService.addPath(path);
        
        
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/views/lenghtadd.jsp").forward(request, response);      
       
	}

}
