package fr.tetris.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import fr.tetris.model.Tetrimino;

public class TetriminoApplicationDAO implements IDAO<Tetrimino> {

	@PersistenceContext
	private EntityManager em;
	
	public Tetrimino get(String id) {
		return em.find(Tetrimino.class, id);
	}
	
	public List<Tetrimino> findAll() {
		return em.createQuery("FROM Tetrimino").getResultList();
	}
	
	public Tetrimino save(Tetrimino tetrimino) {
		return em.merge(tetrimino);
	}
	
	public void delete(Tetrimino tetrimino) {
		em.remove(tetrimino);
	}

}
