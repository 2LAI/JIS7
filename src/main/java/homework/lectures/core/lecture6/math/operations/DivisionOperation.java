package homework.lectures.core.lecture6.math.operations;

import homework.lectures.core.lecture6.math.logic.MathOperation;

public class DivisionOperation implements MathOperation<Double> {

    @Override
    public Double compute(Double a, Double b) {
        return a / b;
    }
}
