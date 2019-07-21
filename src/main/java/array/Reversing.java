package main.java.array;

import java.util.Arrays;

/**
 * @author Artem Esipovich 7/21/19
 */

public class Reversing {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(reverse(new int[]{1})));
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(reverse(new int[]{1, 2, 3, 4, 5, 6})));
    }

    private static int[] reverse(int[] sourceArray) {
        int leftIndex = 0;
        int rightIndex = sourceArray.length - 1;

        while (rightIndex > leftIndex) {
            swap(sourceArray, leftIndex, rightIndex);
            leftIndex++;
            rightIndex--;
        }
        return sourceArray;
    }

    private static void swap(int[] sourceArray, int leftIndex, int rightIndex) {
        int temp = sourceArray[leftIndex];
        sourceArray[leftIndex] = sourceArray[rightIndex];
        sourceArray[rightIndex] = temp;
    }
}
