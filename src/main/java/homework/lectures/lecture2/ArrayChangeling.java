package homework.lectures.lecture2;

import homework.lectures.help.functions.ArrayGeneratorIntRandom;
import homework.lectures.help.functions.ArraysSort;

import java.util.Arrays;

import org.apache.log4j.Logger;
import org.apache.maven.surefire.shade.org.apache.commons.lang3.ArrayUtils;

public class ArrayChangeling {
    private static final Logger log = Logger.getLogger(ArrayChangeling.class);

    public static void main(String[] args) {
        int[] array1 = ArrayGeneratorIntRandom.arrayFilling(5);
        Arrays.sort(array1);
        int[] array2 = arrayReverse(array1);
        arrayMerge(array1, array2);
    }

    public static int[] arrayReverse(int[] array) {
        int[] arrayReversed = array.clone();
        ArraysSort.sortAscending(arrayReversed);
        return arrayReversed;
    }

    private static void arrayMerge(int[] array1, int[] array2) {
        int[] array3 = ArrayUtils.addAll(array1, array2);
        log.info("Полученный массив: " + Arrays.toString(array3));
    }

}
