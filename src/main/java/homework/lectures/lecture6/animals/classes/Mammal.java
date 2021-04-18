package homework.lectures.lecture6.animals.classes;

import homework.lectures.lecture6.animals.Animal;

public abstract class Mammal extends Animal {

    protected String subclass;

    public Mammal(String name, String animalHabitat, String color, boolean isHaveFur, boolean isHaveFeather, double weight, String subclass) {
        super(name, animalHabitat, color, isHaveFur, isHaveFeather, weight);
        this.subclass = subclass;
    }

    public Mammal() {
    }


}
