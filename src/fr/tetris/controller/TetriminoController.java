package fr.tetris.controller;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.tetris.dao.IDAO;
import fr.tetris.model.Tetrimino;

@Controller
public class TetriminoController {
	
@Autowired
private IDAO<Tetrimino> tDao;

	@RequestMapping(value = "tetrimino/{id}", method = RequestMethod.GET)
	public String get(@PathVariable(name="id", required=false) Long id, Model model) {
		Tetrimino tetrimino = null;
		if (id != null) {
			tetrimino = tDao.get(id);
		} else {
			tetrimino = new Tetrimino();
		}
		model.addAttribute("tetrimino", tetrimino);
		return "editTetrimino";
	}
	
	@RequestMapping(value = "tetrimino/{id}", method = RequestMethod.POST)
	public String save(@PathVariable(name="id", required=false) Long id, @ModelAttribute("tetrimino") Tetrimino tetrimino, BindingResult result, Model model) {
		tetrimino.setId(id);
		tDao.save(tetrimino);
		return"redirect:/tetriminos";
	}
	
	@RequestMapping(value = "tetrimino/{id}", method = RequestMethod.DELETE)
	public String delete(@PathVariable(name="id", required=false) Long id, Model model) {
		if (id != null) {
			Tetrimino tetrimino = tDao.get(id);
			if (tetrimino != null) {
				tDao.delete(tetrimino);
			}
		}
		return"redirect:/tetriminos";
	}
	
	@ModelAttribute("tetrimino")
	public Tetrimino tetrimino() {
		return new Tetrimino();
	}
	
}
