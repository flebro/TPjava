package fr.tetris.servlet;

import javax.servlet.http.HttpServlet;

import fr.tetris.dao.IDAO;
import fr.tetris.dao.TetriminoApplicationDAO;
import fr.tetris.model.Tetrimino;

public abstract class DataAccessServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1717673335735227148L;

	protected IDAO getTetriminoDAO() {
		return (IDAO)this.getServletContext().getAttribute("tetriminosDAO");
	}

	protected Tetrimino getOrCreate(String id) {
		Tetrimino tetrimino = getTetriminoDAO().get(id);
		if (id != null) {
			tetrimino = getTetriminoDAO().get(id);
		}
		
		if (tetrimino == null) {
			tetrimino = new Tetrimino();
		}
		return tetrimino;
	}
	
}
