package homework.lectures.lecture6.math.logic;

@FunctionalInterface
public interface MathOperation<Double> {

    Double compute(Double a, Double b);
}
