package homework.lectures.lecture6.animals.demo;

import homework.lectures.lecture6.animals.Animal;
import homework.lectures.lecture6.animals.classes.objects.Cat;

public class AnimalsDemo {

    public static void main(String[] args) {
        Animal animal = createCat();
        System.out.println(animal);
    }

    private static Animal createCat() {
        var cat = new Cat("Musia", "Everywhere", "Gray", true, false, 1.4, "viviparous", "Pers");
        System.out.println("I am a cat and I am a mammal");
        cat.meow();
        cat.eating();
        cat.breathe();
        cat.reproduce();
        cat.thisAnimalCanWallOnTheGround();
        return cat;
    }
}
