package fr.tetris.dao;

import java.util.List;

import fr.tetris.model.Tetrimino;

public interface IDAO<T> {

	T get(long id);
	
	List<T> findAll();
	
	T save(T model);
	
	void delete(T model);
	
}
