package fr.tetris.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import fr.tetris.dao.IDAO;
import fr.tetris.dao.TetriminoApplicationDAO;
import fr.tetris.model.Tetrimino;

/**
 * Servlet implementation class DeleteTetriminoServlet
 */
@Controller
@WebServlet("/deleteTetrimino")
public class DeleteTetriminoServlet extends AbstractSpringServlet {
	private static final long serialVersionUID = 1L;

	@Autowired
	private IDAO<Tetrimino> tDao;
	
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String rawId = request.getParameter("id");
		if (rawId != null) {
			Long id = Long.valueOf(request.getParameter("id"));
			Tetrimino tetrimino = tDao.get(id);
			if (tetrimino != null) {
				tDao.delete(tetrimino);
			}
		}
		
		// On redirect
		response.sendRedirect(request.getContextPath() + "/tetriminos");
	}

}
