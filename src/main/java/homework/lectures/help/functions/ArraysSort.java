package homework.lectures.help.functions;

public class ArraysSort {

    public static int[] sortAscending(int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = array.length-1; i > 0; i--) {
                if (array[i] > array[i - 1]) {
                    swap(array, i, i - 1);
                    isSorted = false;
                }
            }
        }
        return array;
    }

    public static int[] sortDescending (int[] array) {
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int i = 1; i < array.length; i++) {
                if (array[i] < array[i - 1]) {
                    swap(array, i, i - 1);
                    isSorted = false;
                }
            }
        }
        return array;
    }

    private static void swap(int[] array, int ind1, int ind2) {
        int tmp = array[ind1];
        array[ind1] = array[ind2];
        array[ind2] = tmp;
    }

}
