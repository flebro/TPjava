package fr.tetris.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import fr.tetris.dao.IDAO;
import fr.tetris.model.Tetrimino;

@Controller
public class TetriminosListController {

	@Autowired
	private IDAO<Tetrimino> tDao;
	
	@RequestMapping(value= "/tetriminos", method=RequestMethod.GET)
	public String tetriminos(Model model) {
		model.addAttribute("tetriminos", tDao.findAll());

			return "tetriminos";	
	}
	
}
