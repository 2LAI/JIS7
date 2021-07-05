package homework.lectures.utils.functions;

public class ArrayGeneratorIntRandom {

    public static int[] arrayFilling(int n) {
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random()) * 100);
        }
        return array;
    }
}
