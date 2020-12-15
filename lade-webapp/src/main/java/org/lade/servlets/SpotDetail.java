package org.lade.servlets;

import java.io.IOException;
import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.compain.lade.lade.entities.Comment;
import org.compain.lade.lade.entities.Spot;
import org.compain.lade.lade.entities.User;
import org.compain.lade.lade.service.CommentService;
import org.compain.lade.lade.service.SpotService;

/**
 * Servlet implementation class SpotDetail
 */
@WebServlet("/SpotDetail")
public class SpotDetail extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private SpotService spotService = SpotService.getInstance();
	private CommentService commentService = CommentService.getInstance();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String id = request.getParameter("id");		
		Integer idSpot = Integer.decode(id);		
		request.setAttribute("infospot", spotService.getSpot(idSpot));
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/detailspot.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		HttpSession session = request.getSession();	
		
		
		String id = request.getParameter("id");		
		Integer idSpot = Integer.decode(id);	
		
		Spot spot = spotService.getSpot(idSpot);	
		User user = (User) session.getAttribute("currentUser");

        Comment comment = new Comment();
        
        comment.setComment(request.getParameter("comment"));
        comment.setPublicationDate(new Date());
        comment.setSpot(spot);
        comment.setUser(user);
        
        commentService.addComment(comment);       
        
       
        //this.getServletContext().getRequestDispatcher("/WEB-INF/views/detailspot.jsp").forward(request, response);  
        response.sendRedirect(request.getContextPath()+"/SpotDetail?id="+id);
	}

}
