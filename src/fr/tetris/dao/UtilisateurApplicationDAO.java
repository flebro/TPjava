package fr.tetris.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.tetris.model.Utilisateur;

@Repository @Transactional
public class UtilisateurApplicationDAO implements IDAO<Utilisateur> {
	@PersistenceContext
	private EntityManager em;

	@Override
	public Utilisateur get(long id) {
		// TODO Auto-generated method stub
		return em.find(Utilisateur.class, id);
	}

	@Override
	public List findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur save(Utilisateur model) {
		// TODO Auto-generated method stub
		return em.merge(model);
	}

	@Override
	public void delete(Utilisateur model) {
		em.remove(model);
		
	}

}
