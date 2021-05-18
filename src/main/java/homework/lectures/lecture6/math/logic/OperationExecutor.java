package homework.lectures.lecture6.math.logic;

import java.util.List;

public class OperationExecutor<T> {

    private final List<MathOperation<T>> operations;

    public OperationExecutor (List<MathOperation<T>> operations){
        this.operations =operations;
    }

    public void execute(T a,T b) {

        operations.forEach(el -> System.out.println(el.compute(a,b)));

    }
}
