package br.edu.univas.factory;


import static br.edu.univas.factory.AnimalType.INVERTEBRADO;
import static br.edu.univas.factory.AnimalType.VERTEBRADO;

public class AnimalProvider {
	public static AbstractFactory getAnimalType(AnimalType animalType) {
		if (animalType.equals(INVERTEBRADO)) {
			return (AbstractFactory) new Invertebrados();
		} else if (animalType.equals(VERTEBRADO)) {
			return new Vertebrados();
		}
		return null;
	}
}
