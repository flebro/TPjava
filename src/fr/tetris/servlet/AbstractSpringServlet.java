package fr.tetris.servlet;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;

import org.springframework.web.context.support.SpringBeanAutowiringSupport;

/**
 * Servlet implementation class AbstractSpringServlet
 */
public abstract class AbstractSpringServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;	

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			super.init(config);
		}
		catch (ServletException e) {
			e.printStackTrace();
		}
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, config.getServletContext());
	}

}

