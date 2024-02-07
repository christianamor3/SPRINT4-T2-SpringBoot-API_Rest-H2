package cat.itacademy.barcelonactiva.amorlopez.christian.s04.t02.n01.S04T02N01AmorLopezChristian.model.services;

import java.util.List;

import cat.itacademy.barcelonactiva.amorlopez.christian.s04.t02.n01.S04T02N01AmorLopezChristian.model.domain.FruitaEntity;

public interface FruitaEntityService {

	FruitaEntity save(FruitaEntity fruita);
	FruitaEntity update(int id, FruitaEntity fruita);
	String delete(int id);
	List<FruitaEntity> findAll();
	FruitaEntity findById(int id);
	
}
