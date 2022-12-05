package be.intecbrussel.animal_entities;

import be.intecbrussel.plant_entities.Plant;

import java.util.Set;

public class Omnivore extends Animal{
    private Set<Plant> planDiet;
    private double maxFoodSize;


    public Omnivore(String name) {
        super(name);
    }

    public Omnivore(String name, double weight, double height, double length) {
        super(name, weight, height, length);
    }

    public Set<Plant> getPlanDiet() {
        return planDiet;
    }

    public void setPlanDiet(Set<Plant> planDiet) {
        this.planDiet = planDiet;
    }

    public double getMaxFoodSize() {
        return maxFoodSize;
    }

    public void setMaxFoodSize(double maxFoodSize) {
        this.maxFoodSize = maxFoodSize;
    }
    public void addPlantToDiet (Plant plant){

    }

    @Override
    public String toString() {
        return "Omnivore{" +
                "planDiet=" + planDiet +
                ", maxFoodSize=" + maxFoodSize +
                '}';
    }
}
