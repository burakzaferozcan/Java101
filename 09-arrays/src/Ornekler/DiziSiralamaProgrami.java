package Ornekler;

import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralamaProgrami {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Dizinin boyutu n : ");
        int n = scanner.nextInt();

        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". Elemanı : ");
            list[i] = scanner.nextInt();
        }

        Arrays.sort(list);
        System.out.print("Sıralama : ");
        for (int i : list) {
            System.out.print(i + " ");
        }
    }
}
