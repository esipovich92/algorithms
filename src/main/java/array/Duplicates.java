package main.java.array;

/**
 * @author Artem Esipovich 7/21/19
 *
 * if all elements of an array are less than its length
 */

public class Duplicates {

    public static void main(String[] args) {
        System.out.println(containsDuplicates(new int[]{0, 1, 2, 3, 4}));
        System.out.println(containsDuplicates(new int[]{1, 2, 3, 4, 0}));
        System.out.println(containsDuplicates(new int[]{1, 2, 2, 0}));
    }

    private static boolean containsDuplicates(int[] array) {

        for (int i = 0; i < array.length; i++) {
            int index = Math.abs(array[i]);
            int element = array[index];
            if (element >= 0) {
                array[index] = -element;
            } else {
                return true;
            }
        }
        return false;
    }
}
