package Ornekler;

public class DizidekiElemanlarinOrtalamasiniBulanProgram {
    public static void main(String[] args) {
        int[] list = {15, 6, 7, 12, 7, 9, 3};
        double average = 0.0;
        double sum = 0.0;
        for (int i : list) {
            sum += i;
        }
        average = sum / list.length;
        System.out.println("dizinin ortalamasi : " + average);

    }
}
