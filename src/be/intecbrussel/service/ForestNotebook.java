package be.intecbrussel.service;

import be.intecbrussel.animal_entities.Animal;
import be.intecbrussel.animal_entities.Carnivore;
import be.intecbrussel.animal_entities.Herbivore;
import be.intecbrussel.animal_entities.Omnivore;
import be.intecbrussel.plant_entities.Plant;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ForestNotebook {
    private List<Carnivore> carnivores;
    private List<Omnivore> omnivores;
    private List<Herbivore> herbivores;
    private int plantCount;
    private int animalCount;
    private List<Animal> animals;
    private List<Plant> plants;

    public ForestNotebook() {
    }

    public List<Carnivore> getCarnivores() {
        return carnivores;
    }

    public void setCarnivores(List<Carnivore> carnivores) {
        this.carnivores = carnivores;
    }

    public List<Omnivore> getOmnivores() {
        return omnivores;
    }

    public void setOmnivores(List<Omnivore> omnivores) {
        this.omnivores = omnivores;
    }

    public List<Herbivore> getHerbivores() {
        return herbivores;
    }

    public void setHerbivores(List<Herbivore> herbivores) {
        this.herbivores = herbivores;
    }

    public int getPlantCount() {
        return plantCount;
    }

    public int getAnimalCount() {
        return animalCount;
    }
    public void addAnimal (Animal animal){

    }
    public void addPlant (Plant plant){

    }
    public void printNotebook (){
        //System.out.println("List of animals: ");
        //animals.forEach(animal -> System.out.println(animal));
        //System.out.println("List of plants: ");
       // plants.forEach(plant -> System.out.println(plant));
        System.out.println(animals);
        System.out.println(plants);

    }
    public void sortAnimalsByName(){
        animals.sort(Comparator.comparing(Animal::getName));
        carnivores.sort(Comparator.comparing(Animal::getName));
        herbivores.sort(Comparator.comparing(Animal::getName));
        omnivores.sort(Comparator.comparing(Animal::getName));







    }
    public void sortPlantsByName (){
        plants.sort(Comparator.comparing(Plant::getName));

    }
}
