package Ornekler;

import java.util.Arrays;

public class ElemanFrekanslariniBulma {

    public static void main(String[] args) {
        int[] array = {10, 20, 20, 10, 5, 20, 7, 10, 9, 18, 20, 27};
        System.out.println("Dizinin elemanları : " + Arrays.toString(array));
        int n = array.length;

        boolean[] counted = new boolean[n];

        System.out.println("Tekrar Sayıları:");
        for (int i = 0; i < n; i++) {
            if (!counted[i]) {
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (array[i] == array[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
                System.out.println(array[i] + " sayısı " + count + " kere tekrar edildi.");
            }
        }
    }
}
