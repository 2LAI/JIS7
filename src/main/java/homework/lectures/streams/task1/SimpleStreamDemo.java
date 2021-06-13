package homework.lectures.streams.task1;

import homework.lectures.lecture5.task1.ProductDemo;
import org.apache.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SimpleStreamDemo {

    private static final Logger log = Logger.getLogger(SimpleStreamDemo.class);


    public static void main(String[] args) {
        ArrayList<Integer> generatedNumbers = generateNumbers(100);
        List<Integer> filteredNumbers = filterNumbers(generatedNumbers);
        log.info(filteredNumbers);
    }

    private static List<Integer> filterNumbers(ArrayList<Integer> generatedNumbers) {

        return generatedNumbers.stream().
                filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
    }

    private static ArrayList<Integer> generateNumbers(int numberOfValues) {
        var generatedList = new ArrayList<Integer>();
        for (int i = 0; i < numberOfValues; i++) {
            generatedList.add((int) ((Math.random()) * 100));
        }
        return generatedList;
    }
}
