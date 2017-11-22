package fr.tetris.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import fr.tetris.model.Tetrimino;

public class TetriminoApplicationDAO {
	
	private HashMap<String, Tetrimino> tetriminos = new HashMap<>();
	
	public TetriminoApplicationDAO() {
		// TODO Auto-generated constructor stub
		Tetrimino tetrimino = new Tetrimino();
		tetrimino.setNom("1");
		tetrimino.setCouleur("136");
		save(tetrimino);
		tetrimino = new Tetrimino();
		tetrimino.setNom("25456");
		tetrimino.setCouleur("136456546");
		save(tetrimino);
	}
	
	public Tetrimino get(String id) {
		return tetriminos.get(id);
	}
	
	public List<Tetrimino> findAll() {
		return new ArrayList<>(tetriminos.values());
	}
	
	public Tetrimino save(Tetrimino tetrimino) {
		if (tetrimino.getId() == null) {
			tetrimino.setId(UUID.randomUUID().toString());
		}
		tetriminos.put(tetrimino.getId(), tetrimino);
		return tetrimino;
	}
	
	public void delete(Tetrimino tetrimino) {
		tetriminos.remove(tetrimino.getId());
	}

}
