package cat.itacademy.barcelonactiva.amorlopez.christian.s04.t02.n01.S04T02N01AmorLopezChristian.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity

@Table (name = "FRUITA")
public class FruitaEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@Column(name = "NOM")
	private String nom;
	
	@Column(name = "QUANTITAT KILOS")
	private int quantitatKilos;

	public FruitaEntity() { // constructor vacio para que funcione JPA correctamente.
		
	}
	
	public FruitaEntity(String nom, int quantitatKilos) {
		this.nom = nom;
		this.quantitatKilos = quantitatKilos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public int getQuantitatKilos() {
		return quantitatKilos;
	}

	public void setQuantitatKilos(int quantitatKilos) {
		this.quantitatKilos = quantitatKilos;
	}
	
	
	
	
	
}
