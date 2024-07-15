package Ornekler;

public class DizidekiMaxVeMinDegerBulanProgram {
    public static void main(String[] args) {
        int[] list = {56, 34, 1, 8, 101, -2, -33};
        int min = list[0];
        int max = list[0];
        for (int i : list) {
            if (i > max) {
                max = i;
            }
            if (i < min) {
                min = i;
            }
        }
        System.out.println("minimum : " + min);
        System.out.println("minimum : " + max);
    }
}
