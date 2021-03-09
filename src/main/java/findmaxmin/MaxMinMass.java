package findmaxmin;

import java.util.Arrays;

public class MaxMinMass {
    public static void main(String[] args) {

        int minPlus = 0, maxMinus = 0;
        int minPlusIndex = 0, maxMinusIndex = 0;
        int[] array = fillMass(-10, 10, 20);
        System.out.println(Arrays.toString(array));

        // Поиск максимального отрицательного и минимального положительного
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0 && (maxMinus == 0 || array[i] > maxMinus)) {
                maxMinus = array[i];
                maxMinusIndex = i;
            }
            if (array[i] > 0 && (minPlus == 0 || array[i] < minPlus)) {
                minPlus = array[i];
                minPlusIndex = i;
            }
        }
        System.out.println("maxMinus = " + maxMinus + " Index = " + maxMinusIndex);
        System.out.println("minPlus = " + minPlus + " Index = " + minPlusIndex);
        // Замена
        array[maxMinusIndex] = minPlus;
        array[minPlusIndex] = maxMinus;

        System.out.println(Arrays.toString(array));
    }

    /**
     * @param minNumber start range
     * @param maxNumber end range
     * @param size      array length
     * @return array
     */
    public static int[] fillMass(int minNumber, int maxNumber, int size) {
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = minNumber + (int) (Math.random() * ((maxNumber - minNumber) + 1));
        }
        return array;
    }
}
