package homework.lectures.lecture6.animals.classes.objects;

import homework.lectures.lecture6.animals.behavior.CanWallOnTheGround;
import homework.lectures.lecture6.animals.classes.Mammal;

import java.util.Objects;

public class Dog extends Mammal implements CanWallOnTheGround {

    private String breed;

    public void bark() {
        System.out.println("I can bark");
    }

    public Dog(String breed) {
        this.breed = breed;
    }

    public Dog() {
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
        Dog dog = (Dog) o;
        return Objects.equals(breed, dog.breed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), breed);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "breed='" + breed + '\'' +
                '}';
    }
}
