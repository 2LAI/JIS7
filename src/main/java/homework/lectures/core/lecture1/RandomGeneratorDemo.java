package homework.lectures.core.lecture1;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RandomGeneratorDemo {
    private static final Logger log = Logger.getLogger(MathOperationsDemo.class);
    static int generatedNumbers;

    public static void main(String[] args) throws IOException {
        numberOfGeneratedNumbers();
        arrayGeneratorMath(generatedNumbers);
        arrayGeneratorRandom(generatedNumbers);
    }

    private static void numberOfGeneratedNumbers() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        log.info("Сколько чисел сгенерировать?: ");
        generatedNumbers = Integer.parseInt(reader.readLine());
    }

    private static void arrayGeneratorMath(int n) {
        log.info("Генератор класса Math:");
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random()) * 100);
            System.out.println(array[i]);
            sum = sum + array[i];
        }
        log.info("Сумма всех чисел: " + sum);
    }

    private static void arrayGeneratorRandom(int n) {
        log.info("\nГенератор класса Random:");
        int[] array = new int[n];
        int sum = 0;
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(100);
            System.out.println(array[i]);
            sum = sum + array[i];
        }
        log.info("Сумма всех чисел: " + sum);
    }
}
