package homework.lectures.lecture6.animals.behavior;

public interface CanFly {

    default void thisAnimalCanFly() {
        System.out.println("I can fly. Really");
    }
}
