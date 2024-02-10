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
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import cat.itacademy.barcelonactiva.amorlopez.christian.s04.t02.n01.S04T02N01AmorLopezChristian.model.domain.FruitaEntity;
import cat.itacademy.barcelonactiva.amorlopez.christian.s04.t02.n01.S04T02N01AmorLopezChristian.model.services.FruitaEntityServiceImp;


@RestController
@RequestMapping("/fruitaEntity")
public class Controller {
	
	@Autowired
	FruitaEntityServiceImp fruitaEntityServiceImp;
	
	@PostMapping("/add")
	public ResponseEntity<FruitaEntity> createFruitaEntity(@RequestBody FruitaEntity fruita) {
		FruitaEntity fruitaEntity = fruitaEntityServiceImp.save(fruita);

		if (fruitaEntity != null){
			return ResponseEntity.created(fruitaEntity);
		} else {
			return ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<FruitaEntity> updateFruitaEntity(@PathVariable int id, @RequestBody FruitaEntity fruita) {
		FruitaEntity fruitaEntity = fruitaEntityServiceImp.update(id, fruita);
		
		if (fruitaEntity != null){
			return ResponseEntity.ok(fruitaEntity);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> deleteFruitaEntity (@PathVariable int id) {
		fruitaEntityServiceImp.delete(id);

		return ResponseEntity.noContent().build();
	}
	
	@GetMapping("/getAll")
	public ResponseEntity<List<FruitaEntity>> getAllFruitaEntity() {
		List<FruitaEntity> fruites = fruitaEntityServiceImp.findAll();

		if (fruites.isEmpty()){
			return ResponseEntity.notFound().build();
		} else {
			return ResponseEntity.ok(fruites);
		}
	}
	
	@GetMapping("/getOne/{id}")
	public ResponseEntity<FruitaEntity> getOneFruitaEntity (@PathVariable int id){
		FruitaEntity fruitaEntity = fruitaEntityServiceImp.findById(id);

		if (fruitaEntity != null) {
			return ResponseEntity.ok(fruitaEntity);
		} else {
			return ResponseEntity.notFound().build();
		}
	}
	

}
