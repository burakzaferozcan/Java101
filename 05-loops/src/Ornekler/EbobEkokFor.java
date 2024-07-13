package Ornekler;

import java.util.Scanner;

public class EbobEkokFor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("n1 sayısını giriniz : ");
        int n1 = input.nextInt();
        System.out.print("n2 sayısınız giriniz : ");
        int n2 = input.nextInt();
        int ebob = 0;
        for (int i = 1; i <= n1; i++) {
            if (n1 % i == 0 && n2 % i == 0) {
                System.out.println(i);
                ebob = i;
            }
        }
        int ekok = 0;
        System.out.println("EBOB : " + ebob);
        for (int i = 1; i <= (n1 * n2); i++) {
            if (i % n1 == 0 && i % n2 == 0) {
                ekok= i;
                break;
            }
        }
        System.out.println("EKOK : " +ekok);
    }
}
