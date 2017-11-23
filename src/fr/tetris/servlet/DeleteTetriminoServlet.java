package fr.tetris.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.tetris.dao.TetriminoApplicationDAO;
import fr.tetris.model.Tetrimino;

/**
 * Servlet implementation class DeleteTetriminoServlet
 */
@WebServlet("/deleteTetrimino")
public class DeleteTetriminoServlet extends DataAccessServlet {
	private static final long serialVersionUID = 1L;
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		Tetrimino tetrimino = null;
		if (tetrimino != null) {
			getTetriminoDAO().delete(tetrimino);
		}
		// On redirect
		response.sendRedirect(request.getContextPath() + "/tetriminos");
	}

}
