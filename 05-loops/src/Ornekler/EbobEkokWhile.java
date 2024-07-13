package Ornekler;

import java.util.Scanner;

public class EbobEkokWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısını giriniz : ");
        int n2 = input.nextInt();

        // EBOB Hesaplama
        int a = n1;
        int b = n2;
        int ebob = 1;
        int i = 1;

        while (i <= a && i <= b) {
            if (a % i == 0 && b % i == 0) {
                ebob = i;
            }
            i++;
        }

        // EKOK Hesaplama
        int ekok = (n1 > n2) ? n1 : n2;

        while (ekok % n1 != 0 || ekok % n2 != 0) {
            ekok++;
        }

        System.out.println("EBOB : " + ebob);
        System.out.println("EKOK : " + ekok);
    }
}
