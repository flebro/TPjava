package fr.tetris.servlet;
import fr.tetris.dao.IDAO;
import fr.tetris.dao.IUtilisateurDAO;
import fr.tetris.model.Utilisateur;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import fr.tetris.views.Rendu;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends AbstractSpringServlet {
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private IUtilisateurDAO daoUtilisateur;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Rendu.login( getServletContext(), request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String username = request.getParameter("login");
		 String password = request.getParameter("motdepasse");
		 
		 Utilisateur user = daoUtilisateur.getByLogin(username);
		 if (user == null) {
			 // On créé
			 user = new Utilisateur();
			 user.setNom(username);
			 user.setMDP(password);
			 user = daoUtilisateur.save(user);
		 } else if (!user.getMDP().equals(password)) {
			 user = null;
		 }
		 
		 if (user != null) {
			 request.getSession().setAttribute("user", user);
			 response.sendRedirect( request.getContextPath() + "/home");
		 } else {
			 response.sendRedirect( request.getContextPath() + "/login");
		 }	 
		
	}

}
