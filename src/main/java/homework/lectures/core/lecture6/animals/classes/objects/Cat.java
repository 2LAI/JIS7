package homework.lectures.core.lecture6.animals.classes.objects;

import homework.lectures.core.lecture6.animals.behavior.AllAnimalsCan;
import homework.lectures.core.lecture6.animals.behavior.CanWallOnTheGround;
import homework.lectures.core.lecture6.animals.classes.Mammal;

import java.util.Objects;

public class Cat extends Mammal implements AllAnimalsCan, CanWallOnTheGround {
    private String breed;

    public void meow() {
        System.out.println("I can meow");
    }

    @Override
    public void eating() {
        System.out.println("I like to eat cat food");
    }

    @Override
    public void breathe() {
        System.out.println("The respiratory system of mammals consists of the airways and lungs");
    }

    @Override
    public void reproduce() {
        System.out.println("Mammals are dioecious. The reproductive system " +
                "is formed by paired testes in males and ovaries in females.");
    }

    public Cat(String name, String animalHabitat, String color, boolean isHaveFur, boolean isHaveFeather, double weight, String subclass, String breed) {
        super(name, animalHabitat, color, isHaveFur, isHaveFeather, weight, subclass);
        this.breed = breed;
    }

    public Cat() {
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Cat cat = (Cat) o;
        return Objects.equals(breed, cat.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", animalHabitat='" + animalHabitat + '\'' +
                ", color='" + color + '\'' +
                ", isHaveFur=" + isHaveFur +
                ", isHaveFeather=" + isHaveFeather +
                ", weight=" + weight +
                ", subclass='" + subclass + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}
