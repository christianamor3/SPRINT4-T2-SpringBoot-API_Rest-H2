package cat.itacademy.barcelonactiva.amorlopez.christian.s04.t02.n01.S04T02N01AmorLopezChristian.model.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cat.itacademy.barcelonactiva.amorlopez.christian.s04.t02.n01.S04T02N01AmorLopezChristian.model.domain.FruitaEntity;
import cat.itacademy.barcelonactiva.amorlopez.christian.s04.t02.n01.S04T02N01AmorLopezChristian.model.repository.FruitaEntityRepository;

@Service
public class FruitaEntityServiceImp implements FruitaEntityService{

	
	@Autowired
	FruitaEntityRepository fruitaEntityRepository;
	

	public FruitaEntity save(FruitaEntity fruita) {
		return fruitaEntityRepository.save(fruita);
	}


	public FruitaEntity update(int id, FruitaEntity fruita) {
		FruitaEntity fruitaDb = fruitaEntityRepository.findById(id).get();
		fruitaDb.setNom(fruita.getNom());
		fruitaDb.setQuantitatKilos(fruita.getQuantitatKilos());
		
		return fruitaEntityRepository.save(fruitaDb);
	}


	public String delete(int id) {
		fruitaEntityRepository.deleteById(id);
		return "Se ha eliminado el objeto correctamente";
	}

	public List<FruitaEntity> findAll() {
		return fruitaEntityRepository.findAll();
	}

	
	public FruitaEntity findById(int id) {
		return fruitaEntityRepository.findById(id).get();
	}

}
