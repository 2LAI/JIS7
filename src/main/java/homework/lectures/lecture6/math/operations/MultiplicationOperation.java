package homework.lectures.lecture6.math.operations;

import homework.lectures.lecture6.math.logic.MathOperation;

public class MultiplicationOperation implements MathOperation<Double> {

    @Override
    public Double compute(Double a, Double b) {
        return a * b;
    }
}
