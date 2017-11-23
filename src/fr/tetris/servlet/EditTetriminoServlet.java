package fr.tetris.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import fr.tetris.dao.IDAO;
import fr.tetris.dao.TetriminoApplicationDAO;
import fr.tetris.model.Tetrimino;
import fr.tetris.views.Rendu;

/**
 * Servlet implementation class EditTetriminoServlet
 */
@Controller
@WebServlet("/editTetrimino")
public class EditTetriminoServlet extends AbstractSpringServlet {
private static final long serialVersionUID = 1L;
    
@Autowired
private IDAO<Tetrimino> tDao;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Tetrimino tetrimino = null;
		String rawId = req.getParameter("id");
		if (StringUtils.isNotBlank(rawId)) {
			Long id = Long.valueOf(req.getParameter("id"));
			tetrimino = tDao.get(id);
		} else {
			tetrimino = new Tetrimino();
		}
		Rendu.editionTetrimino(rawId == null ? "Ajout de tetriminos" : "Edition de tetriminos",tetrimino, getServletContext(), req, resp);
	}	

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Tetrimino tetrimino = null;
		String rawId = request.getParameter("id");
		if (StringUtils.isNotBlank(rawId)) {
			Long id = Long.valueOf(request.getParameter("id"));
			tetrimino = tDao.get(id);
		} else {
			tetrimino = new Tetrimino();
		}
		
		tetrimino.setNom(request.getParameter("nom"));
		tetrimino.setCouleur(request.getParameter("couleur"));
		
		tDao.save(tetrimino);
		
		// On redirect
		response.sendRedirect(request.getContextPath() + "/tetriminos");
	}

}
