package fr.tetris.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.tetris.dao.TetriminoApplicationDAO;
import fr.tetris.model.Tetrimino;
import fr.tetris.views.Rendu;

/**
 * Servlet implementation class EditTetriminoServlet
 */
@WebServlet("/editTetrimino")
public class EditTetriminoServlet extends DataAccessServlet {
private static final long serialVersionUID = 1L;
    
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String id = req.getParameter("id");
		
		Rendu.editionTetrimino(getOrCreate(id), getServletContext(), req, resp);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		
		// Init
		Tetrimino tetrimino = getOrCreate(id);
		
		tetrimino.setNom(request.getParameter("nom"));
		tetrimino.setCouleur(request.getParameter("couleur"));
		
		// On save
		getTetriminoDAO().save(tetrimino);
		
		// On redirect
		response.sendRedirect(request.getContextPath() + "/tetriminos");
	}

}
