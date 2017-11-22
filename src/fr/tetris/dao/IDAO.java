package fr.tetris.dao;

import java.util.List;

import fr.tetris.model.Tetrimino;

public interface IDAO {

	Tetrimino get(String id);
	
	List<Tetrimino> findAll();
	
	Tetrimino save(Tetrimino model);
	
	void delete(Tetrimino model);
	
}
