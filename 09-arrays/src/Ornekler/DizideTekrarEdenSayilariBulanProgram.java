package Ornekler;

import java.util.Arrays;

public class DizideTekrarEdenSayilariBulanProgram {
    static boolean isFind(int[] arr, int value, int length) {
        for (int i = 0; i < length; i++) {
            if (arr[i] == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {3, 7, 3, 3, 2, 9, 0, 0, 10, 21, 1, 33, 9, 1};
        int[] duplicate = new int[list.length];
        int startIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(duplicate, list[i], startIndex)) {
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }

        int[] result = new int[startIndex];
        for (int i = 0; i < startIndex; i++) {
            result[i] = duplicate[i];
        }

        System.out.println("Tekrar eden sayılar : " + Arrays.toString(result));
    }
}
