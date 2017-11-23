package fr.tetris.servlet;
import fr.tetris.dao.IDAO;
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
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Autowired
	private IDAO<Utilisateur> daoUtilisateur;

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
		 HttpSession session = request.getSession();
		 if(username != "" && password != "")
		 {

			// daoUtilisateur.get(myUser.getId());

			 session.setAttribute("username", username );
			 session.setAttribute("password",password);
			 response.sendRedirect( request.getContextPath() + "/home");
		 }
		 else {
			 response.sendRedirect( request.getContextPath() + "/login");
		 }
		 
		// this.getServletContext().getRequestDispatcher("/home").forward( request, response );
		 
		
	}

}
