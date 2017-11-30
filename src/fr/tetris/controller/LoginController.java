package fr.tetris.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.tetris.dao.IUtilisateurDAO;
import fr.tetris.model.Tetrimino;
import fr.tetris.model.Utilisateur;

@Controller
public class LoginController {

	
	@Autowired
	private IUtilisateurDAO daoUtilisateur;
	
	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String get(Model model) {
		return "login";
	}
	
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public String login(@ModelAttribute("user") Utilisateur user, HttpSession session, BindingResult result, Model model) {
		Utilisateur verifUser = daoUtilisateur.getByLogin(user.getNom());
		 if (verifUser == null) {
			 user = daoUtilisateur.save(user);
		 } else if (user.getMDP().equals(verifUser.getMDP())) {
			 user = verifUser;
		 }
		 
		 if (user != null) {
			 session.setAttribute("user", user);
			 return "home";
		 } else {
			 return "redirect:/login";
		 }	 
	}
	
	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/login";
	}
	
	@ModelAttribute("user")
	public Utilisateur user() {
		return new Utilisateur();
	}
	
}
