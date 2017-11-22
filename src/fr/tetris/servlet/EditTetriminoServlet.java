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
 * Servlet implementation class EditTetriminoServlet
 */
@WebServlet("/editTetrimino")
public class EditTetriminoServlet extends HttpServlet {
private static final long serialVersionUID = 1L;
    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		TetriminoApplicationDAO dao = (TetriminoApplicationDAO) this.getServletContext().getAttribute("tetriminosDAO");
		Tetrimino tetrimino = null;
		if (id != null) {
			tetrimino = dao.get(id);
		}
		
		if (tetrimino == null) {
			tetrimino = new Tetrimino();
		}
		
		req.setAttribute("tetrimino", tetrimino);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/editTetrimino.jsp").forward(req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Init
		Tetrimino tetrimino = null;
		TetriminoApplicationDAO dao = (TetriminoApplicationDAO) this.getServletContext().getAttribute("tetriminosDAO");
		
		// S'il n'y a pas d'id c'est une création
		String id = request.getParameter("id");
		if (id != null) {
			tetrimino = dao.get(id);
		}
		
		if (tetrimino == null) {
			tetrimino = new Tetrimino();
		}
		
		tetrimino.setNom(request.getParameter("nom"));
		tetrimino.setCouleur(request.getParameter("couleur"));
		
		// On save
		dao.save(tetrimino);
		
		// On redirect
		response.sendRedirect(request.getContextPath() + "/tetriminos");
	}

}
