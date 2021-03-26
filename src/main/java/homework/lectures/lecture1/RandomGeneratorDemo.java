package homework.lectures.lecture1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class RandomGeneratorDemo {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Сколько чисел сгенерировать?: ");
        int n = Integer.parseInt(reader.readLine());
        arrayGeneratorMath(n);
        arrayGeneratorRandom(n);
    }

    private static void arrayGeneratorMath(int n) {
        System.out.println("Генератор класса Math:");
        int[] array = new int[n];
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random()) * 100);
            System.out.println(array[i]);
            sum = sum + array[i];
        }
        System.out.println("Сумма всех чисел: " + sum);
    }

    private static void arrayGeneratorRandom(int n) {
        System.out.println("\nГенератор класса Random:");
        int[] array = new int[n];
        int sum = 0;
        Random randomGenerator = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = randomGenerator.nextInt(100);
            System.out.println(array[i]);
            sum = sum + array[i];
        }
        System.out.println("Сумма всех чисел: " + sum);
    }
}
