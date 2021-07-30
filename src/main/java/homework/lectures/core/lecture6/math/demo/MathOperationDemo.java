package homework.lectures.core.lecture6.math.demo;

import homework.lectures.core.lecture6.math.logic.MathOperation;
import homework.lectures.core.lecture6.math.logic.OperationExecutor;
import homework.lectures.core.lecture6.math.operations.AdditionOperation;
import homework.lectures.core.lecture6.math.operations.SubtractionOperation;

import java.util.Arrays;
import java.util.List;

public class MathOperationDemo {
    public static void main(String[] args) {

        divisionDemo();
        lamdaFun();
        classicRealization(Arrays.asList(new AdditionOperation(), new SubtractionOperation()));
    }

    private static void divisionDemo() {
        MathOperation<Double> operation = (a, b) -> a * b;
        System.out.println(operation.compute(5.0, 3.0));
    }

//    private static void classicRealization() {
//        OperationExecutor executor = new OperationExecutor();
//        MathOperation[] ops = {new AdditionOperation(), new SubtractionOperation()};
//        executor.execute(ops, 5.0, 3.0); //8, 2
//    }

    private static void classicRealization(final List operations) {
        var executor = new OperationExecutor<Double>(operations);
        executor.execute(5.0, 3.0);
    }

    private static void lamdaFun() {
        MathOperation<Double> operation = (a, b) -> a - b;
        System.out.println(operation.compute(5.0, 3.0));
    }
}
