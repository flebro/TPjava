package fr.tetris.dao;

import fr.tetris.model.Utilisateur;

public interface IUtilisateurDAO extends IDAO<Utilisateur> {
	
	Utilisateur getByLogin(String login);

}
