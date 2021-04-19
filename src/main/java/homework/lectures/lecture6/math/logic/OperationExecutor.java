package homework.lectures.lecture6.math.logic;

public class OperationExecutor {

    public void execute(MathOperation[] operations, Double a, Double b) {

        for (MathOperation numbers : operations) {
            System.out.println(numbers.compute(a,b));
        }
    }
}
