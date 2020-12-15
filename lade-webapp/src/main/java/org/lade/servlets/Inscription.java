package org.lade.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.compain.lade.lade.entities.Role;
import org.compain.lade.lade.entities.User;
import org.compain.lade.lade.service.UserService;


@WebServlet("/Inscription")
public class Inscription extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private UserService userService = UserService.getInstance();	

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/inscription.jsp").forward(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
		User user = new User();
        Role role = new Role();
        
        role.setCode(1);
        
        user.setName(request.getParameter("name"));
        user.setEmail(request.getParameter("email"));
        user.setLastName(request.getParameter("lastname"));
        user.setLogin(request.getParameter("login"));
        user.setPassword(request.getParameter("password"));
        user.setRole(role);
        
        userService.addUser(user);
        
        
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/views/inscription.jsp").forward(request, response);      
       
	}

}
