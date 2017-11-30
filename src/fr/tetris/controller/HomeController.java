package fr.tetris.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.tetris.model.Utilisateur;

@Controller
public class HomeController {

	@RequestMapping(value = "home")
	protected String get(HttpSession session, Model model) throws ServletException, IOException {
		// TODO Auto-generated method stub
		model.addAttribute("user", session.getAttribute("user"));
		return "home";
	}
	
}
