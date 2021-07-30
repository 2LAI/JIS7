package homework.lectures.core.lecture6.animals.classes.objects;

import homework.lectures.core.lecture6.animals.behavior.CanWallOnTheGround;
import homework.lectures.core.lecture6.animals.Animal;

public class Ostrich extends Animal implements CanWallOnTheGround {

    public Ostrich(String name, String animalHabitat, String color, boolean isHaveFur, boolean isHaveFeather, double weight) {
        super(name, animalHabitat, color, isHaveFur, isHaveFeather, weight);
    }

    public Ostrich() {
    }

}
