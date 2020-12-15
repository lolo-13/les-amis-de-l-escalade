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

@WebServlet("/CommentAdd")
public class CommentAdd extends HttpServlet {

	private static final long serialVersionUID = 1L;

	private SpotService spotService = SpotService.getInstance();
	private CommentService commentService = CommentService.getInstance();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {	
		
		String id = request.getParameter("id").toString();		
		int idSpot = Integer.decode(id);
		request.setAttribute("infospot", spotService.getSpot(idSpot));
	
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/comment.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		Comment comment = new Comment();	
		Spot spot = new Spot();			   
		HttpSession session = request.getSession();	
		User user = (User) session.getAttribute("currentUser");	
		
		
		spot = spotService.getSpot(Integer.valueOf(request.getParameter("id")));
		
		comment.setComment(request.getParameter("comment"));
		comment.setPublicationDate(new Date());
		comment.setUser(user);
		comment.setSpot(spot);	
		
		commentService.addComment(comment);
        
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/comment.jsp").forward(request, response);

	}
}