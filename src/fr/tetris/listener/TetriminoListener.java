package fr.tetris.listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import fr.tetris.dao.TetriminoApplicationDAO;

@WebListener
public class TetriminoListener implements ServletContextListener {

	@Override
	public void contextInitialized(ServletContextEvent sce) {
		// Initialisation de la DAO
		System.out.println("Injection de la DAO tetrimino");
		sce.getServletContext().setAttribute("tetriminosDAO", new TetriminoApplicationDAO());
		System.out.println("Contexte initialisé");
	}
	
}
