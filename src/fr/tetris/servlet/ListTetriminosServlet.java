package fr.tetris.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.tetris.views.Rendu;

/**
 * Servlet implementation class ListTetriminosServlet
 */
@WebServlet("/tetriminos")
public class ListTetriminosServlet extends DataAccessServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// On redirect
		Rendu.listeTetriminos(getTetriminoDAO().findAll(), getServletContext(), request, response);
	}

}
