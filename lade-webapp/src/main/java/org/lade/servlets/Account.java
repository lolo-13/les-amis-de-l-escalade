package org.lade.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.compain.lade.lade.entities.User;
import org.compain.lade.lade.service.ReservationInquiryService;
import org.compain.lade.lade.service.UserService;

@WebServlet("/Account")
public class Account extends HttpServlet{
	
	private static final long serialVersionUID = 1L;

	private UserService userService = UserService.getInstance();
	private ReservationInquiryService reservationInquiryService = ReservationInquiryService.getInstance();

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		
		HttpSession session = request.getSession();
		
		request.setAttribute("account", session.getAttribute("currentUser"));	
		request.setAttribute("reservationInquiries", reservationInquiryService.findAll());
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/account.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	       
		HttpSession session = request.getSession();
		
		
		User newUser = new User();
	
		
		User user = (User) session.getAttribute("currentUser");			
		
	
        
		newUser.setName(request.getParameter("name"));
		newUser.setEmail(request.getParameter("email"));
		newUser.setLastName(request.getParameter("lastname"));
		newUser.setPassword(request.getParameter("password"));

        Integer idUser = (user.getIdUser());
        
        userService.updateUser(newUser, idUser);
        
        
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/views/account.jsp").forward(request, response);      
       
	}

}
