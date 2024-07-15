package Konular.ArraySinifiVeMetotlari;

public class HelperArray {
    static void print(int[] arr) {
        System.out.print("[");
        for (int i : arr) {
            if (i == arr.length) {
                System.out.print(i);
            } else {
                System.out.print(i + ", ");

            }
        }
        System.out.print("]");
        System.out.println("\n----------------------");
    }
}
