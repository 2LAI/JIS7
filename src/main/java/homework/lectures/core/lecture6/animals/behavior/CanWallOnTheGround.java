package homework.lectures.core.lecture6.animals.behavior;

public interface CanWallOnTheGround {

    default void thisAnimalCanWallOnTheGround() {
        System.out.println("I can wall on the ground");
    }
}
