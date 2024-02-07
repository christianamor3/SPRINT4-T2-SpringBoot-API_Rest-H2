package cat.itacademy.barcelonactiva.amorlopez.christian.s04.t02.n01.S04T02N01AmorLopezChristian.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cat.itacademy.barcelonactiva.amorlopez.christian.s04.t02.n01.S04T02N01AmorLopezChristian.model.domain.FruitaEntity;
import cat.itacademy.barcelonactiva.amorlopez.christian.s04.t02.n01.S04T02N01AmorLopezChristian.model.services.FruitaEntityServiceImp;


@RestController
@RequestMapping("/fruitaEntity")
public class Controller {
	
	@Autowired
	FruitaEntityServiceImp fruitaEntityServiceImp;
	
	@PostMapping("/add")
	public FruitaEntity addFruita(@RequestBody FruitaEntity fruita) {
		fruitaEntityServiceImp.save(fruita);
		return fruita;
	}
	
	@PutMapping("/update/{id}")
	public FruitaEntity updateFruitaEntity(@PathVariable int id, @RequestBody FruitaEntity fruita) {
		fruitaEntityServiceImp.update(id, fruita);
		return fruita;
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteFruitaEntity (@PathVariable int id) {
		return fruitaEntityServiceImp.delete(id);
	}
	
	@GetMapping("/getAll")
	public List<FruitaEntity> getAllFruitaEntity() {
		return fruitaEntityServiceImp.findAll();
	}
	
	@GetMapping("/getOne/{id}")
	public FruitaEntity getOneFruitaEntity (@PathVariable int id){
		return fruitaEntityServiceImp.findById(id);
	}
	

}
