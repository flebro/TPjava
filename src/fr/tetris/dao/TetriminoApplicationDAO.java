package fr.tetris.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.tetris.model.Tetrimino;

@Repository @Transactional
public class TetriminoApplicationDAO implements IDAO<Tetrimino> {

	@PersistenceContext
	private EntityManager em;
	
	public Tetrimino get(long id) {
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
