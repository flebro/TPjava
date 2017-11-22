package fr.tetris.views;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.tetris.model.Tetrimino;

public class Rendu {
	
	public static void listeTetriminos(List<Tetrimino> tetriminos, ServletContext context, 
			HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		req.setAttribute("tetriminos", tetriminos);

		template("Liste tetrominos", "/WEB-INF/views/tetriminos.jsp", context, req, resp);
	}
	
	public static void editionTetrimino(Tetrimino tetrimino, ServletContext context, 
			HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		req.setAttribute("tetrimino", tetrimino);

		template("Edition tetromino", "/WEB-INF/views/editTetrimino.jsp", context, req, resp);
	}
	
	private static void template(String title, String contentJsp, ServletContext context, HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		if (title == null)
			title = "Défaut";

		req.setAttribute("pageTitle", title);
		req.setAttribute("contentJsp", contentJsp);

		RequestDispatcher dispatcher = context.getRequestDispatcher("/WEB-INF/views/template.jsp");
		dispatcher.forward(req, resp);
	}
}
