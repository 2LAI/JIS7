package homework.lectures.lecture2;

import org.apache.log4j.Logger;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArrayLikeList {
    private static final Logger log = Logger.getLogger(ArrayLikeList.class);

    public static void main(String[] args) throws IOException {
        int[] array = new int[5];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        log.info("Введите число: ");
        int number = Integer.parseInt(reader.readLine());
        arrayExtension(number, array);
    }

    private static void arrayExtension(int number, int[] array) {

        if (number >= array.length) {
            int[] array2 = new int[number + number / 2];
            arrayNumberFilling(number, array2);
            log.info("Полученный массив: " + Arrays.toString(array2));
        } else {
            arrayNumberFilling(number, array);
            log.info("Полученный массив: " + Arrays.toString(array));
        }
    }

    private static void arrayNumberFilling(int number, int[] array) {
        for (int i = 0; i < number; i++) {
            array[i] = (int) ((Math.random()) * 100);
        }
    }
}