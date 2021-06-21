package homework.lectures.streams.task1;

import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStreamDemo {

    private static final Logger log = Logger.getLogger(SimpleStreamDemo.class);

    public static void main(String[] args) {
        var generatedNumbers = generateNumbers(100);
        var filteredNumbers = filterNumbers(generatedNumbers);
        log.info(filteredNumbers);
    }

    private static Collection<Integer> filterNumbers(Collection<Integer> generatedNumbers) {
        return generatedNumbers.stream().
                filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

    private static Collection<Integer> generateNumbers(int numberOfValues) {
        var generatedList = new ArrayList<Integer>();
        for (int i = 0; i < numberOfValues; i++) {
            generatedList.add((int) ((Math.random()) * 100));
        }
        return generatedList;
    }
}
