package homework.lectures.lecture6.animals;

import java.util.Objects;

public abstract class Animal {

    protected String name;
    protected String animalHabitat;
    protected String color;
    protected boolean isHaveFur;
    protected boolean isHaveFeather;
    protected double weight;

    public Animal(String name, String animalHabitat, String color, boolean isHaveFur, boolean isHaveFeather, double weight) {
        this.name = name;
        this.animalHabitat = animalHabitat;
        this.color = color;
        this.isHaveFur = isHaveFur;
        this.isHaveFeather = isHaveFeather;
        this.weight = weight;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalHabitat() {
        return animalHabitat;
    }

    public void setAnimalHabitat(String animalHabitat) {
        this.animalHabitat = animalHabitat;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isHaveFur() {
        return isHaveFur;
    }

    public void setHaveFur(boolean haveFur) {
        isHaveFur = haveFur;
    }

    public boolean isHaveFeather() {
        return isHaveFeather;
    }

    public void setHaveFeather(boolean haveFeather) {
        isHaveFeather = haveFeather;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return isHaveFur == animal.isHaveFur && isHaveFeather == animal.isHaveFeather && Double.compare(animal.weight, weight) == 0 && Objects.equals(name, animal.name) && Objects.equals(animalHabitat, animal.animalHabitat) && Objects.equals(color, animal.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, animalHabitat, color, isHaveFur, isHaveFeather, weight);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", animalHabitat='" + animalHabitat + '\'' +
                ", color='" + color + '\'' +
                ", isHaveFur=" + isHaveFur +
                ", isHaveFeather=" + isHaveFeather +
                ", weight=" + weight +
                '}';
    }
}
