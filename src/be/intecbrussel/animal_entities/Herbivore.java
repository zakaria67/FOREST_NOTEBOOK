package be.intecbrussel.animal_entities;

import be.intecbrussel.plant_entities.Plant;

import java.util.Set;

public class Herbivore extends Animal{
    private Set<Plant> planDiet;


    public Herbivore(String name) {
        super(name);
    }

    public Herbivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlanDiet() {
        return planDiet;
    }

    public void setPlanDiet(Set<Plant> planDiet) {
        this.planDiet = planDiet;
    }


    public void addPlantToDiet (Plant plant){

    }

    public void printDiet(){

    }

    @Override
    public String toString() {
        return "Herbivore{" +
                "planDiet=" + planDiet +
                '}';
    }
}
